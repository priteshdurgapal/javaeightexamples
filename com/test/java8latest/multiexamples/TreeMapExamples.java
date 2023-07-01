package com.test.java8latest.multiexamples;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Map<Integer,String> hm = Map.of(1,"hello", 4,"Zero", 2,"New");
		
		TreeMap<Integer,String> tm = new TreeMap<>(hm);
		
		System.out.println(tm);
		
		TreeMap<String,String> treeM = new TreeMap<>();
		
		treeM.put("One", "hello");
		treeM.put("Two", "Bye");
		treeM.put("Four", "Hi");
		
		System.out.println(treeM);
		
		TreeMap<String,String> treeMCom = new TreeMap<>(Comparator.reverseOrder());
		
		treeMCom.put("One", "hello");
		treeMCom.put("Two", "Bye");
		treeMCom.put("Four", "Hi");
		
		System.out.println(treeMCom);
		
		
	}

}
