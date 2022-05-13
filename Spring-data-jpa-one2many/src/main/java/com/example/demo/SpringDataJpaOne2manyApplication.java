package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.DoctorUtils;

@SpringBootApplication
public class SpringDataJpaOne2manyApplication {

	public static void main(String[] args) {
	
	ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaOne2manyApplication.class, args);
	
	
	DoctorUtils obj = ctx.getBean(DoctorUtils.class);
	
	obj.create();
	
	obj.FindAll();
	
	ctx.close();
	
	}

	
	@Bean
	public Doctor munna() {
	Doctor doc = new Doctor();
	 doc.setDoctorId(2020);
	 doc.setDoctorName("Munna");
	 doc.setPhoneNumber(247874585);
	 doc.setDepartment("Vetenerian");
	
	return doc;
		
	}
	@Bean
	public Patient kavi(){
		
		return new Patient(100 , "Kavitha" ,45688578);
	}
	
	@Bean
	public Patient pavi(){
		
		return new Patient(200 , "Pavithra" ,45785478);
	}
	
	@Bean
	public Patient Ravi(){
		
		return new Patient(300 , "Ravithra" ,45684478);
	}
}
