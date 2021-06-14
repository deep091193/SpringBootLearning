package com.car.decorate;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CarDealerShop {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Car car = new Sedan();
		
		//System.out.println(car.getModel() + " " +  car.price());
		car.setModel("Honda Citi");
		
		//System.out.println(car.getModel() + " " +  car.price());
		//
		car = new ACSystem(car);
		car = new UltraLighting(car);
		
		System.out.println(car.getModel() + " " +  car.price());
		
		
		
		Car car2 = new SUV();
		
		car2.setModel("Mahindra Scorpio");
		
		car2 = new ACSystem(car2);
		car2 = new AllRoundMusic(car2);
		
		
		System.out.println(car2.getModel() + " " + car2.price());
		
		
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D://CarDealer.txt"));
		
		outputStream.writeObject(car2);
		outputStream.close();
		
		System.out.println("File Written");

	}

}
