package com.example.demo;

import java.awt.print.Book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.training.model.Author;

import com.example.demo.model.Bill;
import com.example.demo.model.CustomerList;
import com.example.demo.model.Invoice;

@SpringBootApplication
@ComponentScan(basePackages = { "org.training" , "com.training" })
public class SpringQuickStartApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(SpringQuickStartApplication.class, args);
	                                                  //run(primary source,args)
	                                                           //|
	                                                          // |
	                                                      //  the java class which has @SpringBootApplication        
	
	
//	System.out.println(ctx.getBean("ram"));
//	
//	System.out.println(ctx.getBean("teacher"));
//	
//	Teacher stella = ctx.getBean(Teacher.class);
//	
//	stella.setId(300);
//	stella.setName("Stella Sundari");
//	stella.setSubject("Biology");
//	
//	System.out.println(stella);

	
	System.out.println(ctx.getBean(Book.class));
	Invoice inv = ctx.getBean(Invoice.class);
	System.out.println(inv);
	
	
	
	Bill bill = ctx.getBean(Bill.class);
	
	System.out.println("Customer :" + bill.getCustomer());
	System.out.println("Product :" + bill.getProduct());
	
	CustomerList list = ctx.getBean(CustomerList.class);
	
	list.getCustList().forEach(System.out::println);

	}

//	@Bean
//	public Author harish()
//	{
//	return new Author(10,"HARISH KUMAR");
//	}
//	@Bean
//	@Primary
//	public Author mani()
//	{
//	return new Author(101,"Boot ");
//	}
}
