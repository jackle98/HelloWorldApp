package com.cognixia.jump.fullstack.classesAndObjects;

public class Animal {
	
	//Attributes
	private int weight;
	private String name;
	
	//Constructors 
	Animal() {  
		this.name = ""; 
		this.weight = 0; 
	} 
	
	Animal(int weight, String name) {  
		this.name = name; 
		this.weight = weight; 
	}
	
	//Methods 
	public void move() { 
		System.out.println("The animal moves!");
	} 
	
	public int noises(String sound, int volume) { 
		System.out.println("the animal makes a " + sound + " at volume " + volume); 
		return volume; 
	}
	
	public int getWeight() { 
		return weight; 
	}
	
	public void setWeight(int weight) { 
		this.weight = weight; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
}
