package com.design.model;

import com.design.behavior.FlyWings;
import com.design.behavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super();
		quackBehavior = new Quack();
		flyBehavior = new FlyWings();
	}

	

}
