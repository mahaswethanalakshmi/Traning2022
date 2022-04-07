package com.training.model;

import com.training.services.BankAccountServices;
import com.training.services.SavingsAccountServices;

public class Application {

	public static void main(String[] args) {

	 BankAccount ramsAccount = new BankAccount(1010, "Ramesh", 50000, "savings");
	 System.out.println(ramsAccount);	
		
		SavingsAccount account = new SavingsAccount(650, "madhu", 678, "joint", "madesh");
		System.out.println(account.getAccountHolderName());
		System.out.println(account.getNominee());
        
		SavingsAccountServices service = new SavingsAccountServices();
	
		System.out.println(service.getCustomerInfo(account));
		System.out.println(service.calculateInterest(account));
		
		BankAccountServices service2 = new SavingsAccountServices();
		
		//cannot access the sub class method with super class reference
		//service2.getCustomerInfo(account);
		
		SavingsAccountServices savingServices2 = (SavingsAccountServices)service2;
      // (SavingsAccountServices).sc2
		
		System.out.println(savingServices2.getCustomerInfo(account));
	}

}
