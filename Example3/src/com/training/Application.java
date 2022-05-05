package com.training;

import java.util.Set;
import java.util.TreeSet;

import com.training.model.Product;

public class Application {

	public static void main(String[] args) {

		Product prod1 = new Product(001, "Gems" , 250);
		Product prod2 = new Product(002, "Arun IceCream" , 300);
		Product prod3 = new Product(003, "Dairy Milk" , 150);
		Product prod4 = new Product(004, "Sugar Jelly" , 225);
		Product prod5 = new Product(005, "Waffer" , 350);
		Product prod6 = new Product(006, "Milk Biscuits", 250);

		Set<Product> product = new TreeSet<>();
		product.add(prod1);
		product.add(prod2);
		product.add(prod3);
		product.add(prod4);
		product.add(prod5);
		product.add(prod6);

		
		}
		
	

}
