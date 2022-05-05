package com.training;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.model.Student;

public class HashMapApp2 {
public static void main(String[] args) {
	
	Student ram = new Student(101 ,"Maha" ,57);
	Student shyam = new Student(102 ,"Shobs" ,78);
	Student mukesh = new Student(103 ,"Laks" ,79);
	

	HashMap<Integer , Student > map = new HashMap<>();
    	
	System.out.println(map.put(900,ram));
	System.out.println(map.put(903,shyam));
	System.out.println(map.put(904,mukesh));

	
	Set<Integer> keys= map.keySet();	
	System.out.println(keys);
	for(Integer key : keys) {
		System.out.println(map.get(key));
	}
	System.out.println("*************");
	 Collection<Student> list =map.values();
	
	 for(Student eachStudent : list) {
			System.out.println(eachStudent);
}
	 
	 
System.out.println("both the key and values ");
     
     Set<Map.Entry<Integer,Student>> list2= map.entrySet();
     for(Map.Entry<Integer, Student> eachEntry : list2) {
    	 System.out.println(eachEntry.getKey());
    	 System.out.println(eachEntry.getValue());
     }
	
	 
	 
	 
}
}