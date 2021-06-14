package com.car.decorate;

import java.io.Serializable;

public abstract class Car implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6422419776039372806L;
	public String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public abstract double  price();
		
	
	

}
