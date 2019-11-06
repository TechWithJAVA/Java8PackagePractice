package com.java8.saroj;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Streams {
public static void main(String[] args) {
	List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
	List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
    System.out.println(filtered);
    
    Random random = new Random();
    random.ints().limit(10).forEach(System.out::println);
    
    List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

  //get list of unique squares
  List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
  System.out.println(squaresList);
  
  List<String> stringcount = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

//get count of empty string
  long counts = stringcount.stream().filter(string -> string.isEmpty()).count();
    System.out.println(counts);
    Random random1 = new Random();
    random1.ints().limit(10).sorted().forEach(System.out::println);
    
    //Parallel Processing

    List<String> stringsp = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

  //get count of empty string
  long countp = stringsp.parallelStream().filter(string -> string.isEmpty()).count();
  System.out.println(countp);
  
  //Collectors
  List<String>stringsc = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
  List<String> filteredc = stringsc.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

  System.out.println("Filtered List: " + filteredc);
  String mergedString = stringsc.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
  System.out.println("Merged String: " + mergedString);
  
  //Statistics
  List<Integer> n = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

  IntSummaryStatistics stats1 = n.stream().mapToInt((x)->x).summaryStatistics();

  System.out.println("Highest number in List : " + stats1.getMax());
  System.out.println("Lowest number in List : " + stats1.getMin());
  System.out.println("Sum of all numbers : " + stats1.getSum());
  System.out.println("Average of all numbers : " + stats1.getAverage());
  
  
  List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
	IntSummaryStatistics stats = nums.stream()
									.mapToInt(Integer::intValue)
									.summaryStatistics();
	System.out.println(stats);

	System.out.println("Max is " + stats.getMax());
	System.out.println("Min is " + stats.getMin());
	System.out.println("Average is " + stats.getAverage());
	System.out.println("Count is " + stats.getCount());
	System.out.println("Sum is " + stats.getSum());
}
}
