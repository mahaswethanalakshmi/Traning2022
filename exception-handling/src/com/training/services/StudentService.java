package com.training.services;

import com.training.model.Student;

public class StudentService {

	private Student student;

	public StudentService() {
		super();
   }

	public StudentService(Student student) {
		super();
		this.student=student();
	}


	 private Student student() {
		// TODO Auto-generated method stub
		return null;
	}

	public String sendDetails() {
     String name = null;
     try {
     name = this.student.getFirstName();
     }catch (NullPointerException e) {

	System.out.println("Student object is not passed check again");
}
return name;}}
	 
		 
//		 return this.student.getFirstName();		 
		 
//  public String findRank() throws Exception{
//	
//	String grade = "A";
//	if(this.student.getMarkedScored()>90)
//	{
//		grade = "0";
//	}
//
//     return grade;
//}
//	 }
//
//	public String findRank() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	

