package com.pizza;

import java.util.ArrayList;
import java.util.Arrays;

import com.pizza.ingredient.Cheese;
import com.pizza.ingredient.Clams;
import com.pizza.ingredient.Dough;
import com.pizza.ingredient.Sauce;
import com.pizza.ingredient.Veggies;

public abstract class Pizza {
	
	String name;
	Dough dough;
	Sauce sauce;
	ArrayList toppings = new ArrayList();
	Veggies veggies[];
	Cheese cheese;
	Clams clams;
	
	abstract void prepare();

	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Dough getDough() {
		return dough;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public Veggies[] getVeggies() {
		return veggies;
	}

	public void setVeggies(Veggies[] veggies) {
		this.veggies = veggies;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	public Clams getClams() {
		return clams;
	}

	public void setClams(Clams clams) {
		this.clams = clams;
	}

	public ArrayList getToppings() {
		return toppings;
	}

	public void setToppings(ArrayList toppings) {
		this.toppings = toppings;
	}

/*	public void prepare() {
		System.out.println(name +" is getting prepared");
		System.out.println("Tossing Dough");
		System.out.println("Adding sauce");
		System.out.println("Adding toppings");
		for(int i=0; i< toppings.size(); i++) {
			System.out.println(" " + toppings.get(i));
		}
		
	}*/

	
	 public void bake() {
		System.out.println("Pizza is baked");
		
	}

	 public void cut() {
		System.out.println("Pizza is cut");
		
	}

	 public void box() {
		System.out.println("Pizza is boxed");
		
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", toppings=" + toppings + ", veggies="
				+ Arrays.toString(veggies) + ", cheese=" + cheese + ", clams=" + clams + "]";
	}
	 

}
