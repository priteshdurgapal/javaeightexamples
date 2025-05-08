package com.test.java8latest.moreonlambda;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Map<Integer, String> map1 = Map.of(1,"a",2,"b",3,"c");
		 Map<Integer, String> map2 = Map.of(1,"x",5,"b",6,"c");
		 Map<Integer, String> map3 = new HashMap<>(map1);
		 map2.forEach( (key,value)->map3.merge(key, value, (v1,v2) ->v1+v2));
		 
		 System.out.println(map3);
		 
		 Map<Integer, String> map5 = Map.of(99,"a",2,"b",34,"c");
		 
		 System.out.println(map5);
		 
		 Map<Integer, String> resultmap =  map5.entrySet().stream().sorted(Map.Entry.comparingByKey()).
				 collect(Collectors.toMap(
						 Map.Entry::getKey,
						 Map.Entry::getValue,
						 (e1,e2) -> e1,LinkedHashMap::new));
		 
		 System.out.println(resultmap);
	}

}
