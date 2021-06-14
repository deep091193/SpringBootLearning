package com.sorting;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		Integer[] arr = {52,25,29,8,87,42,68,12,5,37};
		Arrays.sort(arr, 1,10);
		//Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Modified Array[] : " + Arrays.toString(arr));

	}

}
