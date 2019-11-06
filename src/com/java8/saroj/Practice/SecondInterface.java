package com.java8.saroj.Practice;

public interface SecondInterface {

	default void message() {
		System.out.println("Second Interface");
	}
	
	void existingMethod();
}
