package com.cognixia.jump.fullstack;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {  
		
		//Scanner used to get input 
		Scanner input = new Scanner(System.in); 
		
		//Prompt user for input 
		System.out.print("Please enter input: ");
		
		//Read the user input
		String userIn = input.nextLine(); 
		
		//Print the input to show what we stored / received it
		System.out.println(userIn);
		
		//Close the input 
		input.close(); 

	}

}
