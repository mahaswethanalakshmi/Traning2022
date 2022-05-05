package com.training.model;

public class Countries {

	private String country;
	private String place;
	private int population;
	public Countries() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Countries(String country, String place, int population) {
		super();
		this.country = country;
		this.place = place;
		this.population = population;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "Countries [country=" + country + ", place=" + place + ", population=" + population + "]";
	}
	
	
	
	
	
}
