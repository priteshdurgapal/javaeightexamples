package com.test.java8latest.comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ComparatorExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee =  Arrays.asList(new Employee(30,"Pritesh", "Durgapal","IT", "M"),
		 new Employee(31,"Ramesh", "XYZ","IT","F"),
		 new Employee(43,"Suresh", "AMC","HR","M"),
		 new Employee(32,"Javesh", "EFG","HR","F"),
		 new Employee(21,"Travesh", "HIG","Legal","M"),
		 new Employee(45,"JIgnesh", "JKL","FCSU","F"));
		Long count = listOfEmployee.stream().map(e->e.getDepartment()).distinct().count();
		System.out.println(count);
		
		Map<String,Long> employeePerDepartment = 
				listOfEmployee.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.counting()));
		Map<Integer, String> names = Map.of(1, "david",
                2, "simon",
                3, "mary",
                4, "john",
                6, "john");
		//System.out.println(names);
		
		
		for(Map.Entry<Integer,String> em:names.entrySet()) {
			System.out.println(em.getKey()+ ":" + em.getValue() );
		}
		
		System.out.println(employeePerDepartment);
		
		//min age employee
		 Optional<Employee> employee = listOfEmployee.stream().sorted((Employee e1, Employee e2)-> e1.getAge()-e2.getAge()).findFirst();
		 
		 System.out.println(employee.get().getFullName());
		 		//method2
		 Optional<Employee> employee2 = listOfEmployee.stream().sorted(Comparator.comparingInt(e->e.getAge())).findFirst();
		 System.out.println(employee2.get().getFullName());
		 
		 
		 
	}

}
