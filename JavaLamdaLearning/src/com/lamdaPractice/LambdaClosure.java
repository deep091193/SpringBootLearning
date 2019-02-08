package com.lamdaPractice;

public class LambdaClosure {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		doProcess(a, i -> System.out.println(i + b));
		
		/*whenever Lambda Expression or anonymous Inner Class uses a value
         from the closure which is not in its functional interface it freezes its value
         it actually makes the variable Final irrespective of you declare it or not*/
		
	}

	private static void doProcess(int i, Process p) {
		p.process(i);
		
	}
	interface Process{
		void process(int i);
	}

}
