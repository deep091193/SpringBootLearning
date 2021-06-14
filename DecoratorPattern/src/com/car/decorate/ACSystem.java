package com.car.decorate;

public class ACSystem extends Modifier {

	Car car;
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return car.getModel() + " " + "AC";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 500 + car.price();
	}

	public ACSystem(Car car) {
		
		this.car = car;
	}

	
}
