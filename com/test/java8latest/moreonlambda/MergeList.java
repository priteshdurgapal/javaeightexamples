package com.test.java8latest.moreonlambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = {"Pritesh_123","Ravi_234","Mohit_345"};
		List<String> liS = Arrays.asList(arr1);
		List<String> liSTwo = Arrays.asList(new String[]{"Durgapal","Pandey","Karki"});
		int j=0;
		List<String> liSThree = new ArrayList<>();
		liSThree = liSTwo.stream().map(i->liS.get(j).split("_")[1].concat(i)).collect(Collectors.toList());
		
		List<String> resultList = IntStream.range(0, liSTwo.size())
                .mapToObj(i -> liSTwo.get(i) + "_" + liS.get(i).split("_")[1])
                .collect(Collectors.toList());
		
		/*
		 * List<String> resultList2 = liS.stream() .forEach(i-> { callThem(i); });
		 */
		
		
		System.out.println(resultList);
		
		int sum = IntStream.range(0, 10).reduce(0,(a,b)->a+b);
		System.out.println(sum);
	}

}
