package com.training.services;

import com.training.model.BankAccount;
import com.training.model.SavingsAccount;
import com.training.services.BankAccountServices;

public class SavingsAccountServices extends BankAccountServices {

	public String getCustomerInfo(SavingsAccount account) {
		
		return account.getAccountHolderName();		
	}

	@Override
		public double calculateInterest(BankAccount account) {
			double simpleInterest = 0.05;
			
		if(account.getAccountNumber()< 5000) {
			simpleInterest = 0.06;
			
		}
			return account.getBalance()*1*simpleInterest;
	}
	}
	
	
	

