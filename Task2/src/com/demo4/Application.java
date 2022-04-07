package com.demo4;

import com.demo1.Customer;
import com.demo2.Employee;
import com.demo3.Hotel;
import com.demo5.EmployeeService;;


public class Application {

	public static void main(String[] args) {

		Customer maha = new Customer("SWETHA" , 30 ,1234567890 ,"CHENNAI");
		System.out.println("Customer Name :" +maha.getCustName());
		System.out.println("Customer ID :" +maha.getCustId());
		System.out.println("Customer PhoneNumber :" +maha.getCustPhoneNo());
		System.out.println("Customer Address :" +maha.getCustAddr());
		System.out.println("  ");
		
		Employee emp = new Employee("JEBRA" ,9 , 234678901, 45675.89);
		System.out.println("Employee Name :" +emp.getEmpName());
		System.out.println("Employee ID :" +emp.getEmpId());
		System.out.println("Employee PhoneNumber :" +emp.getEmpPhoneNo());
		System.out.println("Employee Salary :" +emp.getEmpSalary());
		System.out.println("  ");
		
		
		Hotel hot = new Hotel("LE MERIDIEN" , "MULTI CUISINE" , 7,"ROOMS - SPA - GYM - GAMES" ,"GUINDY");
		System.out.println("Hotel Name :" + hot.getHotelName());
		System.out.println("Hotel Cuisine :" + hot.getHotelCuisine());
		System.out.println("Available Room:" + hot.getAvailableRoom());
		System.out.println("Services Provided :" + hot.getProvidedService());
		System.out.println("Hotel Location :" + hot.getHotelLocation());
		
		
		System.out.println("  ");
	
		
		EmployeeService bonus=new EmployeeService();
		System.out.println("Employee Bonus : "+bonus.calculateBonus(emp));
		
		
		}

}
