package com.compare;

import java.util.Arrays;

public class Anagram {
	
	public static void isAnagram(String s1, String s2) {
		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");
		boolean status = true;
		if(str1.length()!= str2.length()) {
			status = false;
		}else {
			char[] ArrayStr1 = str1.toLowerCase().toCharArray();
			char[] ArrayStr2 = str2.toLowerCase().toCharArray();
			Arrays.sort(ArrayStr1);
			Arrays.sort(ArrayStr2);
			status = Arrays.equals(ArrayStr1, ArrayStr2);
		}
		if(status) {
			System.out.println(str1+" "+ "and " +str2 +" "+ "is anagram");
		}else {
			System.out.println(str1+" "+ "and "+str2 +" "+ "is not anagram");
		}
	}

	public static void main(String[] args) {
		isAnagram("Keep", "Peek");
		isAnagram("Digital", "Octal");
		
		/*String s1 = "gkagsdjkgajkgjk  gjkgjkagjkgajksdgb";
		String str = s1.replaceAll("\\s", "");
		System.out.println(str);*/

	}

}
