package arrays;

public class TeacherTester {

	public static void main(String[] args) {
		
		Teacher teacher1 = new Teacher( "Alex", "Java Fundamentals", 1200L );
		Teacher teacher2 = new Teacher( "John", "RDBMS", 800L );
		Teacher teacher3 = new Teacher( "Sam", "Networking", 900L );
		Teacher teacher4 = new Teacher( "Maria", "Python", 900L );
		
		Teacher arr[] = { teacher1, teacher2, teacher3, teacher4 };
		
		for( Teacher teacher : arr ) {
			System.out.print("Name: " + teacher.getTeacherName() + " ");
			System.out.print("Subject: " + teacher.getSubject() + " ");
			System.out.println("Salary: " + teacher.getSalary());
			
		}
		
	}

}
