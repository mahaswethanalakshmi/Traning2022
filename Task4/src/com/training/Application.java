package com.training;

import com.training.model.Address;
import com.training.model.MobileBill;

public class Application {

	public static void main(String[] args) {

	Address addr = new Address(184, "KavalcheriRoad" ,"Chennai" , 600124);
	
	MobileBill bill = new  MobileBill("maha", 1234567890 , "prepaid" , addr);
	
	System.out.println(MobileBill.serviceProvider);
	System.out.println(bill.getAddress());
	System.out.println(bill.findAmount());	
		
	
		
		
		
	}

}
