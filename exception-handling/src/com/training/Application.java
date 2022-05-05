package com.training;

import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentService;

public class Application {

	public static void main(String[] args) {
		
//		Student  ram =  new Student(1111,"shivo",85);
//
//		 StudentService service = new StudentService(ram);
//
//		System.out.println(service.sendDetails());
//		 
//		//StudentService service2 = new StudentService();
//		try { 
//		//System.out.println("Grade : " +service2.findRank());
//		}catch (Exception e) {
//			
//			System.err.println("Name is not passed");
//		}
	
	ExceptionHandling exHandling = new ExceptionHandling();
	//exHandling.usingArrayIndexException(args);
	try {
		
	} catch (Exception e) {
	}
	
	System.out.println(exHandling.usingStandFinallyBlock());
	
	}

}
