package stringClass;

public class StudentTester {
	
	public static void main(String[] args) {
		
		Student std1=new Student();
		std1.setFirstName("Filius  ");
		std1.setMiddleName(" ");
		std1.setLastName("Flitwich");

		System.out.println(std1.generateInitials());
		
		
	}

}
