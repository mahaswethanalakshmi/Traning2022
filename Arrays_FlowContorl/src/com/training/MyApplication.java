package com.training;
import com.training.services.BankAccountServices;
import com.training.model.BankAccount;
import java.util.*;

public class MyApplication {


	public static void main(String[] args) {
    
		
		BankAccountServices service = new BankAccountServices();
		BankAccount[] list = new BankAccount[2];
		Scanner sc = new Scanner(System.in);
	  int choice=0;
	do {
		System.out.println("Enter Account Number :");
        int accountNumber =sc.nextInt();
        
        System.out.println("Enter Account Holder Name :");
		String accountHolderName = sc.next();
		
		System.out.println("Check Balance :");
		int balance = sc.nextInt();
		
		System.out.println("Account Type [savings,fixed,recurring] :");
		String accountType =sc.next();
		
	    BankAccount account = new BankAccount(accountNumber,accountHolderName,balance,accountType);
		int idx = 0;
		list[idx] = account; 
		
	
		System.out.println("Enter 0 to end , 1  to continue");
	    choice = sc.nextInt();
	
	}while(choice==1);
	    double[]  values  = service.findInterestByAccountType(list);	
				
	for(double eachvalue : values) {
		System.out.println(eachvalue);
	
	}
	
				
		sc.close();
		
	}
	
	
	}


