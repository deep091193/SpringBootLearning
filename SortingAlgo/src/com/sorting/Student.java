package com.sorting;

public class Student {

	 int rollNo ;
	 String name;
	 String address;
	
	
	public Student(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return this.rollNo + " " + this.name +
                " " + this.address;
	}
	
	
}
