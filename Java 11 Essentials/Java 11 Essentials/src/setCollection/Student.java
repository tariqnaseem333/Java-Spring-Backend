package setCollection;

public class Student implements Comparable<Student> {

//	Instance Variables
	private Integer studentId;
	private String studentName;
	private Integer studentSemester;

//	Constructor
	public Student(String studentName, Integer studentSemester, Integer studentId) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentSemester = studentSemester;
	}

//  Methods
	public void displayStudentDetails() {
		System.out.println("Student Id: " + this.getStudentId());
		System.out.println("Name: " + this.getStudentName());
		System.out.println("Semester: " + this.getStudentSemester());
		System.out.println();
	}
	@Override
	public int compareTo(Student student) {
		if( this.getStudentId() == student.getStudentId() ) 
			return 0;
		else if( this.getStudentId() > student.getStudentId() )
			return 1;
		else 
			return -1;
	}

//	Getters and setters
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getStudentSemester() {
		return studentSemester;
	}
	public void setStudentSemester(Integer studentSemester) {
		this.studentSemester = studentSemester;
	}

}

