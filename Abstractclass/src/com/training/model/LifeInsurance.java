package com.training.model;

public class LifeInsurance extends Insurance {

	private int age;

	public LifeInsurance(int policynumber, String policyHolderName, int age) {
		super(policynumber, policyHolderName);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public double calculatePremium() {
		double premium ;
		if(age < 50) {
			premium=5000; 
		}else {
			 premium = 10000;
		}
		
		return premium;
		
	}
	
	
	
	
}
