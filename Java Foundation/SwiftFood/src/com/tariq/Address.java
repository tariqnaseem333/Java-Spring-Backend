package com.tariq;

public class Address {

//	Instance Variables
	private String doorNo;
	private String street;
	private String city;
	private int zipCode;
	
//	Constructors
	public Address() {}
	public Address( String doorNo, String street, String city, int zipCode ) {
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}
	
//	Methods
	public void displayAddressDetails() {
		System.out.println("Displaying Address details \n***********");
		System.out.println("Door No: " + doorNo);
		System.out.println("Street : " + street);
		System.out.println("City : " + city);
		System.out.println("Zip Code : " + zipCode);
		System.out.println();
	}
	
//	Getters and Setters
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	

}
