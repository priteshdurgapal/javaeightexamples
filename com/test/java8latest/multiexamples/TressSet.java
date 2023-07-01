package com.test.java8latest.multiexamples;

import java.util.Comparator;
import java.util.TreeSet;

public class TressSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Employee> nameComp =  new TreeSet<Employee>(Comparator.comparingInt(e->e.getSalary()));
		nameComp.add(new Employee("Ram",3000));
        nameComp.add(new Employee("John",6000));
        nameComp.add(new Employee("Crish",2000));
        nameComp.add(new Employee("Tom",2400));
        for(Employee e:nameComp){
            System.out.println(e);
        }
	}

}
