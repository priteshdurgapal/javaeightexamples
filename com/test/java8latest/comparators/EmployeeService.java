package com.test.java8latest.comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeService {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee =  Arrays.asList(new Employee(30,"Pritesh", "Durgapal","IT", "M"),
				 new Employee(31,"Ramesh", "XYZ","IT","F"),
				 new Employee(43,"Suresh", "AMC","HR","M"),
				 new Employee(32,"Javesh", "EFG","HR","F"),
				 new Employee(21,"Travesh", "HIG","Legal","M"),
				 new Employee(45,"JIgnesh", "JKL","FCSU","F"));
		 
		 for(Employee e:listOfEmployee) {
				System.out.println(e.toString());
			}
		 Collections.sort(listOfEmployee, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getFullName().compareTo(o2.getFullName());
			}
			 
		 });
		 System.out.println("after collection sort java7");
		for(Employee e:listOfEmployee) {
			System.out.println(e.toString());
		}
		
		Collections.sort(listOfEmployee,new Comparator<Employee>() {
			
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getAge()-e2.getAge();
			}
		});
		 System.out.println("after collection sort by age java7");
		for(Employee e:listOfEmployee) {
			System.out.println(e.toString());
		}
		
		Collections.sort(listOfEmployee, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				int compareWithName = 
				 o1.getFullName().compareTo(o2.getFullName());
				
				int compareWithAge = 
						o1.getAge()-o2.getAge();
				
				return (compareWithName==0)?compareWithAge:compareWithName;
			}
			 
		 });
		
		 System.out.println("after collection sort by name then age in java7");
			for(Employee e:listOfEmployee) {
				System.out.println(e.toString());
			}
			
			System.out.println("java8--");
		//JAVA8
			listOfEmployee.sort((Employee e1,Employee e2) ->e1.getFullName().compareTo(e2.getFullName()));
			
			listOfEmployee.forEach(System.out::println);
			
		  Long count = 	listOfEmployee.stream().filter(e->e.getDepartment().equals("IT")).count();
		  System.out.println(count);
		  
		  Collections.sort(listOfEmployee, Comparator.comparing(Employee::getFullName));
			
	} 
	

}
