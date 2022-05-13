package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;

import com.example.demo.services.EmployeeService;

@SpringBootApplication
public class SpringDataJpaExampleApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx =SpringApplication.run(SpringDataJpaExampleApplication.class, args);
	Employee mani = ctx.getBean(Employee.class);
	
	EmployeeService service = ctx.getBean(EmployeeService.class);
	//service.findAll().forEach(System.out::println);
	
//Employee added = service.add(mani);
//  
// 
//	if(added!=null) {
//		
//		
//		System.out.println("One Employee is Added!!!");
//			}
//	ctx.close();
	
//	service.findByDateOfBirth(LocalDate.of(1998,05,17)).forEach(System.out::println);
//	
//	service.findByLocation("Thirumazhisai").forEach(System.out::println);
//	
//	service.findBySkillSet("Logistics").forEach(System.out::println);
//	
//	service.findByEmployeeName("Swethana", " Perambur").forEach(System.out::println);
	
	service.findByEmployeeSkillSet("Database", " Chennai").forEach(System.out::println);

	}
	
	@Bean
	public Employee mani() {
		
		return new Employee(101 , "Maha Swethana Lakshmi" ,LocalDate.of(1992, 10, 03),"Thirumazhisai","SQL", 636924243);
				
	}	
	}


