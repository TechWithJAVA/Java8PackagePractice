package com.java8.saroj;

import java.util.StringJoiner;

public class StringJoinerEx {

	
	public static void main(String[] args) {
		
		StringJoiner stj=new StringJoiner(",");
		stj.add("sdfd");
		stj.add("George").add("Sally").add("Fred");
		System.out.println(stj.toString());
		StringJoiner sj = new StringJoiner(":", "[", "]");
		 sj.add("George").add("Sally").add("Fred");
		System.out.println( sj.toString());
	}
}
