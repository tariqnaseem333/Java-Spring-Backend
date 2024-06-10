package com.student.service;

import java.util.ArrayList;
import java.util.List;

import com.desktopallocation.service.DesktopAllocator;
import com.timeallocation.service.TimeAllocator;

public class StudentTester {
	
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Mathew", 15));
		studentList.add(new Student("Thomas", 42));
		studentList.add(new Student("Sherry", 10));
		studentList.add(new Student("Garry", 47));
		studentList.add(new Student("Shelton", 16));
		
//		Setting Desktop Number and Exam Slot
		for( Student student : studentList ) {
			
			DesktopAllocator desktopAllocator = new DesktopAllocator();
			String desktopNumnber = desktopAllocator.allocateDesktopNumber(student.getRollNumber());
			student.setDesktopNumber(desktopNumnber);
			
			TimeAllocator timeAllocator = new TimeAllocator();
			String examSlot = timeAllocator.allocateTimeSlot(student.getDesktopNumber());
			student.setExamSlot(examSlot);
			
		}

//		Displaying Exam Slot Details
		System.out.println("Exam Slot Details :-");
		Student.display(studentList);
		
	}

}
