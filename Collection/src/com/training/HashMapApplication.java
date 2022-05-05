package com.training;
import java.util.*;

import com.training.model.Student;

public class HashMapApplication {

	public static void main(String[] args) {

		
		Student ram = new Student(101 ,"Maha" ,57);
		Student shyam = new Student(102 ,"Shobs" ,78);
		Student mukesh = new Student(103 ,"Laks" ,79);
		

		HashMap<Integer , Student > map = new HashMap<>();
		
		System.out.println(map.put(900 , ram));
		System.out.println(map.put(903, shyam));
		//System.out.println(map.put(903, mukesh));//shyam
		//System.out.println();
		
		
		Student added = map.put(903, mukesh);
		
		if(added!= null) {
			map.put(904,added);
		}
		
		System.out.println(map.get(903));
		System.out.println(map.get(904));
		
		
		
		
		
	}
}
