package com.car.decorate;

public class UltraLighting extends Modifier {

	Car car;
	

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return car.getModel() + " "  + "UltraLighting";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 60 + car.price();
	}

	public UltraLighting(Car car) {
		
		this.car = car;
	}

	
}
