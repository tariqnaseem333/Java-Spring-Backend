package packageAndAccessModifiers.package1;

public class Student {

//	Instance Variables
	Integer studentId;
	public String studentName;
	private float totalMarksObtained;
	public float totalMarks;
	
//	Constructor
	public Student( Integer studentId, String studentName, float totalMarksObtained, float totalMarks ) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.totalMarksObtained = totalMarksObtained;
		this.totalMarks = totalMarks;
	}

//	Getters and Setters
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public float getTotalMarksObtained() {
		return totalMarksObtained;
	}
	public void setTotalMarksObtained(float totalMarksObtained) {
		this.totalMarksObtained = totalMarksObtained;
	}
	
}
