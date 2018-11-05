package com.fundamentals.java;

public class Leopard extends Cat {
	private String bigPaws;
	
	public void setBigPaws(String bigPaws) {
		this.bigPaws = bigPaws;
	}
	
	public String getBigPaws() {
		return bigPaws; 
	}
	@Override
	public void jump() {
		super.jump();
		System.out.println("The leopard jumped higher");
	}
	
}
