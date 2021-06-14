package com.test;

import com.duck.Duck;
import com.duck.MallardDuck;
import com.turkey.TurkeyAdapter;
import com.turkey.WildTurkey;

public class AdaptionTest {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdopter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says");
		turkey.gobble();
		turkey.fly();

		System.out.println("The duck says :");
		testDuck(duck);
		
		System.out.println("\n The TurkeyAdopter says:");
		testDuck(turkeyAdopter);
	}

	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
		
	}

}
