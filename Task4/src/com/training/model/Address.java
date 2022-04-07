package com.training.model;

public class Address {

	private int doorNumber;
	private String streetName;
	private String city;
	private int pinCode;
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int doorNumber, String streetName, String city, int pinCode) {
		super();
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.city = city;
		this.pinCode = pinCode;
	}
	public String toString() {
	return this.doorNumber +"  " +  this.streetName +"  " + this.city +"  " + this.pinCode;
	
	
	
}
}
