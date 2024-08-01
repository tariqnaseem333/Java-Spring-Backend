package com.infy.ui;

import com.infy.dto.Employee;

import lombok.extern.log4j.Log4j2;

@Log4j2 // generates a log field for the class.
public class Tester {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee(111, "George", "george@infosys.com");
		// Employee e3 = new Employee(null, "George", "george@infosys.com"); //Will get
		// NullPointerException

		e1.setEmpId(111);
		e1.setEmailId("george@infosys.com");
		e1.setEmpName("George");

		e2.setEmpId(112);
		e2.setEmailId("tom@gmail.com");
		e2.setEmpName("Tom");

		log.info("Employee1=" + e1);
		System.out.println("Employee2=" + e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.hashCode());
		System.out.println(e3.hashCode());

	}

}
