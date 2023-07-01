package com.test.java8latest.comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeActionExample {
	
	public static void main(String[] args) {
		List<Employee> listOfEmployee =  Arrays.asList(
				 new Employee(30,"Pritesh", "Durgapal","IT", "M"),
				 new Employee(31,"Ramesh", "XYZ","IT","F"),
				 new Employee(43,"Suresh", "AMC","HR","M"),
				 new Employee(32,"Javesh", "EFG","HR","F"),
				 new Employee(21,"Travesh", "HIG","Legal","M"),
				 new Employee(45,"JIgnesh", "JKL","FCSU","F"));
				 
		
		//17) Given the list of employees, count number of employees greater than age 30?
		Long ageList = listOfEmployee.stream().filter(e->e.getAge()>30)
		.count();
		
		System.out.println(ageList);
		
		//19)Given a list of employee, find maximum age of employee?
		
		 Integer age = listOfEmployee.stream().map(e->e.getAge()).sorted(Comparator.reverseOrder()).findFirst().get();
		 System.out.println(age);
		 
		 //20) Given a list of employees, sort all the employee on the basis of age? Use java 8 APIs only
		 listOfEmployee.stream()
		 .sorted( (Employee e1, Employee e2) -> e1.getAge()-(e2.getAge()))
		 .forEach(System.out::println);
		 System.out.println("=========================================");
		 //21) Join the all employee names with “,” using java 8?
		 String names = listOfEmployee.stream()
				 .map(e->e.getFullName())
				 .collect(Collectors.joining(","));
		 System.out.println(names);
		 System.out.println("=========================================");
		 //Given the list of employee, group them by employee name?
		
		 Map<String, List<Employee>> map = listOfEmployee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		 System.out.println(map);
		 
		 map.forEach((key,value)-> System.out.println(key + value));
		 
		 System.out.println("=========================================");
		 
		 Map<String, List<String>> nameAndDepartment = listOfEmployee
				 .stream()
				 .collect(Collectors.groupingBy(Employee::getDepartment, 
						 Collectors.mapping(Employee::getFullName,Collectors.toList())));
		 
		 nameAndDepartment.forEach((key,value)-> {
			 System.out.println(key +"==>" + value);
		 });
		 
		 
		 Map<String, List<Employee>> mapgender = listOfEmployee.stream().collect(Collectors.groupingBy(Employee::getGender));
		 System.out.println(mapgender);
		 
		 Map<String, List<String>> mapgendername = listOfEmployee.stream()
				 .collect(Collectors.groupingBy(Employee::getGender,Collectors.mapping(Employee::getFullName,Collectors.toList())));
		 System.out.println(mapgendername);
		 
		 
		 
		 
		 
	}

}
