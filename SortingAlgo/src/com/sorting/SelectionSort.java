package com.sorting;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		for(int i =0 ; i< arr.length-1; i++) {
			int index = i;
			
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j]<arr[index]) {
					index = j;// lowest number
				}
			}
			
			int smallNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallNumber;
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = {12,2,9,45,13,27,8};
		System.out.println("Before Sort");
		for(int z : arr1) {
			System.out.print(z+" ");
		}
		System.out.println();
		
		selectionSort(arr1);
		
		System.out.println("After Sort");
		for(int z: arr1) {
			System.out.println(z+" ");
		}
		System.out.println();

	}

}
