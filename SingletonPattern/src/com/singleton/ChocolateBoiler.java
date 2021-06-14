package com.singleton;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;
	private volatile static ChocolateBoiler uniqueInstance;
	//Volatile keyword ensures that multiple threads handle 
	//the uniqueInstance correctly when initialized in Singleton instance
	
	/*public ChocolateBoiler() {
		empty= true;
		boiled= false;
	}*/
	
	//Constructor Private for singleton
	private ChocolateBoiler() {
		empty= true;
		boiled= false;
	}
	
	
	//Only Method that can give global access to the class
	
	// For multithreading Problem Fix synchronized is used
	public static synchronized ChocolateBoiler getInstance() {
		if(uniqueInstance == null) {
			//Double Checked Locking to reduce the use of synchronized
			synchronized (ChocolateBoiler.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new ChocolateBoiler();
				}
			}
			
		}
		return uniqueInstance;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty= false;
			boiled= false;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			//contents to boil.
			
			boiled = true;
		}
		
	}

	private void drain() {
		if(!isEmpty() && isBoiled()) {
			// drain the things
			empty= true;
		}

	}

	private boolean isBoiled() {
		// TODO Auto-generated method stub
		return boiled;
	}


	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return empty;
	}
	
}
