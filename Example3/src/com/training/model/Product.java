package com.training.model;
import com.training.service.*;
public class Product {

	private int productID;
	private String productName;
	private double ratePerUnit;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productID, String productName, double ratePerUnit) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	
	
	
	
	
	
}
