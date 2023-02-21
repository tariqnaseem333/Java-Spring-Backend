package com.tariq;
public class Order {
	
//	Instance Variables
	private int orderId;
	private String orderedFoods;
	private double totalPrice;
	private String status;
	
//	Getters and Setters
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderedFoods() {
		return orderedFoods;
	}
	public void setOrderedFoods(String orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	//	Constructor
	public Order() {
		this.status = "Ordered";
	}
	public Order( int orderId, String orderedFoods ) {
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
		this.status = "Ordered";
	}
	
//	Method
	public double calculateTotalPrice( int unitPrice ) {
		double serviceCharge = 5.0/100.0;
		double price = unitPrice*( 1 + serviceCharge );
		this.totalPrice = price;
		return price;
	}
	
	public void displayOrderDetails() {
		System.out.println("Displaying order details \n***********");
		System.out.println("Order Id : " + orderId);
		System.out.println("Ordered Food : " + orderedFoods);
		System.out.println("Order Status : " + status);
		System.out.println("Total Price : " + totalPrice);
		System.out.println();
	}
}
