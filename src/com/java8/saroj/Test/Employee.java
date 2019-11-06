package com.java8.saroj.Test;

public class Employee {

	private int empId;
	
	private String empName;
	
	private int salary;
	
	private Department departmant;

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getDepartmant() {
		return departmant;
	}

	public void setDepartmant(Department departmant) {
		this.departmant = departmant;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", departmant=" + departmant
				+ "]";
	}
	
}
