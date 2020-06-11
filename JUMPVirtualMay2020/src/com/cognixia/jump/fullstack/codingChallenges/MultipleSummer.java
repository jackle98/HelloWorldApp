package com.cognixia.jump.fullstack.codingChallenges;

import java.util.Scanner;

public class MultipleSummer {
	
	Scanner input;
	int userInput; 
	int sum;
	int min = 1; 
	int max = 100;
	
	public void sumUp() { 
		
		do { 
			
			System.out.println("Enter a minimum: "); 
			input = new Scanner(System.in);
			min = input.nextInt(); 
			
			System.out.println("Enter a maximum: "); 
			input = new Scanner(System.in);
			max = input.nextInt(); 
			
			System.out.print("Enter a number between " + min + "and " + max/2 + "(Enter 0 to quit): ");
			input = new Scanner(System.in);
			userInput = input.nextInt(); 
			
			sum = 0;
			
			if(userInput > max/2 || userInput < min) { 
				System.out.println();
				System.out.println("Please enter a positive number less than " + max/2);
				continue; 
			} 
			
			if(userInput == 0) { 
				break; 
			}
			
			for(int i = min; i <= max; i++) { 
				if(i % userInput == 0) { 
					sum += i; 
				}
			}
			
			System.out.println("The sum of multiples of " + userInput + " is: " + sum); 
			System.out.println(); 
		}while(true); 
		
		System.out.println(); 
		System.out.println("Have a nice day!");
		
	}
	

}
