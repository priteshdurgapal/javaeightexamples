package com.test.playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.test.java8latest.comparators.Employee;

public class EmployeEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee =  Arrays.asList(new Employee(30,"Pritesh", "Durgapal","IT", "M"),
				 new Employee(30,"Ramesh", "XYZ","IT","F"),
				 new Employee(43,"Suresh", "AMC","HR","M"),
				 new Employee(32,"Javesh", "EFG","HR","F"),
				 new Employee(21,"Travesh", "HIG","Legal","M"),
				 new Employee(45,"JIgnesh", "JKL","FCSU","F"));
		
		//min age employee
		Employee employee = listOfEmployee.stream().sorted(Comparator.comparingInt(e->e.getAge())).findFirst().get();
		System.out.println(employee);
		//display(listOfEmployee);
		
		//17) Given the list of employees, count number of employees greater than age 30?
		Long count = listOfEmployee.stream().filter(e->e.getAge()>30).count();
		System.out.println(count);
		//19)Given a list of employee, find maximum age of employee?
				//listOfEmployee.stream().map(e->e.getAge)
		//20) Given a list of employees, sort all the employee on the basis of age? Use java 8 APIs only
		 //21) Join the all employee names with “,” using java 8?
		 //Given the list of employee, group them by employee name?
		//Query 3.1 : How many male and female employees are there in the organization?
		//Print the name of all departments in the organization?
		// What is the average age of male and female employees?

	}
	
	private static void display(List<Employee> listOfEmployee) {
		
		listOfEmployee.stream().forEach(System.out::println);
		
	}

}
