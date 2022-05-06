package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@Configuration
public class AppConfig {

	@Bean
	public Student ram() {
		
		return new Student(101 , "Madesh" ,98);
	
	}
	
	
	@Bean
	public Teacher harish()
	{
		return new Teacher(2,"Harish","Java");
	}
	
	@Bean
	public Product tv()
	{
		return new Product(101,"SONY TV");
	}
	
	@Bean
	public Customer suresh()
	{
		return new Customer(202,"SuReSh");
	}
	

	@Bean
	public Customer magesh()
	{
		return new Customer(203,"MaGeSh");
	}
	
	@Bean
	public Customer madesh()
	{
		return new Customer(203,"MaDeSh");
	}
}
