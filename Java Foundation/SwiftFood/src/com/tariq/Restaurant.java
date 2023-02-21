package com.tariq;
public class Restaurant {
	
//	Instance Variables
	public String restaurantName;
	public long restaurantContact;
	public String restaurantAddress;
	public float restaurantRating;
	
//	Constructor
	public Restaurant( String restaurantName, long restaurantContact, String restaurantAddress, float restaurantRating ) {
		this.restaurantName = restaurantName;
		this.restaurantRating = restaurantRating;
		this.restaurantContact = restaurantContact;
		this.restaurantAddress = restaurantAddress;
	}
	
//	Methods
	public void displayRestaurantDetails() {
		System.out.println("Displaying order details \n***********");
		System.out.println("Restaurant Name : " + restaurantName);
		System.out.println("Restaurant rating : " + restaurantRating);
		System.out.println("Restaurant Contact : " + restaurantContact);
		System.out.println("Restaurant Address : " + restaurantAddress);
		System.out.println();
	}
}
