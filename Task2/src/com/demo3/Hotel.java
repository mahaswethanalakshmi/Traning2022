package com.demo3;

public class Hotel {

	private String hotelName; //instance variable
	private String hotelCuisine;
	private int availableRoom;
	private String providedService;
	 
	private	 String hotelLocation;
	
	
	
	public Hotel(String hotelName, String hotelCuisine, int availableRoom, String providedService,
			String hotelLocation) {
		super();
		this.hotelName = hotelName;
		this.hotelCuisine = hotelCuisine;
		this.availableRoom = availableRoom;
		this.providedService = providedService;
		this.hotelLocation = hotelLocation;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelCuisine() {
		return hotelCuisine;
	}
	public void setHotelCuisine(String hotelCuisine) {
		this.hotelCuisine = hotelCuisine;
	}
	public int getAvailableRoom() {
		return availableRoom;
	}
	public void setAvailableRoom(int availableRoom) {
		this.availableRoom = availableRoom;
	}
	public String getProvidedService() {
		return providedService;
	}
	public void setProvidedService(String providedService) {
		this.providedService = providedService;
	}
	public String getHotelLocation() {
		return hotelLocation;
	}
	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}

