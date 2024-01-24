package enumeration;

public class Student{
	
//	Instance variables
	private Integer studentId;
	private String name;
	private Integer totalMarks;
	private Grade grade;         //Grade is the name of enum
	private float scholarshipAmount;
	
//	Methods
	public void calculateGrade() {
		
		if( this.getTotalMarks() >= 250 ) {
			this.setGrade(Grade.A);
		}  
		else if( this.getTotalMarks() >= 200 && this.getTotalMarks() < 250 ) {
			this.setGrade(Grade.B);
		}
		else if( this.getTotalMarks() >= 175 && this.getTotalMarks() < 200 ) {
			this.setGrade(Grade.C);
		}
		else if( this.getTotalMarks() >= 150 && this.getTotalMarks() < 175 ) {
			this.setGrade(Grade.D);
		}
		else {
			this.setGrade(Grade.E);
		}
	}
	
	public void calculateScolarshipAmount() {
		switch( this.getGrade() ) {
			case A : this.setScolarshipAmount(5000);
					 break;
			case B : this.setScolarshipAmount(4000);
			 		 break;
			case C : this.setScolarshipAmount(3000);
			 		 break;
			case D : this.setScolarshipAmount(2000);
					 break;
			default : this.setScolarshipAmount(0);
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
