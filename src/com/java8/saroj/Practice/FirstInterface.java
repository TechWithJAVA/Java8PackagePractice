package com.java8.saroj.Practice;

public interface FirstInterface {

	default void message() {
		System.out.println("First Interface");
	}
	
	void display();
	
	 static void anotherNewMethod(){
	    	System.out.println("Newly added static method");
	    }
}
