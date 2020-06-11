package com.cognixia.jump.fullstack.codingChallenges;

public class ArrayPlus { 
	
	int divisor; 
	
	ArrayPlus() { 
		divisor = 5;
	}
	
	ArrayPlus(int divisor) { 
		
		this.divisor = divisor;
		
	}
	
	public void plus(int num, int preNum) { 
		int resultInt = 0; 
		String resultStr;
		
		if(num % divisor == 0) { 
			resultStr = Integer.toString(preNum) + Integer.toString(num); 
			System.out.println(resultStr);
		} 
		else { 
			resultInt = preNum + num; 
			System.out.println(resultInt);
		}
		
	}

}
