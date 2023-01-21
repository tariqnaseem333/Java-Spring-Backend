package com.tariq;

public class Tester {
	
	public static void main(String args[]) {
// 		Object creation
		Customer customer = new Customer();
// 		Assigning values to the instance variables
		customer.customerId = "C101";
		customer.customerName = "Stephen Abram";
		customer.contactNumber = 7856341287L;
		customer.address = "D089, St. Louis Street, Springfield, 62729";
//		Calling the method on customer
		customer.displayCustomerDetails();
		
		// Object creation
		Food food = new Food();
		// Assigning values to the instance variables
		food.foodName = "Pizza";
		food.cuisine = "Italian";
		food.quantityAvailable = 2;
		food.foodType = "Fast Food";
		food.unitPrice = 10;
//		Calling the method on food
		food.displayCustomerDetails();
		
	}

}
