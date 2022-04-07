package com.training.model;

public abstract class Insurance {

	private int policynumber;
	private	String policyHolderName;
	public int getPolicynumber() {
		return policynumber;
	}
	public void setPolicynumber(int policynumber) {
		this.policynumber = policynumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	

	public Insurance(int policynumber, String policyHolderName) {
		super();
		this.policynumber = policynumber;
		this.policyHolderName = policyHolderName;
		
	}
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public abstract double calculatePremium();
	
	
	
}
