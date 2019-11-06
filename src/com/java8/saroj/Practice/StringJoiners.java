package com.java8.saroj.Practice;

import java.util.StringJoiner;

public class StringJoiners {

	
	public static void main(String[] args) {
		
		StringJoiner s=new StringJoiner("-");
		s.add("dasf");
		s.add("fdf");
		s.add("fdsg");
		s.add("dhfgh");
		System.out.println(s);
		
		StringJoiner s1=new StringJoiner(",","(", ")");
		s1.add("gfg");
		s1.add("hgjf");
		s1.add("kjuyk");
		s1.add("tyuiti");
		
		System.out.println(s1);
		System.out.println(s1.merge(s));
		
		StringJoiner mystring = new StringJoiner(","); 
		
		mystring.setEmptyValue("The default String");
		System.out.println(mystring);
		
		 // Adding strings to StringJoiner  
        mystring.add("Apple");  
        mystring.add("Banana"); 
        mystring.add("Orange");
        mystring.add("Kiwi");
        mystring.add("Grapes");
        System.out.println(mystring);  
		 int length = mystring.length();  
	     System.out.println("Length of the StringJoiner: "+length); 
	     
	     /* The toString() method is used for converting a StringJoiner
	         *  instance to a String. 
	         */
	        String ss = mystring.toString();  
	        System.out.println(ss);  
	}
}
