package com.demo5;

import com.demo2.Employee;

//import com.demo2.Employee;



public class EmployeeService {
	
	public double calculateBonus(Employee obj) {

	double salary = obj.getEmpSalary();
	return 0.33 * salary  ;
	
	}
}
