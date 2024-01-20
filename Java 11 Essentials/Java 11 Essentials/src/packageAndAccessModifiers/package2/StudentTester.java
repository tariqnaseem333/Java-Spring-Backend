package packageAndAccessModifiers.package2;

import packageAndAccessModifiers.package1.Student;

public class StudentTester {
	
	public static void main(String[] args) {
		
		Student s1=new Student(101,"Alan",400.0f,500.0f);
		StudentDetails details = new StudentDetails();
		details.displayStudentDetails(s1);
		
	}

}
