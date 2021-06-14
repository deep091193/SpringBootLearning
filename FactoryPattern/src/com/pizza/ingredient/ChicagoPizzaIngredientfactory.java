package com.pizza.ingredient;

public class ChicagoPizzaIngredientfactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThikCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new MozerellaSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new  ShraddedCheese();
	}

	@Override
	public Veggies[] createVaggies() {
		Veggies vaggies[] = {new Garlic(), new Onion(), new Mushroom()};
		return vaggies;
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return new Frozenclam();
	}


}
