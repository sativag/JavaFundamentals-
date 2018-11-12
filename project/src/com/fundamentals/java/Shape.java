package com.fundamentals.java;

public abstract class Shape {
	private int length;
	private int width;
	
	public void setLength(int value) {
		this.length = value;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setWidth(int value) {
		this.width = value;
	}
	
	public int getWidth() {
		return width;
	}
	/**
	 * Since a static method doesn't support instances, it can be used 
	 * in an abstract class
	 * */
	public static int area(int length, int width) {
		return length * width;
	}
	
	// abstract method wth parameters must be overridden by a subclass
	abstract double area(double length, double width, double height);
	
	// abstract method must be overridden by a subclass
	abstract double area();
	
	// abstract method must be overridden by a subclass
	abstract String draw();
	
	

}
