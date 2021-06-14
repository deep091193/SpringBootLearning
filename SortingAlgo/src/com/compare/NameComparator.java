package com.compare;

import java.util.Comparator;

public class NameComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		// TODO Auto-generated method stub
		return m1.getName().compareTo(m2.getName());
	}

}
