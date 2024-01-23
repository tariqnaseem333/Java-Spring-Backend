package wrapperClasses;

public class Student{
	
//	Instance Variables
	private String studentId;
	private String name;
	private String examId;
		
//	Methods
	public String generateExamId() {
		
		int lastDigit = Integer.parseInt(this.getStudentId()) % 10;
		String[] studentName = this.getName().split(" ");
		return studentName[0].substring(0, 3) + "-" + studentName[1].substring(0, 3) + ":" + 
						this.getStudentId() + "-" + (int)Math.pow(lastDigit, 2);
		
//		int studentId = Integer.parseInt(this.getStudentId());
//		String examId = "";
//		String[] strArr = this.name.split(" ");
//		int i = 1;
//		for( String str : strArr ) {
//			if( i == 1 ) {
//				examId = examId + str.substring(0, 3) + "-";
//			} else {
//				examId = examId + str.substring(0, 3) + ":";
//			}
//			i++;
//		}
//		examId = examId + this.studentId + "-" + (int)Math.pow(studentId%10, 2);
//		return examId;
	}
	
//	Getters and Setters
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExamId() {
		return examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}
	
}