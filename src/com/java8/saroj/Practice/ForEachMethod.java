package com.java8.saroj.Practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ForEachMethod {
	
	public static void main(String[] args) {
	
		Map<String,Integer> mp=new HashMap<>();
		mp.put("Dinesh",10000);
		mp.put("Karuna",10000);
		mp.put("Napa",10000);
		mp.forEach((k,v)->
		{
			if(k.equals("Karuna"))
			System.out.println(k+"*******"+v);
		});
		
		List<String> ls=new LinkedList<>();
		ls.add("Dinesh");
		ls.add("Karuna");
		ls.add("Kajal");
		ls.add("Napa");
		
		ls.forEach(x->System.out.println(x));
		
		//forEach() iterating a Stream 
		ls.stream().filter(x->x.startsWith("N")).forEach(x->System.out.println(x));
		
		ls.stream().filter(x->x.startsWith("K")).parallel().forEach(System.out::println);
		
		ls.stream().filter(x->x.startsWith("K")).parallel().forEachOrdered(x->System.out.println(x));
	}
}
