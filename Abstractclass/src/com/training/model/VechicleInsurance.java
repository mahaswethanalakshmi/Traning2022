package com.training.model;

public class VechicleInsurance extends Insurance {

	private String vehicleModel;
	private int yearOfManufacture;
	
//	@Override
//	public double calculatePremium() {
//		
//		return 0;
//	}

	
	@Override
	public double calculatePremium() {
		double premium = 1000;
		if(yearOfManufacture < 2020 && vehicleModel.equals("car"))
		{
		   premium = 2000;
		  }
		return premium;
		}
		
	public VechicleInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VechicleInsurance(int policynumber, String policyHolderName) {
		super(policynumber, policyHolderName);
		// TODO Auto-generated constructor stub
	}

	public VechicleInsurance(int policynumber, String policyHolderName, String vehicleModel,
			int yearOfManufacture) {
		super(policynumber, policyHolderName);
		this.vehicleModel = vehicleModel;
		this.yearOfManufacture = yearOfManufacture;
	}

	
	
	
}
