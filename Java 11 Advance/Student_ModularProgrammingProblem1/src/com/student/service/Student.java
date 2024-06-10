package com.student.service;

import java.util.List;

public class Student {
	
//	Instance Variables
	private String name;
	private Integer rollNumber;
	private String desktopNumber;
	private String examSlot;
	
//	Constructor
	public Student(String name, Integer rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
//	Methods
	static void display( List<Student> studentList ) {
		
		for( Student student : studentList ) {
			System.out.println("---------------");
			System.out.println("Student Details");
			System.out.println("Name :- " + student.getName());
			System.out.println("Roll Number :- " + student.getRollNumber());
			System.out.println("Desktop Number :- " + student .getDesktopNumber());
			if( student.getExamSlot().equals("9:00 am") )
				System.out.println("Exam SlotMorning :- " + student.getExamSlot());
			else 
				System.out.println("Exam SlotAfternoon :- " + student.getExamSlot());
			System.out.println("---------------");
		}
		
	}
	
//	Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getDesktopNumber() {
		return desktopNumber;
	}
	public void setDesktopNumber(String desktopNumber) {
		this.desktopNumber = desktopNumber;
	}
	public String getExamSlot() {
		return examSlot;
	}
	public void setExamSlot(String examSlot) {
		this.examSlot = examSlot;
	}
	
}
