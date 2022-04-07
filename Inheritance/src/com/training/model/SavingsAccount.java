package com.training.model;
import  com.training.model.BankAccount;
import com.training.model.SavingsAccount;

public class SavingsAccount extends BankAccount {
   
	private String nominee;
   // Whenever sub class constructor is called its super class
   // constructor also called,event if super() keyword is not present
//	
//	public SavingsAccount() {
//
//		super();
//		System.out.println("Constructor of SUB CLASS called");
////	}
//
//public SavingsAccount() {
//	
//	super(100, "ram", 5000);
//	System.out.println("Constructor of SUB CLASS called");

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.nominee = nominee;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	
	
	
}
