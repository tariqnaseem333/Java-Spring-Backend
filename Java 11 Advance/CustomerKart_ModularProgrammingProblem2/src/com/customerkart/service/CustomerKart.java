package com.customerkart.service;

public class CustomerKart {
	
//	Instance Variables
	private String name;
	private String custId;
	private double initialBillAmount;
	private double discount;
	private double finalBillAmount;
	
//	Method
	void displayCustomerDetails() {
		System.out.println("---------------");
		System.out.println("Billing Details :- ");
		System.out.println("Customer Name :- " + this.getName());
		System.out.println("Customer ID :- " + this.getCustId());
		System.out.println("Initial Bill Amount :- " + this.getInitialBillAmount());
		System.out.println("Final Bill Amount :- " + this.getFinalBillAmount());
		System.out.println("Discount Given :- " + this.getDiscount() + "%");
	}
	
//	Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public double getInitialBillAmount() {
		return initialBillAmount;
	}
	public void setInitialBillAmount(double initialBillAmount) {
		this.initialBillAmount = initialBillAmount;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getFinalBillAmount() {
		return finalBillAmount;
	}
	public void setFinalBillAmount(double finalBillAmount) {
		this.finalBillAmount = finalBillAmount;
	}

}

