package com.java8.saroj.Practice;

public class TestDefault implements FirstInterface, SecondInterface{

	

	@Override
	public void existingMethod() {
		System.out.println("Second Interface Existing Method");
		
	}

	@Override
	public void display() {
		System.out.println("First Interface Display Method");
		
	}
	

	@Override
	public void message() {
		System.out.println("Implementation of default method");
		FirstInterface.super.message();
		SecondInterface.super.message();
		
	}

	public static void main(String[] args) {
		TestDefault td=new TestDefault();
		td.message();
		
		td.display();
		td.existingMethod();
		
		FirstInterface.anotherNewMethod();
	}
}
