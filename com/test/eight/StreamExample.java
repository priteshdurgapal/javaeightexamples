package com.test.eight;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> people = Arrays.asList(
				new Person("charles","dickens",60),
				new Person("smith","hones",40),
				new Person("thoms","gons",50),
				new Person("champ","zulu",20)				
				);
		
		people.stream()
		.filter(p->p.getFirstName().startsWith("c"))
		.forEach(p->System.out.println(p.getFirstName()));
		
		people.stream()
		.filter(p->p.getFirstName().startsWith("c"))
		.forEach(System.out::println);
		
		/*List numbers = Arrays.asList("2","3","4","5");
		numbers.stream()
		.map(x -> Integer.valueOf(x))
		.forEach(x -> System.out.println(x));*/
		//Supplier<String> sup= p->p*2;
		
		people.stream()
		
		.collect(Collectors.toList());
				
		
	}

}
