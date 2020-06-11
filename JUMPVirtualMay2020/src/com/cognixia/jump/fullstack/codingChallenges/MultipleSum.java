package com.cognixia.jump.fullstack.codingChallenges;

import java.util.Scanner;

public class MultipleSum {

	public static void main(String[] args) { 
		
		MultipleSummer summer = new MultipleSummer(); 
		summer.sumUp();
		
		Scanner input;
		int userInput;
		int sum = 0;  
		
		do { 
			System.out.print("Enter a number between 1 and 50 (Enter 0 to quit): ");
			
			input = new Scanner(System.in);
			userInput = input.nextInt();
			
			if(userInput > 50 || userInput < 0) { 
				System.out.println();
				System.out.println("Please enter a positive number less than 50.");
				continue; 
			} 
			
			if(userInput == 0) { 
				break; 
			}
			
			for(int i = 1; i <= 100; i++) { 
				if(i % userInput == 0) { 
					sum += i; 
				}
			}
			
			System.out.println("The sum of multiples of " + userInput + " is: " + sum); 
			System.out.println(); 
			sum = 0;
		}while(true);
		
		System.out.println();
		System.out.println("Have a nice day!"); 
		input.close();

	}

}
