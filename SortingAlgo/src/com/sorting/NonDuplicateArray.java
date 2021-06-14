package com.sorting;

public class NonDuplicateArray {

	public static int duplicateRemove(int[] arr,int n ) {
		/*For Checking empty array or single element*/
		if(n== 0 || n== 1) {
			return n;
		}
		
		int [] temp = new int[n];
		int j= 0;
		/*Traverse starting*/
		for(int i =0; i<n-1 ; i++) {
			
			/*checking with next element is equal or not*/
			
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		/*storing last element whether it is repeated or not*/
		temp[j++] = arr[n-1];
		
		/*Modify Original array*/
		for(int i = 0; i<j ; i++) {
			arr[i] = temp[i];
		}
		return j;
	}
	
	public static void main(String[] args) {
		int[] arr = {21,12,12,1,1,5,5,5,45,45};
		int length = arr.length;
		length = duplicateRemove(arr, length);
		
		for(int i = 0; i<length ; i++) {
			System.out.println(arr[i]+ " ");
		}
	}
}
