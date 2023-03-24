package enumeration;

public class Student{
	
//	Instance Variables
	private Integer studentId;
	private String name;
	private Integer totalMarks;
	private Grade grade;  //Grade is the name of enum
	private float scholarshipAmount;
	
//	Methods
	public void calculateGrade() {
		if( this.totalMarks >= 250 ) {
			this.grade = grade.A;
		}
		else if( this.totalMarks >= 200 && this.totalMarks < 250 ) {
			this.grade = grade.B;
		}
		else if( this.totalMarks >= 175 && this.totalMarks < 200 ) {
			this.grade = grade.C;
		}
		else if( this.totalMarks >= 150 && this.totalMarks < 175 ) {
			this.grade = grade.D;
		}
		else {
			this.grade = grade.E;
		}
	}
	
	public void calculateScolarshipAmount() {
		switch( this.grade ) {
		case A : this.setScolarshipAmount(5000);
		break;
		case B : this.setScolarshipAmount(4000);
		break;
		case C : this.setScolarshipAmount(3000);
		break;
		case D : this.setScolarshipAmount(2000);
		break;
		case E : this.setScolarshipAmount(0);
		break;
		}
	}
	
//	Getters and Setters
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public float getScolarshipAmount() {
		return scholarshipAmount;
	}
	public void setScolarshipAmount(float scolarshipAmount) {
		this.scholarshipAmount = scolarshipAmount;
	}
}
