package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringReverse {

	public static void main(String[] args) {
		String s= "India is great";
		char[] hello = s.toCharArray();
		List<Character> trial = new ArrayList();
		for(char c : hello) {
			trial.add(c);
			
		}
		Collections.reverse(trial);
		for(char i : trial) {
			System.out.println(i);
		}
		/*ListIterator li = trial.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}*/
		
	/*	StringBuilder builder = new StringBuilder();
		builder.append(s);
		builder = builder.reverse();
		System.out.println(builder);*/
	}
}
