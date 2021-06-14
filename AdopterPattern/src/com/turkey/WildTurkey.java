package com.turkey;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("Gobble");

	}

	@Override
	public void fly() {
		System.out.println("I can fly short distance");

	}

}
