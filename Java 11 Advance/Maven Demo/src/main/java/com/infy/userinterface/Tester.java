package com.infy.userinterface;

import org.apache.commons.configuration2.builder.fluent.Configurations;

import com.infy.model.Employee;
import com.infy.validator.Validator;

public class Tester {

	public static void main(String[] args) throws Exception{	
		
		try {
			Employee employee = new Employee("Jon", 1234);
			new Validator().validate(employee);
			System.out.println("The employee details are successfully validated.");
		} 
		catch (Exception exception) {
			System.out.println(new Configurations().properties("configuration.properties").getProperty(exception.getMessage()));
		}
		
	}
}
