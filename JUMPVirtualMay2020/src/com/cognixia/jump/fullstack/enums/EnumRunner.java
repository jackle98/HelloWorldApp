package com.cognixia.jump.fullstack.enums;

public class EnumRunner {

	private enum Days{ 
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	} 
	
	public static void main(String[] args) { 
		daysRunner(); 
		gradeRunner(); 
		
	}
	
	public static void daysRunner() { 
		System.out.println(Days.FRIDAY);
	} 
	
	public static void gradeRunner() { 
		Grade grade = Grade.SENIOR;
		
		System.out.println(grade.ordinal());
		
		System.out.println(grade.name());
		
		grade.hello(); 
		
		switch(grade) { 
			case FRESHMAN:
				System.out.println("Freshman!");
				break;
			case SOPHMORE: 
				System.out.println("Sophmore!");
				break;
			case JUNIOR: 
				System.out.println("Junior!");
				break;
			case SENIOR: 
				System.out.println("Senior!");
				break;
			default: 
				System.out.println("Not a valid grade level!");
				break;
		}
		
	}

}
