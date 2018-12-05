package com.designpatterns.structural;

import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.AbstractBike;

public abstract class AbstractBikeOption extends AbstractBike {
	
	protected BikeInterface decoratedBike;
	
	public AbstractBikeOption(BikeInterface bike) {
		super(bike.getWheel());
		decoratedBike = bike;
	}

}
