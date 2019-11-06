package com.java8.saroj.Practice;

import java.util.Arrays;
import java.util.function.BiFunction;

public class MyExample {

	public void display(){  
		System.out.println("Hi!!!!!!!");
		
	    } 
	public static void main(String[] args) {
			
		//TestReference tr=MethodReferenceWithConstuctor::new;
		//tr.display("Hello World !");
		
		//Method reference to an instance method of an arbitrary object of a particular type
			
		String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
		/* Method reference to an instance method of an arbitrary 
		 * object of a particular type
		 */
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		for(String str: stringArray){
			System.out.println(str);
		}
		
		//Method reference to a static method of a class
		
		BiFunction<Integer, Integer, Integer> product =MethodReferenceWithConstuctor::multiply;
		int pr = product.apply(11, 5);  
		System.out.println("Product of given number is: "+pr);  
		
		MyExample ex=new MyExample();
		TestReference rt=ex::display;
		rt.display();
		
		
	}
}
