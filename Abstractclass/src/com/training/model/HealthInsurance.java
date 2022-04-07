package com.training.model;


public class HealthInsurance extends Insurance{
	
	private String[] preExistingDiseases;

	public HealthInsurance(int policynumber, String policyHolderName, String[] preExistingDiseases) {
		super(policynumber, policyHolderName);
		this.preExistingDiseases = preExistingDiseases;
	}

	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePremium() {
		double premium = 10000;
		 for(String eachItem :preExistingDiseases ) {
			 String item = eachItem.toLowerCase();
			 if(eachItem.equalsIgnoreCase("bp") || eachItem.equalsIgnoreCase("sugar")) {
				 premium = 15000;
			 }
		 }
		
		return premium;
	}

	public HealthInsurance(String[] preExistingDiseases) {
		super();
		this.preExistingDiseases = preExistingDiseases;
	}

//	
//	@Override
//	public double calculatePremium() {
//		double premium = 10000;
//		 for(String eachItem :preExistingDiseases ) {
//			 String item = eachItem.toLowerCase();
//			 if(eachItem.equals("bp") || eachItem.equals("sugar")) {
//				 premium = 15000;
//			 }
//		 }
//		
//		return premium;
//	}

	
	
}