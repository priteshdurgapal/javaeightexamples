package com.test.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(1, 25, "Male", "Pritesh", "Durgapal");
		Employee e2 = new Employee(2, 13, "F", "Martina", "Hengis");
		Employee e3 = new Employee(3, 43, "M", "Ricky", "Martin");
		Employee e4 = new Employee(4, 26, "M", "Jon", "Lowman");
		Employee e5 = new Employee(5, 19, "F", "Cristine", "Maria");
		Employee e6 = new Employee(6, 15, "M", "David", "Feezor");
		Employee e7 = new Employee(7, 68, "F", "Melissa", "Roy");
		Employee e8 = new Employee(8, 79, "M", "Alex", "Gussin");
		Employee e9 = new Employee(9, 15, "F", "Neetu", "Singh");
		Employee e10 = new Employee(10, 45, "M", "Naveen", "Jain");

		List<Employee> employees = new ArrayList<Employee>();
		employees.addAll(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10));
		// printforpredicate(employees, p -> true);
		// printforpredicate(employees, p -> p.getAge() > 20);
		// printforpredicate(employees,p->p.getFirstName().startsWith("M"));
		printforpredicateex2(employees, p -> p.getFirstName().startsWith("M"));
		Predicate<Integer> predicateInt = i -> {

			return i > 11;

		};
		System.out.println(predicateInt.test(10));
		Predicate<Integer> predicateDefault = i -> {

			return i.equals("String");

		};

	}

	public static void printforpredicate(List<Employee> employee, Predicate<Employee> predicate) {

		for (Employee e : employee) {
			if (predicate.test(e)) {
				System.out.println(e);
			}
		}
	}

	public static void printforpredicateex2(List<Employee> employee, Predicate<Employee> predicate) {
		employee.stream().filter(predicate).collect(Collectors.toList());

	}
}
