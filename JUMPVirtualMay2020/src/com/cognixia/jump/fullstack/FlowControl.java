package com.cognixia.jump.fullstack;

import java.util.Scanner;

public class FlowControl {

	public static void main(String[] args) {
		
		//Scanner used to get input 
		Scanner input = new Scanner(System.in); 
				
		//Prompt user for input 
		//System.out.print("Please enter a number: ");
				
		//Read the user input
		//int userInput = input.nextInt(); 
		
		//Flow control stuff starts here: 
		
//		boolean condition = userInput >= 0; 
//		
//		if(condition) { 
//			System.out.println("Your number is positive!"); 
//		}  
//		else if (userInput > -10) { 
//			System.out.println("That is a thing.");
//		}
//		else { 
//			System.out.println("Your number is negative!");
//		}
//		
//				
//		//Print the input to show what we stored / received it
//		System.out.println(userInput);
		
		for(int i = 0; i < 10; i++) { 
			System.out.println(i);
		}
		
		//Close the input 
		input.close();  

	}

}
