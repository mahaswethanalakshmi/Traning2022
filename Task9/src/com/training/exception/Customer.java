package com.training.exception;

public class Customer {

	private int customerId;
	private String customerName;
	private long phoneNumber;
	private String email;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, long phoneNumber, String email) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail( ) {
		this.email = email;
 }
		
	public void checkEmailId() throws Exception {
		if(this.email.contains("@")&&this.email.contains(".com")) {
			System.out.println("Valid email id");
		}
		else {
			throw new InvalidEmailException("Invalid Email Id");
		}
	}
		
   
    
	
	
	}

	
	
	


