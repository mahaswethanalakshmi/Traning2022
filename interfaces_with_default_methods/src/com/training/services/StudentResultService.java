package com.training.services;

import com.training.ifaces.Conditional;

public class StudentResultService implements Conditional<Double> {

	@Override
	public boolean test(Double t) {
		return t>80	;
	}

	
	
}
