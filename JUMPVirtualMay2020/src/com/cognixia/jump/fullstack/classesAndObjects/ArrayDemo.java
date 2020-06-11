package com.cognixia.jump.fullstack.classesAndObjects;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//declaring array
		int[] intArr1; 
		int intArr2[]; 
		Cat[] cats;
		
		//initializing
		intArr1 = new int[5]; 
		cats = new Cat[5];
		
		//declare and initialize 
		int[] intArr3 = {1, 2, 3, 4, 5};
		
		Cat[] litter = {new Cat(), new Cat(), new Cat(10, "Fluffy", "Tabby")}; 
		
		//initial values 
		System.out.println(Arrays.toString(intArr1));
		System.out.println(Arrays.deepToString(cats));
		
		//reading / writing / accessing array  
		System.out.println(litter[0]);
		intArr1[2] = 100; 
		
		litter[2] = null; 
		
		//iterating / looping through array 
		
		//Homogeneous and heterogeneous arrays (inheritance)
		
		//pass by value and pass by reference
		//pass by value is making copy of the data value for method
		System.out.println();
		int a = 4; 
		int b = 10;
		swapInts(a, b); 
		System.out.println(a + " " + b); 
		
		System.out.println();
		int[] ints = new int[2]; 
		ints[0] = a; 
		ints[1] = b;
		swapInts2(ints); 
		System.out.println(ints[0] + " " + ints[1]); 
		
		//pass by reference is referring to the specific address in heap memory
		//in heap memory; not making a copy
		

		
	}
	
	public static void swapInts(int a, int b) { 
		int temp = a;
		a = b; 
		b = temp;
		System.out.println(a + " " + b);
		
	} 
	
	public static void swapInts2(int[] ints) { 
		int temp = ints[0];
		ints[0] = ints[1]; 
		ints[1] = temp; 
		System.out.println(ints[0] + " " + ints[1]);
	}
	
	public static int[] swapInts3(int a, int b) { 
		int[] arr = {b, a}; 
		return arr;
	}

}
