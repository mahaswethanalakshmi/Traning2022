package com.training;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class UsingPredicate {

	public static void main(String[] args  ) {
		
		List<String> names = Arrays.asList("India","Srilanka","Indonesia","Bhutan");
		
		
		Predicate<String> containsChar = (country) -> country.toUpperCase().startsWith("I");    
		
		Consumer<String> consumer = (value) -> 
	//	System.out.println(value);
	//	System.out.println("----------");
		{
		if(containsChar.test(value)) {
			System.out.println(value);
		}
		};
		
		names.forEach(consumer);
		
		names.forEach(value  -> System.out.println(value));
		
	

}}