package com.java8.saroj.Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterMapAndNullValues {

	public static void main(String[] args) {
		
		Map<Integer,String> hm=new HashMap<>();
		hm.put(11,"saroj");
		hm.put(23,"Sumit");
		hm.put(1,"Kohali");
		hm.put(2,"Manoj");
				
		Map<Integer,String> result=hm.entrySet().stream().filter(m->m.getKey().intValue()<=11)
				.collect(Collectors.toMap(m->m.getKey(), m->m.getValue()));
		System.out.println(result);
		
		//Filter Map by Values
		Map<Integer,String> ms=hm.entrySet()
				               .stream()
				               .filter(m->"saroj".equals(m.getValue()))
				               .collect(Collectors.toMap(m->m.getKey(),m->m.getValue()));
		System.out.println(ms);
		
		//filter by both key and values
		Map<Integer,String> mkv=hm.entrySet().stream()
				                  .filter(m->m.getKey().intValue()<=23)
				                  .filter(m->m.getValue().startsWith("S"))
				                  .collect(Collectors.toMap(m->m.getKey(),m->m.getValue()));
		System.out.println(mkv);
		
		//Filter null values from a Stream
        
		List<String> list = Arrays.asList("Java", "Stream", null, "Filter", null);
		List<String> resultList = list.stream()
				.filter(s->s!=null)
				.collect(Collectors.toList());
       System.out.println(resultList);
       
       List<String> resultnull = list.stream()
    			.filter(Objects::nonNull)
    			.collect(Collectors.toList());
       
       System.out.println(resultnull);
       
       List<Integer> listm = Arrays.asList(1, 2, 3, null, 4, null, 5);
   	List<Integer> resultm = listm.stream()
   		.map(num -> num) //here you will be having a different logic
   		.filter(n -> n!=null)
   		.collect(Collectors.toList());
   	resultm.forEach(System.out::println); 
		
		
	}
}
