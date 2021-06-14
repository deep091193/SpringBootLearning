package com.pizzaStore;

import com.pizza.CheesePizza;
import com.pizza.ClamPizza;
import com.pizza.Pizza;
import com.pizza.ingredient.NYPizzaIngredientFactory;
import com.pizza.ingredient.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = 
				new NYPizzaIngredientFactory();
		if(item.equalsIgnoreCase("Cheese")) {
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("Ny Style Cheese Pizza");
		}
		
		else if (item.equalsIgnoreCase("Clam")) {
			pizza = new ClamPizza(pizzaIngredientFactory);
			pizza.setName("NY Style Clam Pizza");
		}
			
		return pizza;
	}

}
