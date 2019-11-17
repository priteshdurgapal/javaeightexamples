package com.test.eight;
import java.time.LocalDate;
import java.util.function.Predicate;

public class PredCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Predicate<Integer> predicate =;
		getPredicate(10000, i->i<200 );
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.toString()); 

	}
	
	public static void getPredicate(int number, Predicate<Integer> predicate) {
		//System.out.println(10,);
		if(predicate.test(number)) {
			System.out.println(number);;
		}
	}
	
	

}
