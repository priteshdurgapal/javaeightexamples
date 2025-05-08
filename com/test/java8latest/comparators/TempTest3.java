package com.test.java8latest.comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TempTest3 {
	
	public static void main(String[] args) {
		List<Employee> listOfEmployee =  Arrays.asList(
				 new Employee(30,"Pritesh", "Durgapal","IT", "M"),
				 new Employee(31,"Ramesh", "XYZ","IT","F"),
				 new Employee(43,"Suresh", "AMC","HR","M"),
				 new Employee(32,"Javesh", "EFG","HR","F"),
				 new Employee(21,"Travesh", "HIG","Legal","M"),
				 new Employee(45,"JIgnesh", "JKL","FCSU","F"));
				 
		
		//17) Given the list of employees, count number of employees greater than age 30?
		
		long employeeCount  = listOfEmployee.stream().filter(i->i.getAge()>30).count();
		System.out.println(employeeCount);
		
		//19)Given a list of employee, find maximum age of employee?
		
		Optional<Integer> employeeAge = listOfEmployee.stream().map(i->i.getAge()).max(Comparator.naturalOrder());
		System.out.println(employeeAge.get());
		//------------------------
		long age = listOfEmployee.stream().map(i->i.getAge()).sorted(Comparator.reverseOrder()).findAny().get();
		 
		 //20) Given a list of employees, sort all the employee on the basis of age? Use java 8 APIs only
		 
		 List<Employee> loe = listOfEmployee.stream().sorted((Employee e1, Employee e2) -> e1.getAge()-e2.getAge()).collect(Collectors.toList());
		 
		 //21) Join the all employee names with “,” using java 8?
		 
		 String loeJoin = listOfEmployee.stream().map(i->i.getFullName()).collect(Collectors.joining(","));
		  System.out.println(loeJoin);
		 
		 //Given the list of employee, group them by department name?
		  
		  System.out.println("21 ==========================");
		  
		 Map<String, List<Employee>> grp = listOfEmployee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		  
		 System.out.println(grp);
		 
		 System.out.println("==========================");
		 for(Map.Entry<String,List<Employee>> em: grp.entrySet()) {
			System.out.println(em.getKey() + em.getValue());
		 }
		 
		 grp.forEach((key,value)-> {
			 System.out.println(key + value);
		 });
		  
		
		 /// List to map
		 System.out.println("====== List to map ====================");
		 Map<String, String> mp = listOfEmployee.stream()
				 .collect(Collectors.toMap(Employee::getDepartment, Employee::getFullName,(e1,e2)->e2,LinkedHashMap::new));
		 System.out.println(mp);
		 System.out.println("==========================");
		 
		 //=============
				 
		 Map<String,List<String>> moe = listOfEmployee.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				 Collectors.mapping(Employee::getFullName, Collectors.toList())));
		 System.out.println(moe);
		 
		 System.out.println("==========================");
		 
		 Map<String, List<Employee>> test =  listOfEmployee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		 System.out.println(test);
		 
		 Map<String,String> mmmp = new HashMap<String,String>();
		 
		 mmmp.put("ice", "Antartica");
		 mmmp.put("sand", "Sahara");
		 mmmp.put("ice", "Greenland");
		 
		// mmmp.entrySet()
		 
		 System.out.println(mmmp);
		 
		 System.out.println("==========================");
		 
		 Map<String,Double> avg = listOfEmployee.stream()
				 .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		 System.out.println(avg);
		 
		 int highestAge  = listOfEmployee.stream().map(i->i.getAge()).sorted(Comparator.reverseOrder()).findFirst().get();
		 
		 System.out.println(highestAge);
		 
		 Optional<Employee> loes = listOfEmployee.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
		 
		 Map<String,Long> mep = listOfEmployee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		 
		 System.out.println(mep);
	}

}
