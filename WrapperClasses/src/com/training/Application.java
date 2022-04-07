package com.training;

public class Application {

	public static void main(String[] args) {
//    System.out.println(args[0]);
//    
//    System.out.println(args[1]);
//    System.out.println(args[2]);
//    
//    
//	int value =Integer.parseInt(args[0]);
//	System.out.println(++value);
//	
	
		CurrencyConvertor conv = new CurrencyConvertor();
		
		double obj =Double. parseDouble(args[0]); 
		System.out.println(conv.inrToUsd(obj));

		double inrVal =Double. parseDouble(args[1]); //Autoboxing //double or Double
		System.out.println(conv.inrToEuro(inrVal));
	
	    double salary = 45000.00;
	    int intSal =(int)salary;
	    int intSal =Integer.parseInt(salary);
	    
	    int age=21;
	    String strAge =Integer.toString(age);
	      
	    int intAge = Integer.valueOf(strAge);
	}

}
