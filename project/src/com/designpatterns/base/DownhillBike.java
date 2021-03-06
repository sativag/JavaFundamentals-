package com.designpatterns.base;

public class DownhillBike extends MountainBike {
	public DownhillBike(WheelInterface wheel) {
		this(wheel, BikeInterface.Color.BLUE);
	}
	public DownhillBike(WheelInterface wheel, BikeInterface.Color color) {
		super(wheel, color);
	}
	@Override
	public float getPrice() {
		return 870.00f;
	}

}
