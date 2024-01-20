package packageAndAccessModifiers.package2;

import packageAndAccessModifiers.package1.Student;

public class StudentDetails {
	
//	Methods
	public void calculatePercentage( Student student ) {
		double percentage = ( student.getTotalMarksObtained() / student.totalMarks ) * 100.0;
		System.out.println("	Student Percentage: " + Math.round(percentage*100.0) / 100.0 + "%");
	}
	
	public void displayStudentDetails( Student s ) {
		System.out.println("Student Details:");
		System.out.println("	Student ID: " + s.getStudentId());
		System.out.println("	Student Name: " + s.studentName);
		System.out.println("	Student Marks: " + s.getTotalMarksObtained());
		System.out.println("	Total Marks: " + s.totalMarks);
		this.calculatePercentage(s);
	}
	

}
