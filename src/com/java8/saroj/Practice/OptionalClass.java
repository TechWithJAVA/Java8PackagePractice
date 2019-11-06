package com.java8.saroj.Practice;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		
		String[] words=new String[8];
		//String word=words[5].toUpperCase();//Exception in thread "main" java.lang.NullPointerException
		//System.out.println(word);
		Optional<String> op=Optional.ofNullable(words[5]);
		if(op.isPresent()) {
			String wordo=words[5].toUpperCase();
			System.out.println(wordo);
		}else
			System.out.println("word is null");
		
		 String[] str = new String[5]; 
		// Setting value for 2nd index 
        str[2] = "Geeks Classes are coming soon"; 
        
        // It returns an empty instance of Optional class 
        Optional<String> empty = Optional.empty(); 
        System.out.println(empty);
  
        // It returns a non-empty Optional 
        Optional<String> value = Optional.of(str[2]); 
        
        // It returns value of an Optional. 
        // If value is not present, it throws 
        // an NoSuchElementException 
        System.out.println(value.get()); 
        // It returns hashCode of the value 
        System.out.println(value.hashCode()); 
        
        // It returns true if value is present, 
        // otherwise false 
        System.out.println(value.isPresent()); 
        
	}
}
