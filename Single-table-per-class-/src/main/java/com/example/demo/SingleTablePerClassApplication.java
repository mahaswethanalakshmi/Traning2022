package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.Insurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.services.InsuranceService;

@SpringBootApplication
public class SingleTablePerClassApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx =	SpringApplication.run(SingleTablePerClassApplication.class, args);
	
	InsuranceService service = ctx.getBean(InsuranceService.class);
	 service.addHealthPolicy();
	    service.addLifePolicy();
	
	}
	@Bean
	public LifeInsurance life()
	{
		return new LifeInsurance(101, "Meenu", 62, "It services");
	}
    @Bean
    public HealthInsurance health()
    {
 	    return new HealthInsurance(202, "Jerisha", 76, "Cancer");
    }

	

}
