package com.pizza.ingredient;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new  ReggianoCheese();
	}

	@Override
	public Veggies[] createVaggies() {
		Veggies vaggies[] = {new Garlic(), new Onion(), new Mushroom()};
		return vaggies;
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return new Freshclam();
	}

}
