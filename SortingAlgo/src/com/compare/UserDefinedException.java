package com.compare;

public class UserDefinedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7168617832169828761L;
	private static int acNo[]= {123,456,678,892};
	private static String name[]= {"Nitish","Rahul","samir","Raj"};
	private static double balnc[] = {100000.00,52000.00,89230.25,45623.00};
	
	UserDefinedException(){}
	
	UserDefinedException(String st){
		super(st);
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("ACCNO" + "\t" + "CUSTOMER" +
                    "\t" + "BALANCE");
			for(int i =0 ; i<5; i++) {
				System.out.println(acNo[i]+"\t"+name[i]+"\t"+balnc[i]);
				
				if(balnc[i]<50000) {
					throw new UserDefinedException("Balance is less than 50000");
				}
			}
		}catch (UserDefinedException e) {
			e.printStackTrace();
		}
	}
	
}
