package com.lamda;

public class RunnableExample {

	public static void main(String[] args) {

 
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread is running");
				
			}
		});

		thread.run();
		
		
		Thread myLambdaThread = new Thread(() -> System.out.println("Thread is running"));
	
		myLambdaThread.run();
	}

}
