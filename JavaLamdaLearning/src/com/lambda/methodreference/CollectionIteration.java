package com.lambda.methodreference;

import java.util.Arrays;
import java.util.List;

import com.lamdaPractice.Person;

public class CollectionIteration {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(
		new Person(1, "Stiv", "Smith", 30),
		new Person(2, "Shane", "Sharon", 35),
		new Person(3, "Stiv", "Mitchel", 20),
		new Person(4, "Rayan", "Taylor", 36),
		new Person(5, "Steeve", "Wagh", 40)
		);
		
		System.out.println("Printing with for loop");
		for(int i = 0; i<persons.size(); i++){
			System.out.println(persons.get(i));
		}

		System.out.println("\n");
		System.out.println("Printing with for each loop");
		for (Person p : persons){
			System.out.println(p);
		}
		
		System.out.println("\n");
		
		System.out.println("Printing with Lambda");
		persons.forEach(p -> System.out.println(p));
		
	System.out.println("\n");
		
		System.out.println("Printing with Method reference");
		persons.forEach(System.out::println);
	}

}
