package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.Utility;

@SpringBootApplication
public class SpringDataJpaOne2manyBidirectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaOne2manyBidirectionApplication.class, args);
	
		Utility obj = ctx.getBean(Utility.class);

		obj.create();
		
		//obj.findAll();
		obj.findDoctorFrmPatient();
		ctx.close();
		
	}

	

	@Bean
	public Doctor munna() {
	Doctor doc = new Doctor();
	 doc.setDoctorId(2020);
	 doc.setDoctorName("Jebbra");
	 doc.setPhoneNumber(247874585);
	 doc.setDepartment("Vetenerian");
	
	return doc;
		
	}
	@Bean
	public Patient prawi(){
		
		return new Patient(200 , "Prawin" ,45688078);
	}
	
	@Bean
	public Patient venky(){
		
		return new Patient(400 , "Venkat" ,45787778);
	}
}
