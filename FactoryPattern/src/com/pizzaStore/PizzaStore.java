package com.pizzaStore;

import com.pizza.Pizza;

public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza= createPizza(type);
		
		//pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	
	abstract protected  Pizza createPizza(String type) ;
		
	/*
	 * A factory method is abstract so the subclasses are counted on to handle
	 * object creation. It returns a product that is used within methods defined in
	 * subclasses. It isolates the client code from knowing what kind of concreate
	 * product is actually created.
	 */
	
}
