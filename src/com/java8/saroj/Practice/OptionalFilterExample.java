package com.java8.saroj.Practice;

import java.util.Optional;

public class OptionalFilterExample {

	 public static void main(String[] args) {

	        Optional<String> gender = Optional.of("MALE");
	        Optional<String> emptyGender = Optional.empty();

	        //Filter on Optional
	        System.out.println(gender.filter(g -> g.equals("male"))); //Optional.empty
	        System.out.println(gender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional[MALE]
	        System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional.empty

	        
	        if (gender.isPresent()) {
	            System.out.println("Value available.");
	        } else {
	            System.out.println("Value not available.");
	        }

	        gender.ifPresent(g -> System.out.println("In gender Option, value available."));

	        //condition failed, no output print
	        emptyGender.ifPresent(g -> System.out.println("In emptyGender Option, value available."));
	   
	 
	        System.out.println(gender.orElse("<N/A>")); //MALE
	        System.out.println(emptyGender.orElse("<N/A>")); //<N/A>

	        System.out.println(gender.orElseGet(() -> "<N/A>")); //MALE
	        System.out.println(emptyGender.orElseGet(() -> "<N/A>")); //<N/A>
	 
	 }
}
