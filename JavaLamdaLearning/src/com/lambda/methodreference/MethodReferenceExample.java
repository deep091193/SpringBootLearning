package com.lambda.methodreference;

public class MethodReferenceExample {

	public static void main(String[] args) {
		//print();
		//Thread t= new Thread(() -> print());
		Thread t= new Thread(MethodReferenceExample :: print);
		t.start();

	}
	
	public static void print(){
		System.out.println("Hello");
	}

}
