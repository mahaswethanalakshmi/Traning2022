package com.training;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.training.model.Appointment;
import com.training.model.Doctor;
import com.training.model.Patients;

public class AppApplication {

	public static void main(String[] args) {
				Patients patient1=new Patients(001,"Revathy","Chennai",997865432);
				Patients patient2=new Patients(002,"Arya","Namakal",987865432);
				Set<Patients> set1=new HashSet<>();
				set1.add(patient1);
				set1.add(patient2);	
				
				Doctor doctor1=new Doctor(111,"Ravi","ENT",set1);
				
				
				Patients patient3=new Patients(003,"Ravi","Chennai",97865432);
				Patients patient4=new Patients(004,"Lakshimi","Salem",998965432);
			
				Set<Patients> set2=new HashSet<>();
				set2.add(patient3);
				set2.add(patient4);
				
			
				Doctor doctor2=new Doctor(112,"Raja","cardio",set2);
				
				Map<Doctor,Set<Patients>> map=new HashMap<>();
				map.put(doctor1, set1);
				map.put(doctor2, set2);
				Appointment app=new Appointment (map);
				System.out.println(app.get(doctor1));
				System.out.println(app.get(doctor2));
				
			}
			
}
