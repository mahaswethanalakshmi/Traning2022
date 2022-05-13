package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.services.DoctorService;

@SpringBootApplication
public class SpringDataJpaSimpleMappingApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaSimpleMappingApplication.class, args);
	
     Doctor siva = ctx.getBean(Doctor.class);
     
     DoctorService service = ctx.getBean(DoctorService.class);
     
     service.findByDept("Vetenerian").forEach(System.out::println);
   
     // service.findBy("Vetenerian").forEach(System.out::println);

   //  service.findAll().forEach(System.out::println);
//     Doctor added = service.add(siva);
//	
//	if(added!=null) {
//		
//		
//		System.out.println("One Doctor is Added!!!");
//		
//	}
	ctx.close();
	}
@Bean
public Doctor siva() {
	
	return new Doctor(999 , "Maha Swethana Devi" ,"Vetenerian", 636924243);
			
}

}
