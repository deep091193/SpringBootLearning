package com.design.main;

import com.design.behavior.FlyRocketPower;
import com.design.model.Duck;
import com.design.model.DumbDuck;
import com.design.model.MallardDuck;

public class Demo {

	public static void main(String[] args) {
		
		Duck malDuck = new MallardDuck();
		malDuck.performFly();
		malDuck.performQuack();
		
		Duck dumbDuck = new DumbDuck();
		dumbDuck.performFly();
		dumbDuck.setFlyBehavior(new FlyRocketPower());
		dumbDuck.performFly();

		dumbDuck.performQuack();
	}
}
