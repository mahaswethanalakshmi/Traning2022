package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       BankAccount account= new BankAccount("ramesh",1000);
       System.out.println(account.getAccountHolderName()); 
       
       System.out.println(account.getUpdatedBalance(2000));
       System.out.println(account.getUpdatedBalance(7000));
       System.out.println(account.getUpdatedBalance(2000));

       System.out.println(account.getAccountNumber());
     //  System.out.println(BankAccount.getCount());
     //  System.out.println(BankAccount.getCount());
       
       
 BankAccount account2= new BankAccount("sunny",1000);
 System.out.println(account2.getAccountHolderName()); 

     System.out.println(account2.getUpdatedBalance(4000));
       
       System.out.println(account2.getAccountNumber());
	}}