package com.training.model;

import com.training.ifaces.Automobile;

public class ToyotoCar implements Automobile {

		
	
	
	@Override
	public String getColor() {
		return "Blue";
	}

	@Override
	public String getModel() {
		return "Fortuner";
	}

	@Override
	public double getPrice() {
		return 1500456.67;
	}

}
