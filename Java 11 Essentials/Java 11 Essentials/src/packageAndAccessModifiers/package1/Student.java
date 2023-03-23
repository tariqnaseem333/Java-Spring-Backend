package packageAndAccessModifiers.package1;

public class Student {

//	Instance Variables
	int studentId;
	public String studentName;
	private float totalMarksObtained;
	public float totalMarks;
	
//	Constructor
	public Student( int studentId, String studentName, float totalMarksObtained, float totalMarks ) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.totalMarksObtained = totalMarksObtained;
		this.totalMarks = totalMarks;
	}

//	Getters and Setters
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float getTotalMarksObtained() {
		return totalMarksObtained;
	}
	public void setTotalMarksObtained(float totalMarksObtained) {
		this.totalMarksObtained = totalMarksObtained;
	}
	public float getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(float totalMarks) {
		this.totalMarks = totalMarks;
	}
	
}
