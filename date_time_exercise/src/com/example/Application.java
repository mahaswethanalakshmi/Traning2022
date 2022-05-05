package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Application {
      
	public static void main(String[] args) {
		
		Student ram = new Student(101, "ram", LocalDate.of(2001, 8, 19), 
			LocalDateTime.of(2007, Month.MAY,5,8,30));
		

		Student shyam = new Student(102, "shyam", 
				LocalDate.now(), 
			LocalDateTime.now());
		
		System.out.println("Rams Year Of Birth :" + ram.getDateOfBirth().getYear());

		System.out.println("Rams First Birthday :" +ram.getDateOfBirth().plus(1,ChronoUnit.YEARS));
		
		System.out.println("Shyams Year Of Birth :" + shyam.getDateOfBirth().getYear());
	
		System.out.println("Shyams First Birthday :" +shyam.getDateOfBirth().plus(60,ChronoUnit.YEARS));

		
	}
}
