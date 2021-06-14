package com.car.decorate;

public class AllRoundMusic extends Modifier {

	Car car;
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return car.getModel() + " " + "MusicEdition";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 75 + car.price();
	}

	public AllRoundMusic(Car car) {
		
		this.car = car;
	}

	
	
}
