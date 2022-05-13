package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.ifaces.SeminarRepository;

@SpringBootApplication
public class SpringDataJpaOne2oneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaOne2oneApplication.class, args);
	
	Seminar semi = ctx.getBean(Seminar.class);
	SeminarRepository repo = ctx.getBean(SeminarRepository.class);
	
	Seminar added = repo.save(semi);

	 if(added!= null) {
		 
		 System.out.println("One Record is Added");
	 }
		
  }
	@Bean
	public Seminar java(){
		
		return new Seminar(103, "Kavitha" ,23 ,ram());
	}
	@Bean
	public Speaker ram(){
		
		return new Speaker(111, "Ramrajan" ,"B.tech.Prof");
	}
	}


