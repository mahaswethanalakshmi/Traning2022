package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Bill;
import com.example.demo.model.CustomerList;
import com.example.demo.model.Invoice;
import com.example.demo.model.Teacher;

@SpringBootApplication

public class SpringQuickStartApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(SpringQuickStartApplication.class, args);
	
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

	Invoice inv = ctx.getBean(Invoice.class);
	System.out.println(inv);
	
	
	
	Bill bill = ctx.getBean(Bill.class);
	
	System.out.println("Customer :" + bill.getCustomer());
	System.out.println("Product :" + bill.getProduct());
	
	CustomerList list = ctx.getBean(CustomerList.class);
	
	list.getCustList().forEach(System.out::println);
	}

}
