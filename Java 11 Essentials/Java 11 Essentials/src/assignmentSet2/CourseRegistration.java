package assignmentSet2;

public class CourseRegistration {

//	Instance Variables
	private String studentName;
	private int registrationId;
	private float qualifyingMarks;
	private double courseFee;
	private int courseId;
	private boolean hostelRequired;

//	Methods
	public boolean validateMarks() {
		return ( this.getQualifyingMarks() >= 65 && this.getQualifyingMarks() <= 100 );
	}
	public boolean validateCourseId() {
		return ( this.getCourseId() >= 1001 && this.getCourseId() <= 1005 );
	}
	public void calculateCourseFee() {

//		Setting BaseFee based on Course Id
		int baseFee = switch (this.getCourseId()) {
		case 1001 -> 55_000;
		case 1002 -> 35_675;
		case 1003 -> 28_300;
		case 1004 -> 22_350;
		case 1005 -> 1_15_000;
		default   -> throw new IllegalArgumentException("Unexpected value: " + this.getCourseId());
		};

//		Setting discount based on Qualifying Marks
		double discountedFee = 0;
		if( this.getQualifyingMarks() >= 65 && this.getQualifyingMarks() <= 69 ) {
			discountedFee = baseFee * ( 1 - 5 / 100.0 );
		}
		else if( this.getQualifyingMarks() >= 70 && this.getQualifyingMarks() <= 84 ) {
			discountedFee = baseFee * ( 1 - 10 / 100.0 );
		}
		else if( this.getQualifyingMarks() >= 85 ) {
			discountedFee = baseFee * ( 1 - 15 / 100.0 );
		} 

		this.setCourseFee(Math.round(discountedFee*100) / 100.0);

	}

	public void displayCourseDetails() {
		
//		Validating Course Id and Qualifying Marks
		if ( !this.validateCourseId() && !this.validateMarks() ) {
			System.out.println("Invalid Course Id. Please try again!!");
			System.out.println("Marks is less than 65. You are not eligible for admission!!");
			System.out.println();
			return;
		} 
		else if( !this.validateCourseId() ) {
			System.out.println("Invalid Course Id. Please try again!!");
			System.out.println();
			return;
		}
		else if( !this.validateMarks() ) {
			System.out.println("Marks is less than 65. You are not eligible for admission!!");
			System.out.println();
			return;
		}
		System.out.println("********Course Allocation Details********");
		System.out.println("Student Name:                " + this.getStudentName());
		System.out.println("Course Id:                   " + this.getCourseId());
		System.out.println("Qualifying Exam Marks:       " + this.getQualifyingMarks());
		System.out.println("Student's Registration Id:   " + this.getRegistrationId());
		this.calculateCourseFee();
		System.out.println("Total course fee:            " + this.getCourseFee());
		System.out.println("Hostel Required:             " + this.isHostelRequired());
		System.out.println();
	}

//	Getters and Setters
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public float getQualifyingMarks() {
		return qualifyingMarks;
	}
	public void setQualifyingMarks(float qualifyingMarks) {
		this.qualifyingMarks = qualifyingMarks;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee( double courseFee ) {
		this.courseFee = courseFee;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public boolean isHostelRequired() {
		return hostelRequired;
	}
	public void setHostelRequired(boolean hostelRequired) {
		this.hostelRequired = hostelRequired;
	}

}
