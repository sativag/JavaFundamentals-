package com.fundamentals.data;

public class Dinosaur {
	
	private String scales;
	private String sharpTeeth;

	public Dinosaur(String sharpTeeth, String scales) {
		this.sharpTeeth = sharpTeeth;
		this.scales = scales;
	}
	
	public Dinosaur(String sharpTeeth) {
		this(sharpTeeth, "rough");
	}
	
	public void setScales(String scales) {
		this.scales = scales;
	}
	
	public String getScales() {
		return scales;
	}
	
	public void setSharpTeeth(String sharpTeeth) {
		this.sharpTeeth = sharpTeeth;
	}
	
	public String getSharpTeeth() {
		return sharpTeeth;
	}
	
	public void hunt() {
		System.out.println("The dinosaur hunted its prey");
	}
	
	

}
