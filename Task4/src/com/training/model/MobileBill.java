package com.training.model;

public class MobileBill {
	
	private String customerName;
	private long mobileNumber;
	private String planName;
	private Address address;
	public static final String serviceProvider = "JIO";
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public MobileBill(String customerName, long mobileNumber, String planName, Address address) {
		super();
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.planName = planName;
		this.address = address;
		
	}
	public MobileBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double findAmount() {
		 double amount =0;
		 String plan =getPlanName().toLowerCase();
		 switch (plan) {
		case "prepaid" :
			amount = 200;
			break;
		case "postpaid" :
			amount = 300;
			break;
		default:
       System.out.println("Enter The Valid Plan:");		}
		return amount;
	}
	
	
	
	
}

