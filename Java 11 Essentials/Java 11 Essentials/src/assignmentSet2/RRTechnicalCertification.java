package assignmentSet2;

public abstract class RRTechnicalCertification implements Certification {
	
//	Instance Variables
	private String studentName;
	private String courseName;
	private int registrationId;
	private int admissionTestMarks;
	
//	Static Variable
	public static int counter = 1001;
	
//	Constructor
	public RRTechnicalCertification(String studentName, String courseName, int admissionTestMarks) {
		this.studentName = studentName;
		this.courseName = courseName;
		this.admissionTestMarks = admissionTestMarks;
	}
	
//	Methods
	public abstract void generateRegistrationId();
	public abstract double calculateFee();
	public abstract void displayCourseDetails();

//	Getters and Setters
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public int getAdmissionTestMarks() {
		return admissionTestMarks;
	}
	public void setAdmissionTestMarks(int admissionTestMarks) {
		this.admissionTestMarks = admissionTestMarks;
	}

}
