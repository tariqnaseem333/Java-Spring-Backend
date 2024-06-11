package com.customerkart.service;

import com.assigndiscount.service.AssignDiscount;
import com.billcalculator.service.BillCalculator;

public class CustomerKartTester {
	
	public static void main(String[] args) {
		
//		Premium Customer
		CustomerKart customerKart1 = new CustomerKart();
		customerKart1.setName("Tom");
		customerKart1.setCustId("PRE:5679");
		customerKart1.setInitialBillAmount(5600.0);
		
//		Regular Customer
		CustomerKart customerKart2 = new CustomerKart();
		customerKart2.setName("Larry");
		customerKart2.setCustId("REG:8579");
		customerKart2.setInitialBillAmount(9000.0);
		
//		Calculating and Setting Discount for Customer
		AssignDiscount assignDiscount = new AssignDiscount();
		customerKart1.setDiscount(assignDiscount.calculateDiscount(customerKart1.getCustId(), customerKart1.getInitialBillAmount()));
		customerKart2.setDiscount(assignDiscount.calculateDiscount(customerKart2.getCustId(), customerKart2.getInitialBillAmount()));

//		Calculating and Setting Final Bill for Customer
		BillCalculator billCalculator = new BillCalculator();
		customerKart1.setFinalBillAmount(billCalculator.calculateFinalBillAmount(customerKart1.getInitialBillAmount(), customerKart1.getDiscount()));
		customerKart2.setFinalBillAmount(billCalculator.calculateFinalBillAmount(customerKart2.getInitialBillAmount(), customerKart2.getDiscount()));
		
//		Displaying Customer Billing Details
		customerKart1.displayCustomerDetails();
		customerKart2.displayCustomerDetails();
		
	}

}
