package com.pattern.decorate;

public class HouseBlend extends Beverage {

	
	
	public HouseBlend() {
		description="HouseBlend";
	}

	@Override
	public double cost() {
		
		return 1.05;
	}

}
