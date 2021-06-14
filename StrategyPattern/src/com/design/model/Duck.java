package com.design.model;

import com.design.behavior.FlyBehavior;
import com.design.behavior.QuackBehavior;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("all ducks can swim");
		
	}


	/* To Change the behavior on the fly*/

	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}


	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
	
	
}
