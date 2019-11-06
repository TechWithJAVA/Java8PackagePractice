package com.java8.saroj.Practice;

import java.util.ArrayList;
import java.util.List;


public class ParallelStreamDemo {

	
	public static void main(String[] args) {
		
		long t1, t2;
        List<EmployeeList> eList = new ArrayList<EmployeeList>();
        
        for(int i=0; i<100; i++) {
            eList.add(new EmployeeList("A", 20000));
            eList.add(new EmployeeList("B", 3000));
            eList.add(new EmployeeList("C", 15002));
            eList.add(new EmployeeList("D", 7856)); 
            eList.add(new EmployeeList("E", 200)); 
            eList.add(new EmployeeList("F", 50000));
        }
 
        /***** Here We Are Creating A 'Sequential Stream' & Displaying The Result *****/
        t1 = System.currentTimeMillis();   
        System.out.println("Sequential Stream Count?= " + eList.stream().filter(e -> e.getSalary() > 15000).count());
 
        t2 = System.currentTimeMillis();
        System.out.println("Sequential Stream Time Taken?= " + (t2-t1) + "\n");
 
        /***** Here We Are Creating A 'Parallel Stream' & Displaying The Result *****/
        t1 = System.currentTimeMillis();        
        System.out.println("Parallel Stream Count?= " + eList.parallelStream().filter(e -> e.getSalary() > 15000).count());
 
        t2 = System.currentTimeMillis();
        System.out.println("Parallel Stream Time Taken?= " + (t2-t1));
	}
}
