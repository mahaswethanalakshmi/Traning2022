package com.training;

import com.training.exception.Customer;
import com.training.exception.InvalidEmailException;

public class Application {

	public static void main(String[] args) {

		
		Customer cust= new Customer(404, "riya", 12344 ,"riya.com.in");
		
		try {
			cust.checkEmailId();
		}catch(Exception e){
			System.out.println("ERROR");
			e.printStackTrace();
			
		}
		
	
	}

}
