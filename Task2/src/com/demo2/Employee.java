package com.demo2;

public class Employee {

	private String empName; //instance variable
	private int empId;
	public Employee(String empName, int empId, int empPhoneNo, double empSalary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empPhoneNo = empPhoneNo;
		this.empSalary = empSalary;
	}

	private int empPhoneNo;
	private double empSalary;
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpPhoneNo() {
		return empPhoneNo;
	}
	public void setEmpPhoneNo(int empPhoneNo) {
		this.empPhoneNo = empPhoneNo;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}

