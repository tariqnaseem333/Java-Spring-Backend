package com.assigndiscount.service;

public class AssignDiscount {
	
//	Method
	public double calculateDiscount(String custId, double initialBillAmount) {
		double discount = 0;
		if(custId.startsWith("REG") && initialBillAmount >= 5500)
			discount = 7.5;
		else if(custId.startsWith("PRE")) {
			discount = 12.0;
			if(initialBillAmount >= 10_000)
				discount = 17.0;
		}
		return discount;
	}

}
