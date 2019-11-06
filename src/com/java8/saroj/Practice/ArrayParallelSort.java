package com.java8.saroj.Practice;

import java.util.Arrays;

public class ArrayParallelSort {

	public static void main(String[] args) {
		
		int numbers[] = {22, 89, 1, 32, 19, 5};
		
		Arrays.parallelSort(numbers);
		
		Arrays.stream(numbers).forEach(n->System.out.print(n+" "));
		
		Arrays.parallelSort(numbers, 1, 5);
		System.out.println("\n");
		Arrays.stream(numbers).forEach(n->System.out.print(n+" "));
		
	}
}
