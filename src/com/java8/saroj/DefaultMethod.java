package com.java8.saroj;

public interface DefaultMethod {

	default void print() {
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
	
	static void prints() {
		for(int i=10;i>5;i--) {
			System.out.println(i);
		}
	} 
	
}
