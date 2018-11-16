package com.fundamentals.java;

public class House implements HomeInterface, PlumbingInterface {

	private String windows;
	
	private String doors;
	
	private boolean hasStairs;
	
	/*Class variable not associated with a given property*/
	protected String value = "My House";
	
	
	/*Default Constructor with a println*/
	public House() {
		System.out.println("My default constructor");
	}
	
	public House(String windows) {
		this.windows = windows;
	}
	
	public House(String windows, String doors) {
		this.windows = windows;
		this.doors = doors;
	}
	
	public void setWindows(String value) {
		this.windows = value;
	}
	
	public String getWindows() {
		return windows; 
	}
	
	public void setDoors(String doors) {
		this.doors = doors;
	}
	
	public String getDoors() {
		return doors;
	}
	
	public void setHasStairs(boolean value) {
		this.hasStairs = value;
	}
	
	public boolean getHasStairs() {
		return hasStairs;
	}
	
	public void openDoor() {
		System.out.println("I opened a Steel Door");
	}
	
	public void closeDoor() {
		
	}

	@Override
	public void decorate() {
		// TODO Auto-generated method stub
		System.out.println("Decorate House");
	}

	@Override
	public void installPlumbing() {
		// TODO Auto-generated method stub
		System.out.println("Installing Plumbing");
	}

	@Override
	public void supplementWork() {
		// TODO Auto-generated method stub
		System.out.println("Supplement Work");
	}
}
