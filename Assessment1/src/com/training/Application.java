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

}













//package com.training;
//
//import java.util.TreeSet;
//
//public class Application {
//
//	public static void main(String[] args) {
//		
//		TreeSet<Fruits> set = new TreeSet<>();
//		
//		Fruits fruit1 = new Fruits("apple");
//		Fruits fruit2 = new Fruits("pineapple");
//		Fruits fruit3 = new Fruits("apple");
//		Fruits fruit4 = new Fruits("pineapple");
//		Fruits fruit5 = new Fruits("orange");
//		Fruits fruit6 = new Fruits("banana");
//		
//		
//		set.add(fruit1);
//		set.add(fruit2);
//		set.add(fruit3);
//		set.add(fruit4);
//		set.add(fruit5);
//		set.add(fruit6);
//		
//		for(Fruits each:set)
//		{
//			System.out.println(each.getFruites());
//		}
//		
//	}
//		
//}
		
		
		
		
		
//		package com.training;
//
//		import java.util.TreeSet;
//
//		import com.training.model.Fruits;
//
//
//		public class Application {
//
//			public static void main(String[] args) {
//				// TODO Auto-generated method stub
//
//				Fruits fruit1= new Fruits("apple");
//				Fruits fruit2= new Fruits("orange");
//				Fruits fruit3= new Fruits("apple");
//				Fruits fruit4= new Fruits("pineapple");
//				Fruits fruit5= new Fruits("orange");
//				Fruits fruit6= new Fruits("banana");
//				
//				
//				TreeSet<Fruits> set = new TreeSet<>();
//				
//				set.add(fruit1);
//				set.add(fruit2);
//				set.add(fruit3);
//				set.add(fruit4);
//				set.add(fruit5);
//				set.add(fruit6);
//				
//				
//							for(Fruits eachFruits:set) {
//					
//					System.out.print(eachFruits.getFruitName()+",");
//
//				}
//			}
//
//		}
//
//
//	}
//
//}





