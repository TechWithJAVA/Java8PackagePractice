package com.java8.saroj.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {

	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");
		
		//Creating the stream of all names
		Stream<String> allNames=names.stream();
		
		//Creating another stream by filtering long names using filter()
		Stream<String> longNames=allNames.filter(str->str.length()>6);
		
		//displaying the long names
		longNames.forEach(str->System.out.println(str));
		
		 List<String> longnames = names.stream()    // converting the list to stream
	                .filter(str -> str.length() > 6 && str.length()<8)   // filter the stream to create a new stream
	                .collect(Collectors.toList());  // collect the final stream and convert it to a List

	        longnames.forEach(System.out::println);     
	        
	      //  Stream filter() and map() method in Java
	        
	        List<Integer> num = Arrays.asList(1,2,3,4,5,6);
	        List<Integer> squares=num.stream().map(n->n*n).collect(Collectors.toList());
	        
	        System.out.println(squares);
	}
}
