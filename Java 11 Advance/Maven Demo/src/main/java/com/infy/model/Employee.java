package com.infy.model;

public class Employee {
	
//	Instance Variables
	private String name;
	private Integer empId;
	
//	Constructor
	public Employee(String name, Integer empId) {
		super();
		this.name = name;
		this.empId = empId;
	}
	
//	Method
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}
	
//	Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}	
	
}
