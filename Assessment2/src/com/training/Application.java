package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.training.services.CountryService;

public class Application {

	public static void main(String[] args) {

		
		Connection con;
		try {
	   	     con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			
	   	     CountryService service = new CountryService(con);
	   	  System.out.println(con);
		     
			} catch (SQLException e) {

			e.printStackTrace();
			}
		}
	System.out.println("Using stream");
    (CountryService)service).findCountryWithPlace().forEach(System.out::println);

    (CountryService)service).findCountryWithPopulation().forEach(System.out::println);

}
