package com.example;
import java.util.logging.*;
public class Application {

	public static void main(String[] args) {

		Logger log = Logger.getLogger("com.example.Application");
		
		log.setLevel(Level.FINE);
		log.info("Info Message");
		
		log.warning("------------Warning Message-----------");
		
		log.severe("***********SEVERE MESSAGE**********");
		
		log.fine("@@@@@@@@@I Am Fine Message@@@@@@@@");
		
		
		
		
	//	System.out.println("Info Message");
		
		
	}

}
