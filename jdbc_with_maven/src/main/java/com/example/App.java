package com.example;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import com.example.dao.MemberRepository;
import com.example.demo.services.ProductService;
import com.example.entity.Member;
import com.example.entity.Product;

import jdbc.example.util.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 

{
	
	public static void member()
	{

    	Connection con;
		try {

			Connection	con2 = ConnectionFactory.getPostgressConnection();
				 System.out.println(con2);
	
		}
		catch (Exception e) {
	         e.printStackTrace();	
	         }
	}
//    public static void main( String[] args )
//    {
        //System.out.println( "Hello World!" );
   
   
    	//Connection con;
	//	try {
//	   	     con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
//			System.out.println(con);
//			LocalDate date = LocalDate.of(2002, 4, 19);
//			Date sqlDate = Date.valueOf(date);
//			LocalDate date2h =sqlDate.toLocalDate();
//			con = ConnectionFactory.getOracleConnection();

		//Connection	con2 = ConnectionFactory.getPostgressConnection();
			// System.out.println(con2);
//
//			MemberRepository member = new MemberRepository(con);
//			 System.out.println(con);
//		     member.findAll().forEach(System.out::println);
//		 Member toAdd = new Member(1000,"Jebbra", "Chennai", LocalDate.of(2022,04,27),"Annual",5000,2,10.0);   
//   	     int rowAdded = member.add(toAdd);
//	   	     System.out.println("Row Added :" + rowAdded);
		
		//} 
	//	catch (Exception e) {
      //   e.printStackTrace();	
    //     }
  //  }
    public static void product()
	{
		Connection con=ConnectionFactory.getOracleConnection();
		ProductService service=new ProductService(con);
		Product toadd=new Product(114,"ups",29400.89);
//		Product toadd1=new Product(144,"ups",29400.89);
//		Product toadd2=new Product(124,"ups",29400.89);
//		Product toadd3=new Product(164,"ups",29400.89);
//	    
//		int rowAdded=service.addProduct(toadd);
//		int rowAdded1=service.addProduct(toadd1);
//		int rowAdded2=service.addProduct(toadd2);
		
		  Product kathli = new Product(121,"kaju kathli", 450.00);
	       
	       
	       
	       //service.findAll().forEach(System.out::println); 
	     
	       
			//Product kathli2 = new Product(101,"kaju kathli", 450.00);
			
			Product jamun = new Product(111,"gulab jamun", 450.00);

	      service.usingTxn(kathli, jamun);

		service.findAll().forEach(System.out::println);
	}

    public static void main( String[] args )
    {
       product();
       
     
		
    }
     
    }
