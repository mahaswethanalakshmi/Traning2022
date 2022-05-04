package com.example;
import java.io.IOException;
import java.util.logging.*;
public class LogTofile {

	public static void main(String[] args) {

		Logger log = Logger .getLogger(LogTofile.class.getName());
		
		FileHandler handler;
		try {
			handler = new FileHandler("logs.log");
			log.addHandler(handler);
			
			log.info("Try Block Called");
			throw new RuntimeException("MAHA is a GREAT IDIOT");
			
			
		} catch (SecurityException e) {

		log.warning(e.getMessage());
		
		}
		
		catch(IOException e) {
		log.warning(e.getMessage());
		}
	

		catch(Exception e) {
		log.warning(e.getMessage());
	
	}

}
	}
