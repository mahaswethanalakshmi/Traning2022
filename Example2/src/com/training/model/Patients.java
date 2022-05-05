package com.training.model;

public class Patients {

	private int patientId;
	private String patientName;
	private String location;
	private long mobileNumber;
	public Patients() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patients(int patientId, String patientName, String location, long mobileNumber) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.location = location;
		this.mobileNumber = mobileNumber;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Patients [patientId=" + patientId + ", patientName=" + patientName + ", location=" + location
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
