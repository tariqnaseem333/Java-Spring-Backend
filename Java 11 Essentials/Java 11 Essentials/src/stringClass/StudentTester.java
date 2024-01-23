package stringClass;

public class StudentTester {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstName("Filius  ");
		student.setMiddleName(" ");
		student.setLastName("Flitwich");

		System.out.println(student.generateInitials());
		
	}

}
