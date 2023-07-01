package com.test.java8latest.moreonlambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.function.BiFunction;

public class JavaDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalDate localDate2 = LocalDate.of(2023, 9, 1);
		System.out.println(localDate2);

		List<String> list = Arrays.asList("one", "two", "three");
	    List<String> unmodifiableList = Collections.unmodifiableList(list);
	    System.out.println(unmodifiableList);
	    unmodifiableList.add("four");
	    System.out.println(unmodifiableList);
	    
	    
	}

}
