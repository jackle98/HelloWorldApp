package com.cognixia.jump.fullstack.classesAndObjects;

public class Calculator {
	
	int a; 
	int b; 
	
	Calculator(int a, int b) { 
		this.a = a; 
		this.b = b;
		
	} 
	
	public int sum(int num1, int num2) { 
		return num1 + num2;
	} 
	
	public int multiply(int num1, int num2) { 
		return num1 * num2;
	} 
	
	public double divide(double dividend, double divisor) { 
		return dividend / divisor; 
	}

}
