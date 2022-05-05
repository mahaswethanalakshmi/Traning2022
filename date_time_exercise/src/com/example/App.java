package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {

	public static void main(String[] args) {

		
	//	 package com.example;

		// import java.time.LocalDate;
		// import java.time.LocalDateTime;
//		 public class App {
//
//		 	public static void main(String[] args) {
		 	String dateOfBirth = "2001-08-19";
		 	Student vickey = new Student();
		 	vickey.setRollNumber(200);
		 	vickey.setStudentName("Vignesh");
		     vickey.setDateOfBirth(LocalDate.parse(dateOfBirth));
		     vickey.setDateOfJoining(LocalDateTime.now());
		     
		     System.out.println("Year:"+vickey.getDateOfBirth().getYear());
		     System.out.println("Month:"+vickey.getDateOfBirth().getMonth());
		     System.out.println("Day:"+vickey.getDateOfBirth().getDayOfMonth());
	
	
	}
		
		
	}


