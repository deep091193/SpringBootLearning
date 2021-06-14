package com.pizza.ingredient;

public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVaggies();
	public Clams createClam();
}
