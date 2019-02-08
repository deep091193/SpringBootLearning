package com.lamdaPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExerciseJava7 {

	public static void main(String[] args) {
 
		List<Person> persons = Arrays.asList(
		new Person(1, "Stiv", "Smith", 30),
		new Person(2, "Shane", "Sharon", 35),
		new Person(3, "Stiv", "Mitchel", 20),
		new Person(4, "Rayan", "Taylor", 36),
		new Person(5, "Steeve", "Wagh", 40)
		);
		
		
		Collections.sort(persons, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				 return p1.getLastName().compareTo(p2.getLastName());
				
			}
		});
		
		
				
			
	
		
		
		printAll(persons);
	
		
		printConditional(persons, new Condition(){
			public boolean test(Person p) {
				return p.getLastName().startsWith("S");
				
			}
		});
	}
	
	
	
			
		



/*	private static void printAllBegineWithS(List<Person> persons) {
		for(Person p : persons){
			if(p.getLastName().startsWith("S"))
			System.out.println(p);
		}
		
	}*/
	
	
	private static void printConditional(List<Person> persons, Condition cond) {
		for(Person p : persons){
			if(cond.test(p))
			System.out.println(p);
		}
		
	}

	private static void printAll(List<Person> persons) {
		for(Person p : persons){
			System.out.println(p);
		}
		
	}
	
	interface Condition{
		boolean test(Person p);
	}
	
	

}
