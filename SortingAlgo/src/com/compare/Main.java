package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie(8.4,"Star Wars",1975));
		movies.add(new Movie(8.0,"MI5",2016));
		movies.add(new Movie(8.9,"Inception",2012));
		movies.add(new Movie(7.4,"Journey",2002));
		movies.add(new Movie(7.2,"Top Gun",1986));
		
		System.out.println("After Rating Sort");
		
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(movies, ratingCompare);
		for(Movie m : movies) {
			System.out.println(m.getName() +" " + m.getRating() + " " + m.getYear());
		}
		System.out.println("\n");
		NameComparator nameComparator = new NameComparator();
		System.out.println("After Name Sort");
		Collections.sort(movies, nameComparator);
		for(Movie m : movies) {
			System.out.println(m.getName() +" " + m.getRating() + " " + m.getYear());
		}
		System.out.println("\n");
		System.out.println("After Year Sort");
		Collections.sort(movies);
		for(Movie m : movies) {
			System.out.println(m.getName() +" " + m.getRating() + " " + m.getYear());
		}
		/*Collections.sort(movies);
		
		System.out.println("Movies after sorting :");
		
		for(Movie m : movies) {
			System.out.println(m.getName() +" " + m.getRating() + " " + m.getYear());
		}
*/
	}

}
