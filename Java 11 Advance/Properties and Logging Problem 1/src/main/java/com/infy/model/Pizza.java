package com.infy.model;

public class Pizza {
	
//	Instance Variables
	private PizzaSize pizzaSize;
	private Double cost;
	
//	Constructor
	public Pizza(PizzaSize pizzaSize) {
		this.pizzaSize = pizzaSize;
		switch(pizzaSize) {
		case REGULAR: cost = 100d;
		break;
		case MEDIUM: cost = 250d;
		break;
		case LARGE: cost = 390d;
		break;
		}
	}
	
//	Getters and Setters
	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}
	public void setPizzaSize(PizzaSize pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}	
	
}
