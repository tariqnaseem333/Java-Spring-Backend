package arrays;

public class Student {
	
//	Instance Variables
	private int[] marks;
	private char[] grade;
	
//	Constructor
	public Student( int[] marks) {
		this.marks = marks;
		grade = new char[marks.length];
	}
	
//	Methods 
	public void findGrade() {
		for( int i = 0; i < marks.length; i++ ) {
			if( marks[i] >= 92 && marks[i] <= 100 ) {
				grade[i] = 'E';
			}
			else if( marks[i] >= 85 && marks[i] < 92 ) {
				grade[i] = 'A';
			}
			else if( marks[i] >= 70 && marks[i] < 85 ) {
				grade[i] = 'B';
			}
			else if( marks[i] >= 65 && marks[i] < 70 ) {
				grade[i] = 'C';
			}
			else if( marks[i] < 65 && marks[i] >= 0  ) {
				grade[i] = 'E';
			}
			else {
				System.out.println("Invalid Marks!!");
				System.out.println("Please Enter Valid Marks");
				return;
			}
		}
	}


	
//	Getters and Setters
	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public char[] getGrade() {
		return grade;
	}

	public void setGrade(char[] grade) {
		this.grade = grade;
	}
	
}
