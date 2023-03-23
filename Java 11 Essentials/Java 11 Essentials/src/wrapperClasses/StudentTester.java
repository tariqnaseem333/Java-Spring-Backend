package wrapperClasses;

public class StudentTester {
	
	public static void main(String[] args) {
		
		Student stud1 = new Student();
		stud1.setName("John Wehdon");
		stud1.setStudentId("4596");
		
		Student stud2 = new Student();
		stud2.setName("Ross Stark");
		stud2.setStudentId("3412");
		
		System.out.println("Exam Ids are: ");
		System.out.println(stud1.generateExamId());
		System.out.println(stud2.generateExamId());
		
		
	}

}
