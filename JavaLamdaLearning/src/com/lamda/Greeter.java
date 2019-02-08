package com.lamda;

public class Greeter {
	
	public void greeting(Greeting greeting){
		greeting.perform();
		
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		//HelloGreeting helloGreeting = new HelloGreeting();
		Greeting lambdaGreeting = () -> System.out.println("Hello Sudipta");
		greeter.greeting(lambdaGreeting);
		
		

	}

}
