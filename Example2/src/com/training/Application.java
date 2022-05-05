package com.training;

import java.util.HashSet;
import java.util.Set;

import com.training.model.Doctor;
import com.training.model.Patients;

public class Application {

	public static void main(String[] args) {

		Patients patientP1 = new Patients(101 , "Arun Reddy" , "AP" , 1335878543);
		Patients patientP2 = new Patients(102 , "Malar" , "Kerala" , 1895878543);
		Patients patientP3 = new Patients(103 , "Krishna" , "TN" , 1335890543);

		Set<Patients> set = new HashSet<>();
		set.add(patientP1);
		set.add(patientP2);
		set.add(patientP3);
	
		
		//Set<Patient> set2 = new HashSet<>();
  Doctor doctorD1 = new Doctor(404 , " Sri Varadha Rajan" , "Dermatologist" , set);
		
  System.out.println("DOCTOR" +  doctorD1.getDoctorName());
	for(Patients eachPatient :doctorD1.getPatient()) {
		System.out.println(eachPatient);
	}	

//	HashMap<Doctor ,Set<Patients>>  map = new HashMap<>();
//	map.put(doctorD1,set);
//	
//
//	Set<Map.Entry<Doctor,Set<Patients>>> list= map.entrySet();
//    for(Map.Entry<Doctor,Set<Patients>> eachEntry : list) {
//     System.out.println((eachEntry.getKey()));
//   	 System.out.println(eachEntry.getValue());

	}
	}

