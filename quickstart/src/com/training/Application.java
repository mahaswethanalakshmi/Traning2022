package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting grtObj = new Greeting();
		
		// System s =new System();-- constructor of system class is private.so no need to create object.
		System.out.println(grtObj.getMessage());// non static method
		
       System.out.println(Greeting.getInfo());// static method
        System.out.println(grtObj.getMessage()); 
      //   System.out.println(grtObj.getInfo());  should call a static method in a static way - classname.methodname
	}

}
