package com.training;

import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>();
//		
//		Fruits fruit1 = new Fruits("apple");
//		Fruits fruit2 = new Fruits("pineapple");
//		Fruits fruit3 = new Fruits("apple");
//		Fruits fruit4 = new Fruits("pineapple");
//		Fruits fruit5 = new Fruits("orange");
//		Fruits fruit6 = new Fruits("banana");
		
		
		set.add("Apple");
		set.add("Pineapple");
		set.add("Apple");
		set.add("Pineapple");
		set.add("Orange");
		set.add("Banana");
		
		for(String str:set) {
			System.out.println(str.toString());
		}

	}

	@Override
	public String toString() {
		return " [" + toString() + "]";
	}

}

