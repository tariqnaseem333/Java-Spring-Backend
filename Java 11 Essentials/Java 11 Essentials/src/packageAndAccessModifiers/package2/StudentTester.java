package packageAndAccessModifiers.package2;

import packageAndAccessModifiers.package1.Student;

public class StudentTester {
	
	public static void main(String[] args) {
		Student s1=new Student(101,"Alan",400.0f,500.0f);
		StudentDetails d=new StudentDetails();
		d.displayStudentDetails(s1);
		d.calculatePercentage(s1);
	}

}
