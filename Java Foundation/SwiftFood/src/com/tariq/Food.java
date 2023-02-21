package com.tariq;
public class Food {
	
//	Instance Variables
	private String foodName;
	private String cuisine;
	private int quantityAvailable;
	private String foodType;
	private double unitPrice;
	
//	Getters and Setters
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public int getQuantityAvailable() {
		return quantityAvailable;
	}
	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
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
