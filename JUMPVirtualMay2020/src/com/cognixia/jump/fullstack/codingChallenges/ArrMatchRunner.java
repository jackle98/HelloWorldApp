package com.cognixia.jump.fullstack.codingChallenges;

public class ArrMatchRunner {

	public static void main(String[] args) {
		
		ArrMatch test = new ArrMatch(); 
		int[] arr1 = {1, 3, 5, 0}; 
		int[] arr2 = {0, 5, 1, 3}; 
		
		int[] arr3 = {3, 5, 4, 0}; 
		int[] arr4 = {0, 5, 1, 3}; 
		
		int[] arr5 = {3, 4, 4, 5, 0}; 
		int[] arr6 = {0, 3, 3, 4, 5};
		
		System.out.println(test.match(arr1, arr2)); 
		System.out.println(test.match(arr3, arr4)); 
		System.out.println(test.match(arr5, arr6));
		
	}

}
