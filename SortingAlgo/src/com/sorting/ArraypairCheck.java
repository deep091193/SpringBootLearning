package com.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.sun.org.apache.regexp.internal.recompile;

public class ArraypairCheck {

	public static void main(String[] args) {
		int num[] = {8,7,6,4,2,3,5};
		int sum = 10;
		//int n = num.length;
		findPair(num, sum);
	 
		
	}

	
	
	static void findPair(int num[],  int sum)
	{
		/*O(n2) complexity*/
		
		/*// consider each element except last element
		for (int i = 0; i < n - 1; i++)
		{
			// start from i'th element till last element
			for (int j = i + 1; j < n; j++)
			{
				// if desired sum is found, print it and return
				if (num[i] + num[j] == sum)
				{
					System.out.printf("Pair found at index %d and %d", i, j);
					return;
				}
			}
		}
	 
		// No pair with given sum exists in the array
		System.out.println("Pair not found");*/
		
		
		/*O(nlog(n)) complexity*/
		
		/*Arrays.sort(num);
		int low = 0;
		int high = num.length-1;
		
		while(low<high) {
			if(num[low]+num[high] == sum) {
				System.out.println("Found");
			}
			
			// increment low index if total is less than the desired sum
						// decrement high index is total is more than the sum
						if (num[low] + num[high] < sum) {
							low++;
						} else{
							high--;
						}
						
						// No pair with given sum exists in the array
						System.out.println("Pair not found");
		}*/
		
		
		/*O(n) complexity*/
		Map<Integer, Integer> inMap = new HashMap<>();
		
		for(int i = 0 ; i <num.length; i++) {
			if(inMap.containsKey(sum - num[i])) {
				System.out.println("Pair Found" + inMap.get(sum-num[i]) + " " + i);
				return;
			}
			inMap.put(num[i], i);
			
			System.out.println("Not Found");
		}
		
	}
}
