package com.cognixia.jump.fullstack.codingChallenges;

public class ArrMatch {
	
	public boolean match(int[] arr1, int[] arr2) { 
		boolean check = true; 
		for(int num1 : arr1) { 
			if(check == false) { 
				break;
			}
			for(int num2 : arr2) { 
				if(num1 == num2) { 
					check = true;
					break;
				} 
				else {
					check = false;
				}
				
			}
		} 
		return check;
		
	} 

}
