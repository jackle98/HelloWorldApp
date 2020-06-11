package com.cognixia.jump.fullstack.interfaces;

public interface Calculator {
	
	//attributes 
	double PI = 3.14; 
	
	static int sum(int... inputs) { 
		int sum = 0;
		for(int i : inputs) { 
			sum+=i;
		}
		return sum;
		
	} 
	
	default int multiply(int... inputs) { 
		int mult = 1; 
		for(int i : inputs) { 
			mult*=i;
		}
		return mult;
	}

}
