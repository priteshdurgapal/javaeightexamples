package com.test.eight;
import java.util.Arrays;
import java.util.List;

public class FoEach {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Person> people = Arrays.asList(
				new Person("charles","dickens",60),
				new Person("smith","hones",40),
				new Person("thoms","gons",50),
				new Person("champ","zulu",20)				
				);
		
		
		/*for(Person p:people) {
			System.out.println(p);
		}*/
		//people.forEach(p->System.out.println(p));
		//people.forEach(System.out::println);
		
		
		people.forEach(p->System.out.println(p));
		
	}
	}
