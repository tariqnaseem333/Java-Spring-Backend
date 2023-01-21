package com.tariq;

public class Food {
	
//	Instance Variables
	public String foodName;
	public String cuisine;
	public int quantityAvailable;
	public String foodType;
	public double unitPrice;
	
//	Methods
	public void displayCustomerDetails() {
		System.out.println("Displaying food details \n***********");
		System.out.println("Food Name : " + foodName);
		System.out.println("Cuisine : " + cuisine);
		System.out.println("Quantity Available : " + quantityAvailable);
		System.out.println("Food Type : " + foodType);
		System.out.println("Unit Price : " + unitPrice);
		System.out.println();
	}

}
