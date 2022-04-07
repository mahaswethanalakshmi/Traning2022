package com.example;

import com.example.model.Student; 

public class Application {

	public static void main(String[] args) {
		Student ram = new Student();
		//ram.rollNumber = 101;
		
	//	ram.setRollNumber(66);   //public method is able to access
		//ram.setFirstName("Ram"); // different package
		// ram.setMarkScored(91);  //protected modifier //Application is NOT a subclass of Student, Different package
     	ram.setBranch("be");
	
		System.out.println("Roll Number : "+ram.getRollNumber());
	    System.out.println("Mark Scored : "+ram.getMarkScored());
	    System.out.println("Student Name : "+ram.getFirstName());	
	   Student shyam = new Student(490,"shyam",89,"mech"); 
	System.out.println("Roll Number:" +shyam.getRollNumber());
    System.out.println("Student Name:" +shyam.getFirstName());
	Student magesh = new Student(666,"Subramani", "textile");

    System.out.println("Roll Number:" +magesh.getRollNumber());
    System.out.println("Marked Score:" +magesh.getMarkScored());
	
	}
	
}


