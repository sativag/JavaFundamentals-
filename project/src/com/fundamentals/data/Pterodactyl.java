package com.fundamentals.data;

public class Pterodactyl extends Dinosaur {
	
	public Pterodactyl(String sharpTeeth, String scales) {
		super(sharpTeeth, scales);
	}
	
	@Override
	public void hunt() {
		System.out.println("The Pterodactyl flew after its prey");
	}
	
	public void makeNest() {
		System.out.println("Pterodactyls make nests");
		
	}

}
