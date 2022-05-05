package com.training.model;

public class Student {

	private int rollNumber;
	private String firstName;
	private double markedScored;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", firstName=" + firstName + ", markedScored=" + markedScored
				+ "]";
	}
	public Student(int rollNumber, String firstName, double markedScored) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.markedScored = markedScored;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if(markScored<0) {
			
	throws new RuntimeException("Mark should be positive integer[0 - 100]");
		}else {
			this.rollNumber =rollNumber;
			this.firstName =firstName;
			this.markedScored = markedScored;
		}
	}
	public double getMarkedScored() {
		return markedScored;
	}
	public void setMarkedScored(double markedScored) {
		this.markedScored = markedScored;
	}
	
	
	
	
	
}
