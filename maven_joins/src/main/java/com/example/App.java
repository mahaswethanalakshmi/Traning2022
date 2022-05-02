package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

import com.example.services.CustomerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Connection con;
    	try {

    		
    		
    	 con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
   	     System.out.println(con);
	
   	     

     	CustomerService service = new  CustomerService(con);
     	//System.out.println(service.findAll());
 		 service.findAll().forEach(System.out::println);
     	
   	     
		}
		catch (Exception e) {
	         e.printStackTrace();	
	         }
    	
    }
}
