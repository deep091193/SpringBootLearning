package com.lambda.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.lamdaPractice.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
 
		List<Person> persons = Arrays.asList(
		new Person(1, "Stiv", "Smith", 30),
		new Person(2, "Shane", "Sharon", 35),
		new Person(3, "Stiv", "Mitchel", 20),
		new Person(4, "Rayan", "Taylor", 36),
		new Person(5, "Steeve", "Wagh", 40)
		);
		
		

		
		
		
		/*printAll(persons);*/
		System.out.println("Printing all");
		//printConditional(persons, p -> true, p -> System.out.println(p));
		
		//Simmilar Thing
		
		printConditional(persons, p -> true, System.out::println);
		
		

}


	
	private static void printConditional(List<Person> persons, Predicate<Person> predicate , Consumer<Person> consumer) {
		for(Person p : persons){
			if(predicate.test(p))
			consumer.accept(p);
		}
		
	}
}
