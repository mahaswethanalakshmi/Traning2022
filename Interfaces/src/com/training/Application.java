package com.training;
import com.training.ifaces.CheckCondition;
import com.training.ifaces.Conditional;
import com.training.ifaces.Function;
import com.training.services.CurrencyConverter;;


public class Application {

	public static void main(String[] args) {

		//supertype = subtype
		Function conv = new CurrencyConverter();
		
		double response = conv.apply(200);
		System.out.println(Function.COUNTER);
		
		System.out.println(response);
		
		//line 10 ,11,14 are identical
		System.out.println(conv.apply(300));
		
		if(conv instanceof CheckCondition) {
			
			CheckCondition obj = (CheckCondition)conv;		// type casting
		System.out.println("Is Discount Allowed :="+ obj.test(300));
		}else {
			System.out.println("Cannot be cast");
		}
	
	Conditional condObj = new DiscountCalculator();
	
	System.out.println(condObj.test(5000));
	System.out.println(condObj.negate(5000));

	
	
	
	}

}
