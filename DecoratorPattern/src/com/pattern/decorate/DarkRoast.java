package com.pattern.decorate;

public class DarkRoast extends CondimentDecorator {
 
	Beverage beverage;
	
	
	@Override
	public String getDescription() {
		
		return beverage.getDescription() + " " + ", DarkRoast";
	}

	@Override
	public double cost() {
		
		return .35 + beverage.cost();
	}

	public DarkRoast(Beverage beverage) {
		
		this.beverage = beverage;
	}

	
}
