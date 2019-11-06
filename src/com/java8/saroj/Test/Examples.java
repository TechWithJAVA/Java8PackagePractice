package com.java8.saroj.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Examples {

	public static void main(String[] args) {
		
		List<Employee> employees=new ArrayList<>();
		Employee e=new Employee();
		e.setEmpId(1);
		e.setEmpName("A");
		e.setSalary(100);
		Department departmant=new Department();
		departmant.setDeptName("IT");
		e.setDepartmant(departmant);
		
		Employee e1=new Employee();
		e1.setEmpId(5);
		e1.setEmpName("E");
		e1.setSalary(500);
		Department departmant1=new Department();
		departmant1.setDeptName("Dev");
		e1.setDepartmant(departmant1);
		
		Employee e2=new Employee();
		e2.setEmpId(2);
		e2.setEmpName("F");
		e2.setSalary(300);
		Department departmant2=new Department();
		departmant2.setDeptName("Prod");
		e2.setDepartmant(departmant2);
		
		Employee e3=new Employee();
		e3.setEmpId(7);
		e3.setEmpName("G");
		e3.setSalary(400);
		Department departmant3=new Department();
		departmant3.setDeptName("Dev");
		e3.setDepartmant(departmant3);
		
		employees.add(e);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		// Compute sum of salaries of employee
		
	     int total = employees.stream()
	                          .collect(Collectors.summingInt(Employee::getSalary));
	     System.out.println(total);
	     
	  // Compute sum of salaries by department
	     Map<Department, Integer> totalByDept
	         = employees.stream()
	                    .collect(Collectors.groupingBy(Employee::getDepartmant,
	                                                   Collectors.summingInt(Employee::getSalary)));
	     System.out.println(totalByDept);
	     
	     //sorting Order Of Object
	     employees.forEach(x->System.out.println(x));
	     System.out.println("********After Sorting by EmpId************");
	     employees.sort((Employee e4,Employee e5)->e4.getEmpId()-e5.getEmpId());
	    
	     employees.forEach(x->System.out.println(x));
	     
	     System.out.println("********After Sorting by EmpSalary************");
	     employees.sort((Employee e4,Employee e5)->e4.getSalary()-e5.getSalary());
	     employees.forEach(x->System.out.println(x));
	     
	     System.out.println("********After Sorting by EmpName************");
	     employees.sort((Employee e4,Employee e5)->e4.getEmpName().compareTo(e5.getEmpName()));
	     employees.forEach(x->System.out.println(x));
	     
	     System.out.println("********After Sorting by DeptName************");
	     employees.sort((Employee e4,Employee e5)->e4.getDepartmant().getDeptName().compareTo(e5.getDepartmant().getDeptName()));
	     employees.forEach(x->System.out.println(x));
	     System.out.println("********After Sorting by EmpId and Salary************");
	     employees.sort(Comparator.comparing(Employee::getEmpId)
                 .reversed()
                 .thenComparing(Comparator.comparing(Employee::getSalary)
                 .reversed()));
	     employees.forEach(x->System.out.println(x));

	     System.out.println("********After Sorting by EmpName and DeptName************");
	     
	     Comparator<Employee> compareByName = Comparator
                 .comparing(Employee::getEmpName)
                 .thenComparing((Employee e4,Employee e5)->e4.getDepartmant().getDeptName().compareTo(e5.getDepartmant().getDeptName()));
	     
	     List<Employee> sortedEmployees = employees.stream()
                 .sorted(compareByName)
                 .collect(Collectors.toList());
	     sortedEmployees.forEach(System.out::println);
	   
	     
	     Map<String, Integer> map = new HashMap<String, Integer>();
	     Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
	     map.put("a", 21);
	     map.put("b", 10);
	     map.put("c", 12);
	     map.put("d", 21);
	    
	     System.out.println(map);
	     map.entrySet().stream().sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue())).map(e9 -> e9.getKey()).collect(Collectors.toList()).forEach(k -> sortedMap.put(k, map.get(k)));
	     System.out.println(sortedMap);
	     
	}
}
