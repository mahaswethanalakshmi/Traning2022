package com.example.demo;
import java.sql.*;
import java.util.Optional;

import com.example.demo.services.ProductService;
import com.example.entity.Product;
public class Application {

	public static void main(String[] args) {
	
		Connection con;
		try {
	   	     con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			
	   	     ProductService service = new ProductService(con);
	   	     
//	   	     Product toAdd = new Product(9494 , "UPS",747.00);
//	   	     
//	   	     int rowAdded = service.addProduct(toAdd);
//	   	     System.out.println("Row Added :" + rowAdded);
	   	    		 
	   	 // Product toDelete = new Product(9494 , "UPS",747.00);		 
	   	int rowsDeleted = service.deleteById(10);
	   	System.out.println("Row Deleted:" + rowsDeleted);
	   	
	   	     service.findAll().forEach(System.out::println);	  
	   	     // System.out.println(con);
			
	   	  service.findAll().forEach(System.out::println);
			Optional<Product> found=service.findById(10);
			if(found.isPresent())
			{
				System.out.println("found is : "+found.get());
			}else
			{
				System.out.println("Product is not present");
			}
//			int rowsUpdated= service.updatePriceByName(mobile,16666);
//		   	System.out.println("Updated Row:" + rowsUpdated);
//		   	
//		   	    
			service.findAll().forEach(System.out::println);	 	
			int rowUpdated = service.update("ac",12533.00);
			System.out.println("rows updated"+rowUpdated);
			
	   	     
	   	     
		} catch (SQLException e) {

		e.printStackTrace();
		}
	
		
		
	}

}
