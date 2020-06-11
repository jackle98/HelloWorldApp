package com.cognixia.jump.fullstack.codingChallenges;

import java.util.Scanner;

public class ArrayPlusRunner {

	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in); 
		int arrNum;
		int divisor;
		
		System.out.print("Enter length of the array: "); 
		int length = input.nextInt(); 
		int[] testArr = new int[length];
		
		for(int i = 0; i<(length); i++) { 
			System.out.print("Enter array inputs (one at a time): ");
			input = new Scanner(System.in);
			arrNum = input.nextInt(); 
			testArr[i] = arrNum;
		} 
		
		System.out.print("Enter divisor: ");
		divisor = input.nextInt(); 
		
		ArrayPlus adder = new ArrayPlus(divisor);  
		
		for (int i=0; i<testArr.length; i++) { 
			if(i == 0) { 
				adder.plus(testArr[i], testArr[i]);
			} 
			else {
				adder.plus(testArr[i], testArr[i-1]); 
			}
			
		} 
		
		input.close();
		
	}

}
