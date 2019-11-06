package com.java8.saroj;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MethodReference {
	public static void main(String[] args) {
		 List<String> names=new ArrayList<>();
		  names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
	            
	     // names.forEach(System.out::println);
	      String s=4+3+"saroj";
	     // System.out.println(s);
	      List<Integer> integers = IntStream
	                .range(1, 100)
	                .boxed()
	                .collect(Collectors.toCollection( ArrayList::new ));
	      System.out.println(integers);
	}
	
	 
}
