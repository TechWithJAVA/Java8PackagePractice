package com.java8.saroj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {
		 List<String> names1 = new ArrayList<String>();
	      names1.add("Mahesh ");
	      names1.add("Suresh ");
	      names1.add("Ramesh ");
	      names1.add("Naresh ");
	      names1.add("Kalpesh ");
	      
	      Map<String,String> m=new HashMap<>();
	      m.put("asdagf","z");
	      m.put("gfaf", "a");
	      m.put("ewrtrey", "s");
	      //Map sorted = m .entrySet() .stream() .sorted(Map.Entry.<String, String> comparingByKey()).collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2), LinkedHashMap::new));
          LinkedHashMap<String, String> so=m.entrySet().stream().sorted(Map.Entry.<String, String>comparingByKey()).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,LinkedHashMap::new));
         System.out.println("**********"+so);
	     
        Sorting s=new Sorting();
	      System.out.println("Sort using Java 7 syntax: ");
			
	      s.sortUsingJava7(names1);
	      System.out.println(names1);
	      
	      System.out.println("Sort using Java 8 syntax: ");
			
	     s.sortUsingJava8(names1);
	      System.out.println(names1);
	      
	    ;
	      System.out.println( s.sortMapUsingJava8(m));
	}

	private Map<String, String> sortMapUsingJava8(Map<String, String> m) {
		// TODO Auto-generated method stub
		//{d=developer, l=consultant, m=engineer}
		/* Map so=m.entrySet().stream().sorted(Map.Entry.<String, String>comparingByKey())
        .collect(Collectors.toMap(e->e.getKey(),e->e.getValue(),
                (e1, e2) -> e2, LinkedHashMap::new));*/
		/* Map<String, String> result2 = new LinkedHashMap<>();
	        m.entrySet().stream()
	                .sorted(Map.Entry.comparingByKey())
	                .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));*/
		 LinkedHashMap<String, String> so=m.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		 return so;
	}

	private void sortUsingJava7(List<String> names) {
		// TODO Auto-generated method stub
		Collections.sort(names, new Comparator<String>() {
	         @Override
	         public int compare(String s1, String s2) {
	            return s1.compareTo(s2);
	         }
	      });
	}
	//sort using java 8
	   private void sortUsingJava8(List<String> names) {
	      Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	   }
	   
	   
	
}
