package com.cognixia.jump.fullstack.classesAndObjects;

public class AnimalRunner {

	public static void main(String[] args) {
		
		//objects
		Animal ani1 = new Animal(); 
		Animal ani2 = new Animal(); 
		Animal ani3 = new Animal(30, "Dog");  
		
		//System.out.println(ani3.weight);
		//ani3.weight = 50; 
		//System.out.println(ani3.weight); 
		
		Cat cat = new Cat(); 
		//cat.move(); 
		
		Cat cat1 = new Cat(10, "Whiskers", "Siamese"); 
		
		System.out.println(cat1.getWeight());
		cat1.setWeight(30); 
		System.out.println(cat1.getWeight()); 
		
		ani1.move(); 
		cat.move(); 

	}

}
