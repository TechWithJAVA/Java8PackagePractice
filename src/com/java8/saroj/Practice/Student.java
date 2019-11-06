package com.java8.saroj.Practice;

import java.util.ArrayList;
import java.util.List;

public class Student {

	
	 int stuId;
	
	 String stuName;
	
	 int stuAge;

	public Student(int stuId, int stuAge,String stuName) {
		this.stuId = stuId;
		this.stuAge = stuAge;
		this.stuName = stuName;
		
	}

	public int getStuId() {
		return stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	
	  public static List<Student> getStudents(){ 
	      List<Student> list = new ArrayList<>(); 
	      list.add(new Student(11, 28, "Lucy")); 
	      list.add(new Student(28, 27, "Tim")); 
	      list.add(new Student(32, 30, "Daniel")); 
	      list.add(new Student(49, 27, "Steve")); 
	      return list; 
	   }
}
