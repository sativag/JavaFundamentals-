package com.fundamentals.data;

public class Quiz1 {

	public void gradeExample(char value) {
		String grade;
		switch(value) {
		case 'e':
		case 'E':
			grade = "Excellent";
			break;
		case 'v':
		case 'V':
			grade = "Very Good";
			break;
		case 'g':
		case 'G':
			grade = "Good";
			break;
		case 'a':
		case 'A':
			grade = "Average";
			break;
		case 'f':
		case 'F':
			grade = "Fail";
			break;
			default:
				grade = "Not a valid grade";
				break;
			
		}
		System.out.println(grade);
	}
	
	public void evenNumbers() {
		for(int i = 0; i<100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public void oddNumbers() {
		for(int i = 0; i<100; i++) {
			if(i % 2 == 0) {
				if(i == 0) {
					continue;
				}
				System.out.println(i-1);
			}
		}
	}
	

	}

