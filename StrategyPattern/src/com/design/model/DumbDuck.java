package com.design.model;

import com.design.behavior.FlyNoWay;
import com.design.behavior.MuteQuack;

public class DumbDuck extends Duck {

	public DumbDuck() {
		super();
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	
	public void display() {
		System.out.println("I am a dumb duck");
		
	}

	
	
}
