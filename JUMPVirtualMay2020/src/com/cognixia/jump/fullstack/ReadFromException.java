package com.cognixia.jump.fullstack;

import java.util.Scanner;

public class ReadFromException {
	
	public static void main(String[] args) {  
		
//		//Scanner used to get input 
//		Scanner input = new Scanner(System.in);
//		int userIn = 0;
//		
//		//Prompt user for input 
//		System.out.print("Please enter a number: ");
//		
//		//Read the user input
//		try {
//		userIn = input.nextInt();
//		} catch(Exception e) { 
//			System.out.println("Please enter only integers!");
//		} finally { 
//			input.close();
//		}
//		
//		//Print the input to show what we stored / received it
//		System.out.println(userIn); 
	
		int userIn = 0;
		
		while (true) {

			System.out.print("Please enter a number: ");
			boolean valid = false;
			Scanner input = new Scanner(System.in);
		
			try {
				valid = input.hasNextInt(); 
				userIn = input.nextInt();
			} catch (Exception e) {
				System.out.println("Please enter only integers!");
			} finally {
				if(valid) {
					assert userIn > 0 : "Please not negative!";
					System.out.println(userIn);
					System.out.println("We are done."); 
					input.close(); 
					return;
				}
				
			}
		
		}
	}		
}
