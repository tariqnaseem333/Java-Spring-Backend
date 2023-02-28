package com.tariq;
public class Order {
	
//	Instance Variables
	private int orderId;
	private Food orderedFoods[]; // Using Aggregation here
	private Customer customer;   // Using Aggregation here
	private double totalPrice;
	private String status;
	
//	Static Variable
	private static int orderIdCounter;
	static {
		orderIdCounter = 100;
	}
	
//	Constructor
	public Order() {
		this.status = "Ordered";
	}
	public Order( Customer customer, Food orderedFoods[] ) {
		this.customer = customer;
		this.orderedFoods = orderedFoods;
		this.status = "Ordered";
		this.orderId = orderIdCounter + 1;
	}
	public Order( int orderId, Food orderedFoods[] ) {
//		this.orderId = orderId;
		this.orderId = orderIdCounter + 1;
		this.orderedFoods = orderedFoods;
		this.status = "Ordered";
	}
	
//	Method
	public double calculateTotalPrice( int unitPrice, String paymentMode ) {
		double serviceCharge = 5.0/100.0;
		double price = unitPrice*( 1 + serviceCharge );
		this.totalPrice = price;
		return price;
	}
	
	public int getTotalNumberOfOrders() {
		int totalOrders = orderIdCounter - 100;
		return totalOrders;
	}
	
	public void displayOrderDetails() {
		System.out.println("Displaying order details \n***********");
		System.out.println("Order Id : " + orderId);
//		System.out.println("Ordered Food : " + orderedFoods);
		for( Food food : orderedFoods ) {
			food.displayFoodDetails();
		}
		System.out.println("Order Status : " + status);
		System.out.println("Total Price : " + totalPrice);
		System.out.println();
	}
	
//	Getters and Setters
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Food[] getOrderedFoods() {
		return orderedFoods;
	}
	public void setOrderedFoods(Food[] orderedFoods) {
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
}
