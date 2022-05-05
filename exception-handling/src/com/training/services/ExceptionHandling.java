package com.training.services;

public class ExceptionHandling {

public void usingArrayIndexException(String[] args) {
	
	try {
		System.out.println(args[2]);
	} catch (ArrayIndexOutOfBoundsException e) {

		System.out.println("Method requires three values to be passed [a,b,c] ");
		
		e.printStackTrace();}
		}
	
	
	
	public void usingNumberFormatException(String value) {

int  age =Integer.parseInt(value);
		
System.out.println(age);
		 
	}
	
	public void usingFinallyBlock() {
	int denominator =4;
	try {
		System.out.println(4/denominator);
	}catch(ArithmeticException e) {
		System.err.println("Denominator should not be Zero");
	
	}
	finally {
		System.out.println("Inside FINALLY");
	}
	System.out.println("Thanks bye!!!");
	
}

	public String usingStandFinallyBlock()  {
		int denominator =0;
		try {
			System.out.println(4/denominator);
		}catch(ArithmeticException e) {
			System.err.println("Denominator should not be Zero");
			//return "welcome";
			try {
				throw new Exception();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	
		
		finally {
			System.out.println("Inside FINALLY");
		}
		System.out.println("Thanks bye!!!");

return "thanks";

}}







