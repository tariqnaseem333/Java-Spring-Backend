package com.tariq;
public class Customer {
	
//		Instance Variables
		private String customerId;
		private String customerName;
		private long contactNumber;
		private Address address;  // Using concept of Aggregation 
		
//		Constructor
		public Customer() {
		}
		
		public Customer( String customerId, String customerName, long contactNumber, Address address ) {
			this.customerId = customerId;
			this.customerName = customerName;
			this.contactNumber = contactNumber;
			this.address = address;
		}
		
		public Customer( String customerName, long contactNumber, Address address ) {
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
			address.displayAddressDetails();
			System.out.println();
		}
		
		public double payBill( double totalPrice ) {
			
			return 0.0;
		}
		
//		Getters and Setters
		public String getCustomerId() {
			return customerId;
		}

		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public long getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(long contactNumber) {
			this.contactNumber = contactNumber;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}
		
		
}
