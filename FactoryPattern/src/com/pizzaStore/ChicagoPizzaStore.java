package com.pizzaStore;

import com.pizza.CheesePizza;
import com.pizza.ClamPizza;
import com.pizza.Pizza;
import com.pizza.ingredient.ChicagoPizzaIngredientfactory;
import com.pizza.ingredient.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory =
				new ChicagoPizzaIngredientfactory();
		if(item.equalsIgnoreCase("Cheese"))
		{
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("Chicago Style Cheese");
		}
		else if (item.equalsIgnoreCase("Clam"))
		{
			pizza = new ClamPizza(pizzaIngredientFactory);
			pizza.setName("Chicago style Clam Pizza");
		}
		 return pizza;
	}
}
