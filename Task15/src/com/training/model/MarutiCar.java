package com.training.model;

import com.training.ifaces.Automobile;

public class MarutiCar implements Automobile {

	@Override
	public String getColor() {
		return "Ash";
	}

	@Override
	public String getModel() {
		return "Ertiga";
	}

	@Override
	public double getPrice() {
		return 709876.66;
	}

}
