package com.training.services;
import com.training.model.BankAccount;
public class Application {

	public static void main(String[] args) {
 BankAccountServices service = new BankAccountServices();
 BankAccount ram =new  BankAccount(1200, "Ramesh", 5000);
		double simpleInterest = service.calculateInterest(ram);
		System.out.println("Simple Interest @6%:" + simpleInterest);
		
		
		 BankAccount maha =new  BankAccount(6200, "Madesh", 5000);
			double simpleInterest2 = service.calculateInterest(maha);
			System.out.println("Simple Interest @5% :" + simpleInterest2);
		
//			BankAccount[] accounts =new BankAccount[2];
//			accounts[0]= ram;
//			accounts[1]= maha;
//		service.calculateInterest(accounts);	
		
			BankAccount[] accounts = {ram,maha};
			service.calculateInterest(accounts);
			
			System.out.println("============");
			double[] values = service.findInterest(accounts);
			for (double eachValue : values) {
				
				System.out.println(eachValue);
			}
			
			System.out.println("========ARRAYS=======");
			BankAccount[] accountList = {
					new BankAccount(800, "jai", 5000, "savings"),
					new BankAccount(800, "sam", 6000, "fixed"),
					new BankAccount(800, "bhai", 7000, "recurring")
					};
					
				double[] interestValues = service.findInterestByAccountType(accountList);
        for (double eachvalue : interestValues) {
	    System.out.println(eachvalue);
}

			}
		}

