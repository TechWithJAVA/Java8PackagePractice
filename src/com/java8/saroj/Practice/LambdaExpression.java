package com.java8.saroj.Practice;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {

	
	public static void main(String[] args) {
		
		//A method with no parameter
	  /*MyFunctionalInterface mi=()->{return "Hello";};
	   System.out.println(mi.message());*/
		//A method with one parameter
		/*MyFunctionalInterface ms=(num)->num*5;
		System.out.println(ms.message(20));*/
		
		//A method with multiple parameter
		
		FuctionalInterface fi=(a,b)->a+b;
        System.out.println(fi.add(20, 50));		
        
        //Iterating Collection using forEach()
        List<String> list=new ArrayList<String>();  
        list.add("Rick");         
        list.add("Negan");       
        list.add("Daryl");         
        list.add("Glenn");         
        list.add("Carl");
        
        list.forEach(System.out::println);
		
	}
}
