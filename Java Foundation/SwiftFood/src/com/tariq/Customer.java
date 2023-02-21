package com.tariq;
public class Customer {
	
//		Instance Variables
		public String customerId;
		public String customerName;
		public long contactNumber;
		public String address;
		
//		Constructor
		public Customer() {
		}
		
		public Customer( String customerName, long contactNumber, String address ) {
			this.customerName = customerName;
			this.contactNumber = contactNumber;
			this.address = address;
		}
		
//		Methods
		public void displayCustomerDetails() {
			System.out.println("Displaying customer details \n***********");
			System.out.println("Customer Id : " + customerId);
			System.out.println("Customer Name : " + customerName);
			System.out.println("Contact Number : " + contactNumber);
			System.out.println("Address : " + address);
			System.out.println();
		}
}
