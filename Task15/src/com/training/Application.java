package com.training;

import com.training.ifaces.Automobile;
import com.training.model.ObjectFactory;

public class Application {

	public static void main(String[] args) {

		ObjectFactory factory = new ObjectFactory();
		Automobile toyo = factory.getObject(1);
	    factory.printQuote(toyo);
	    
	    
	   System.out.println("      ");
	    Automobile maru = factory.getObject(2);
		factory.printQuote(maru);
		
		
		
	}

}
