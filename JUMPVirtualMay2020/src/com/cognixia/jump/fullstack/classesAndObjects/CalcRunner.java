package com.cognixia.jump.fullstack.classesAndObjects;

public class CalcRunner {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator(5, 2); 
		
		System.out.println(calc.sum(4, 5)); 
		System.out.println(calc.multiply(5, 7)); 
		System.out.println(calc.divide(20, 6)); 
	}

}
