package com.java8.saroj.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Negan");
		names.add("Aditya");
		names.add("Steve");
		
		//Using Stream and Lambda expression
		long count = names.stream().filter(str->str.length()<6).count();
		
		System.out.println(count);
		
		Stream.iterate(1,counts->counts+1)
		      .filter(number->number%3==0)
		      .limit(6)
		      .forEach(x->System.out.println(x));
		
		//list 1
		List<String> alphabets = Arrays.asList("A","B","C");
		//list 2
		List<String> namealls = Arrays.asList("Sansa","Jon","Arya");
			
		//creating two streams from the two lists and concatenating them into one
		Stream<String> opstream = Stream.concat(alphabets.stream(), namealls.stream());
			
		//displaying the elements of the concatenated stream
		opstream.forEach(str->System.out.print(str+" "));
		
		//allMatch Example
		
		  Predicate<Student> p1 = s -> s.stuName.startsWith("A");
	      Predicate<Student> p2 = s -> s.stuAge < 40; 
	      Predicate<Student> p3 = s -> s.stuAge < 40 && s.stuName.startsWith("P");
	      
	      Predicate<Student> p4 = s -> s.stuName.startsWith("L"); 
	      Predicate<Student> p5 = s -> s.stuAge < 28 && s.stuName.startsWith("P"); 
	       
	      Predicate<Student> p6 = s -> s.stuName.startsWith("S");
	      Predicate<Student> p7 = s -> s.stuAge < 28 && s.stuName.startsWith("Z");      
	      List<Student> list = Student.getStudents();
	      
	      /* allMatch() method returns true if all the elements of stream satisfy the 
	       * given predicate, else it returns false 
	       */ 

	      /* This will return false because all student names do not start with "A"  
	       */ 
	      boolean b1 = list.stream().allMatch(p1); 
	      System.out.println("list.stream().allMatch(p1): "+b1); 
	      
	      /* This will return true because all students have age less than 40  
	       */ 
	      boolean b2 = list.stream().allMatch(p2); 
	      System.out.println("list.stream().allMatch(p2): "+b2); 
	      
	      /* This will return false because all the students do not satisfy the predicate: 
	       * Age must be less than 40 and name starts with letter "P" 
	       */ 
	      boolean b3 = list.stream().allMatch(p3); 
	      System.out.println("list.stream().allMatch(p3): "+b3);
	      
	      //noneMatch() example
	      
	       
	       /* noneMatch() method returns true if none of the stream elements matches
	        * the given predicate
	        */
	       /* This will return false because there is a element in the stream that
	        * matches the condition specified in the predicate p1. 
	        * Condition: Student Name should start with letter "L"
	        * Stream element matched: Lucy 
	        */
	       boolean b4 = list.stream().noneMatch(p4); 
	       System.out.println("list.stream().noneMatch(p1): "+b4); 
	 
	       /* This will return true because none of the elements  
	        * matches the condition specified in the predicate p2.  
	        * Condition: Student Name should start with letter "P" and age must be <28 
	        * Stream element matched: none 
	        */
	       boolean b5 = list.stream().noneMatch(p5); 
	       System.out.println("list.stream().noneMatch(p2): "+b5); 
	       
	       //anyMatch() example
	       
	       /* anyMatch() method checks whether any Stream element matches
	        * the specified predicate
	        */
	       boolean b6 = list.stream().anyMatch(p6);
	       System.out.println(b6);
	       boolean b7 = list.stream().anyMatch(p7);
	       System.out.println(b7);
	   
	}
	
}
