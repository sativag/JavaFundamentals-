package com.fundamentals.data;

public class Quiz2 {
	
	private String one = "Hello";
	
	String two = "Java";
	
	protected int three = 10;
	
	public boolean isValid = true;
	
	// My answer
	public static void questionTwo() {
		int i = 10;
		i--;
		System.out.println(i);
		
	}
	// Teachers answer (added if/else statement)
	public static int mySubtraction(int value1, int value2) {
		int total = 0;
		if(value1 > value2) {
			total = value1 - value2;
		} else {
			total = value2 - value1;
		}
		return total;
	}

}
