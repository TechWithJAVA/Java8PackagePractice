package com.java8.saroj.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsEx {

	
	public static void main(String[] args) {
		//Stream Collectors groupingBy and counting Example
		
		 List<String> names =
		          Arrays.asList("Jon", "Ajeet", "Steve",
		             "Ajeet", "Jon", "Ajeet");
		 
		
			      Map<String, Long> collect = names.stream().collect(
			          Collectors.groupingBy(
			             Function.identity(), Collectors.counting()
			          )
			      );
			      
			      System.out.println(collect);

		 //fetching data as List
			      
		List<Student> studentlist = new ArrayList<Student>();   
		 //Adding Students      
	      studentlist.add(new Student(11,22,"Jon"));      
	      studentlist.add(new Student(22,18,"Steve"));        
	      studentlist.add(new Student(33,22,"Lucy"));        
	      studentlist.add(new Student(44,23,"Sansa"));         
	      studentlist.add(new Student(55,18,"Maggie"));                  
	      //Fetching student names as List      
	      List<String> namesStu = studentlist.stream().map(n->n.stuName).collect(Collectors.toList());
	      System.out.println(namesStu); 
	      
	      //Collecting Data as Set
	      Set<Student> students = studentlist.stream()
                  .filter(n-> n.stuId>22)
                  .collect(Collectors.toSet());
	      students.forEach(s->System.out.println(s.stuId+"**"+s.stuName+"**"+s.stuAge));
	     
	      //Getting the average age of students using averagingInt() method
	      
	      Double avgAge = studentlist.stream().collect(Collectors.averagingInt(s->s.stuAge));
	      System.out.println("Average Age of Students is: "+avgAge);
		 
	}
}
