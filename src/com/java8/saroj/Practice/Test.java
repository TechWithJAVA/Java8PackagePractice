package com.java8.saroj.Practice;

import java.util.function.IntBinaryOperator;

public class Test {

	public static void main(String[] args) {
		
		FuctionalInterface sum=(a,b)->a+b;
		System.out.println("Result: "+sum.add(100,23));
		
		
		//Predefined Functional Interface
		
        IntBinaryOperator sum1=(a,b)->a+b;
		System.out.println("Result: "+sum1.applyAsInt(100,25));
		
		//Here run() is single abstract method
		//using Anonymous class
		Runnable r=new Runnable() {
			public void run() {
				System.out.println("implements Run method");
			}
		} ;
		Thread t=new Thread(r);
		t.start();
		//using Lambda Expression
		Runnable r1=()->System.out.println("implements Run method");
		Thread t1=new Thread(r1);
		t1.start();
		
		
	}
}
