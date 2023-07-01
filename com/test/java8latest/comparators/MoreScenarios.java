package com.test.java8latest.comparators;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MoreScenarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> loe =  Arrays.asList(
				 new Employee(30,"Pritesh", "Durgapal","IT", "M"),
				 new Employee(31,"Rani", "XYZ","IT","F"),
				 new Employee(43,"Suresh", "AMC","HR","M"),
				 new Employee(32,"Jayanti", "EFG","HR","F"),
				 new Employee(21,"Travesh", "HIG","Legal","M"),
				 new Employee(45,"Jagriti", "JKL","FCSU","F"));
				 
		//Query 3.1 : How many male and female employees are there in the organization?
		Map<String,Long> mp = loe
				.stream()
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(mp);
		
		
		Map<String,List<String>> mapOfEmloyeeWithGender = loe
				.stream()
				.collect(Collectors
						.groupingBy(Employee::getGender,
								Collectors.mapping(Employee::getFullName, Collectors.toList())));
		System.out.println(mapOfEmloyeeWithGender);
		
		//Print the name of all departments in the organization?
		List<String> lod = loe.stream().map(e->e.getDepartment()).distinct().collect(Collectors.toList());
		System.out.println(lod);
		
		// What is the average age of male and female employees?
		//https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/

	}

}
