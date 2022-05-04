package com.training;

import com.training.services.StudentResultService;

public class Application {

	public static void main(String[] args) {

		StudentResultService service = new StudentResultService();
		
		System.out.println("Is Pass :" + service.test(90.00));
		
	}

}
