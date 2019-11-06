package com.java8.saroj.Practice;

public class EmployeeList {

	
	private String name;
	private int salary;
	public EmployeeList(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
