package com.lamdaPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UnitExerciseJava8 {

	public static void main(String[] args) {
 
		List<Person> persons = Arrays.asList(
		new Person(1, "Stiv", "Smith", 30),
		new Person(2, "Shane", "Sharon", 35),
		new Person(3, "Stiv", "Mitchel", 20),
		new Person(4, "Rayan", "Taylor", 36),
		new Person(5, "Steeve", "Wagh", 40)
		);
		
		

		
		Collections.sort(persons, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
				
			
	
		
		
		/*printAll(persons);*/
		System.out.println("Printing all");
		printConditional(persons, p -> true, p -> System.out.println(p));
		
		System.out.println("Printing Last name with S");

	printConditional(persons, p -> p.getLastName().startsWith("S"), p -> System.out.println(p));
			
	System.out.println("Printing First name with R");
	printConditional(persons, p -> p.getFirstName().startsWith("R"), p -> System.out.println(p.getFirstName()));
		

}


	
	private static void printConditional(List<Person> persons, Predicate<Person> predicate , Consumer<Person> consumer) {
		for(Person p : persons){
			if(predicate.test(p))
			consumer.accept(p);
		}
		
	}


	
/*	interface Condition{
		boolean test(Person p);
	}*/
	
	

}
