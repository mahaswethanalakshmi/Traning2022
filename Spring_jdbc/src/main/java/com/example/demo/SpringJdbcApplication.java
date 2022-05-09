package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Product;
import com.example.demo.repo.ProductRepository;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(SpringJdbcApplication.class, args);
	
	ProductRepository repo = ctx.getBean(ProductRepository.class);
	
	repo.findAll().forEach(System.out::println);
	
	Product tv = ctx.getBean(Product.class);
	System.out.println(tv);
	
//	System.out.println("888888888one row added 88888888888");
	
//	System.out.println(repo.findById(404));
//	
//	System.out.println("Updated:"+repo.update(tv));
	
	System.out.println("deleted :"+repo.remove(404));
	}

	@Bean
	public Product tv() {
		return new Product(10,"sony TV" , 20000);
		
	}
}
