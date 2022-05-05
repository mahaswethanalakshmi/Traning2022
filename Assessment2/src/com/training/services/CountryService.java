package com.training.services;

import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.training.model.Countries;

public class CountryService {

	
	private Connection con;

//	public CountryService(Connection con) {
//		super();
//		this.con = con;
//	}



	public CountryService(Connection con2) {
		// TODO Auto-generated constructor stub
	}

//	public static void collectToSet(List<Countries> countryList) {
//		
//		Set<Countries> countSet = (Set<Countries>) countryList.parallelStream().filter(e -> e.getCountry() == e.getPlace())
//				.collect(toSet());
//		
//		countSet .forEach(System.out::println);
//	
//	}
	public static void collectToMap(List<Countries> countryList) {
		Map<String,String> values=countryList
				.parallelStream()
				  .filter(e -> e.getCountry()).distinct()
				  .collect(toMap(Countries::getCountry, Countries::getPlace));
		values.forEach((key,value)-> System.out.println(key +","+value));
	}
	
	
	public static void collectToMap2(List<Countries> country2List) {
		Map<String,Integer> values=country2List
				.stream()
				  .filter(e -> e.getCountry()).distinct()
				  .collect(toMap(Countries::getCountry, Countries::getPopulation));
		values.forEach((key,value)-> System.out.println(key +","+value));
	}
	
	
}
