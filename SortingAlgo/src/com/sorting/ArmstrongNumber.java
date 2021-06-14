package com.sorting;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 165;
		armstrongCheck(num);
		
	}

	private static void armstrongCheck(int num) {
		int sum = 0;
		int temp = 0;
		temp = num;
		while(num > 0){
		int a = num % 10;
		num = num/10;
		
		
		sum = sum + (a*a*a);
		}
		if(temp ==  sum){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}

}
