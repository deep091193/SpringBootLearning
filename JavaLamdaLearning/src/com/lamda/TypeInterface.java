package com.lamda;

public class TypeInterface {

	public static void main(String[] args) {


	/*	LambdaType	lambda =  s -> s.length();
		
		System.out.println(lambda.getLength("Hello World"));*/
		
		
		printLambda(s -> s.length());

	}
	
	public static void printLambda(LambdaType l) {
		System.out.print(l.getLength("Deep"));
		
	}

	interface LambdaType {
		int getLength(String s);
	}
}
