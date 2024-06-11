package com.billcalculator.service;

public class BillCalculator {
	
//	Method
	public double calculateFinalBillAmount(double initialBillAmount, double discount) {
		return (initialBillAmount * discount ) / 100.0;
	}

}
