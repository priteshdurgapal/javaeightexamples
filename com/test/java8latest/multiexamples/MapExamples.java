package com.test.java8latest.multiexamples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> names = Map.of(1, "david",
                2, "simon",
                3, "mary",
                4, "john",
                6, "john");
		
		System.out.println(names);
		
		for(Map.Entry<Integer,String> em: names.entrySet()) {
			System.out.println(em.getKey() + ":" + em.getValue());
		}
		
		//java8
		
		names.entrySet().forEach(entry-> {
			System.out.println(entry.getKey() + entry.getValue());
		});
		
		names.forEach((id,value) -> {
			System.out.println(id + "-" + value);
		});
		
		System.out.println("=============================");
		
		names.entrySet().stream()
		                .sorted( Map.Entry.comparingByValue())
		                .collect(Collectors.toMap(
		                		Map.Entry::getKey,
		                		Map.Entry::getValue,
		                		(e1,e2) -> e1,LinkedHashMap::new));
		                
		System.out.println(names);    
		System.out.println("=============================");
		//collect hashmap values in linkedlist
		
		
		//sort hashmap
		
		names.entrySet().stream().sorted( Map.Entry.comparingByKey())
								 .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(names); 
		
		
	}

}
