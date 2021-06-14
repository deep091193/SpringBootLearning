package com.pattern.decorate;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Expresso();
		System.out.println(beverage.getDescription()
		+ " $" + beverage.cost());
		
		beverage = new DarkRoast(beverage);
		beverage = new Mocha(beverage);
		
		
		System.out.println(beverage.getDescription()
		+ " $" + beverage.cost());
		Beverage beverage3 = new HouseBlend();
		
		beverage3 = new Mocha(beverage3);
		
		System.out.println(beverage3.getDescription()
		+ " $" + beverage3.cost());

	}

}
