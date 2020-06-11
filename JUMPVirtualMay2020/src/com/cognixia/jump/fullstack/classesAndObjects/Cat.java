package com.cognixia.jump.fullstack.classesAndObjects;

public class Cat extends Animal { 
	
	private String type; 
	
	//Constructors - you can call a parent constructor, but it is not 
	//directly inherited 
	Cat() { 
		super(0, ""); 
		this.type = "";
	}
	
	Cat(int weight, String name, String type) { 
		//super = Animal
		super(weight, name); 
		this.type = type; 
	} 
	
	//override example
	//signature needs to be the same 
	@Override 
	public void move() { 
		System.out.println("The cat leaps!");
	} 
	
	@Override 
	public int noises(String sound, int volume) { 
		System.out.println("Cat overrode this method"); 
		return 1; 
	} 
	
	//overload example
	public void move(int x, int y) { 
		System.out.println("cat moves x dist " + x + " y dist " + y);
	} 

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	} 

}
