package com.cognixia.jump.fullstack.strings;

public class StringDemo {

	public static void main(String[] args) {
		
		//String pool demo (memory)
		String s1 = "s1"; 
		String s2 = "s2"; 
		String s3 = "s1";
		String s4 = new String("s1"); 
		String s5 = s4;
		
		//using hashcode can't distinguish memory in String
		System.out.println(s1.hashCode() + " " + s2.hashCode() + " " + s3.hashCode() + " " + s4.hashCode() + " " + s5.hashCode());
		//== checks for same address only 
		System.out.println((s1==s2) + " " + (s1==s3) + " " + (s1==s4) + " " + (s1==s5) + " " + (s4==s5));
		//.equals checks the actual contents of the String
		System.out.println(s1.equals(s2) + " " + s1.equals(s3) + " " + s1.equals(s4) + " " + s1.equals(s5) + " " + s4.equals(s5));
		//checking .contentEquals() method 
		System.out.println(s1.contentEquals(s2) + " " + s1.contentEquals(s3) + " " + s1.contentEquals(s4) + " " + s1.contentEquals(s5) + " " + s4.contentEquals(s5));

		//String instance methods
		System.out.println();
		String testString = "Someone give me a sentence here.";
		System.out.println(testString.charAt(5)); 
		System.out.println(testString.indexOf('e', 9)); 
		System.out.println(testString.substring(5)); 
		System.out.println(testString.substring(5, 11));
		
		//String static methods 
		System.out.println();
		boolean b = true; 
		boolean c = true;
		String s = String.valueOf(b); 
		String x = String.valueOf(c); 
		//System.out.println(b + c); doesn't work (two booleans)
		System.out.println(s + x);
		
		
		//loop through String
		System.out.println(); 
		for(int i=0; i<testString.length(); i++) { 
			char[] temp = testString.toCharArray();
			System.out.println(testString.charAt(i));
			System.out.println(temp[i]); 
			System.out.println(testString.toCharArray()[i]);
			
		}
		
		//StringBuilder and StringBuffer
		System.out.println();
		StringBuilder builder = new StringBuilder("Starter String"); 
		System.out.println(builder.reverse().toString());
		
		StringBuilder build2 = new StringBuilder();
		build2.append("Hello"); 
		System.out.println(build2);
		
		StringBuffer buff = new StringBuffer(builder);
		System.out.println(buff);
		
		
		
		System.out.println();
		System.out.println(sum(1, 2, 3, 4)); 
		System.out.println(sum(2, 4));
		
		
	}
	
	//show ellipses... (lets you enter variable number of thing, inputs is a created array)
	public static int sum(int... inputs) { 
		int sum = 0; 
		for(int i : inputs) { 
			sum += i; 
		}
		return sum;
	}
	
}
