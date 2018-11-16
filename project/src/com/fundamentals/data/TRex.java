package com.fundamentals.data;

public class TRex extends Dinosaur {
	
	public TRex(String sharpTeeth, String scales) {
		super(sharpTeeth, scales);
	}
	
	public TRex(String sharpTeeth) {
		super(sharpTeeth, "scales");
	}
	@Override
	public void hunt() {
		System.out.println("The TRex ran after its prey");
	}
	
	public void shortArms() {
		System.out.println("The TRex has short arms");
		
	}

}
