package com.demo1;

public class Customer {

	private String custName; //instance variable
	private int custId;
	private int custPhoneNo;
	private String custAddr;
	
	
	
	
	public Customer(String custName, int custId, int custPhoneNo, String custAddr) {
		super();
		this.custName = custName;
		this.custId = custId;
		this.custPhoneNo = custPhoneNo;
		this.custAddr = custAddr;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getCustPhoneNo() {
		return custPhoneNo;
	}
	public void setCustPhoneNo(int custPhoneNo) {
		this.custPhoneNo = custPhoneNo;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
	
}
// class Code{
//	
//}
