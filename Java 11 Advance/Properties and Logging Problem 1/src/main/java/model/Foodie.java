package model;

import java.util.List;

public class Foodie {
	
//	Instance Variables
	private String name;
	private Double walletBalance;
	private List<Pizza> pizzasOrdered;
	
//	Constructor
	public Foodie(String name, Double walletBalance, List<Pizza> pizzasOrdered) {
		this.name = name;
		this.walletBalance = walletBalance;
		this.pizzasOrdered = pizzasOrdered;
	}
	
//	Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(Double walletBalance) {
		this.walletBalance = walletBalance;
	}
	public List<Pizza> getPizzasOrdered() {
		return pizzasOrdered;
	}
	public void setPizzasOrdered(List<Pizza> pizzasOrdered) {
		this.pizzasOrdered = pizzasOrdered;
	}
	
}
