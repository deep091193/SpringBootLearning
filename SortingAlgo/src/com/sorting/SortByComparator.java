package com.sorting;

import java.util.Comparator;

public class SortByComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.rollNo-o2.rollNo;
	}

}
