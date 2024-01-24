package enumeration;

public class StudentTester {
	
	public static void main(String[] args) {

		Student student = new Student();
		student.setStudentId(1000);
		student.setName("Alvin");
		student.setTotalMarks(280);
		
		student.calculateGrade();
		student.calculateScolarshipAmount();
		
		System.out.println("Student Details");
		System.out.println("***************");
		System.out.println("Student Id : "+student.getStudentId());
		System.out.println("Name : "+student.getName());
		System.out.println("Grade : "+student.getGrade());
		System.out.println("Scholarship Amount : "+student.getScolarshipAmount());

	}

}
