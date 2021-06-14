package com.order;

import com.pizza.Pizza;
import com.pizzaStore.ChicagoPizzaStore;
import com.pizzaStore.NYPizzaStore;
import com.pizzaStore.PizzaStore;

public class PizzaOrder {

	public static void main(String[] args) {
	PizzaStore nyStore = new NYPizzaStore();
	PizzaStore chicagoStore = new ChicagoPizzaStore();
	
	Pizza pizza = nyStore.orderPizza("Cheese");
	System.out.println("Ethan Ordered a " + pizza.getName() + "\n");
	
	pizza = chicagoStore.orderPizza("Cheese");
	System.out.println("Hunt ordered a " + pizza.getName() + "\n");
	

	}

}
