package assignmentSet2;

public class RegularCourseCertification extends RRTechnicalCertification implements Certification {
	
//	Instance Variable
	private int courseDuration;

//	Constructor
	public RegularCourseCertification(String studentName, String courseName, int courseDuration, int admissionTestMarks) {
		super(studentName, courseName, admissionTestMarks);
		this.courseDuration = courseDuration;
		this.generateRegistrationId();
	}
	
//	Methods
	@Override
	public void generateRegistrationId() {
		if( RRTechnicalCertification.counter%2 != 0 )
			this.setRegistrationId(RRTechnicalCertification.counter);
		else 
			this.setRegistrationId(++RRTechnicalCertification.counter);
		RRTechnicalCertification.counter++;
	}
	@Override
	public double calculateFee() {
//		Calculating DiscountedFee based on Admission Test Marks 
		double discountedFee = Certification.REGULAR_COURSE_FEE * this.getCourseDuration();
		if( this.getAdmissionTestMarks() >= 90 && this.getAdmissionTestMarks() <= 100 )
			discountedFee = discountedFee * ( 1 - 10 / 100.0 );
		else if( this.getAdmissionTestMarks() >= 75 && this.getAdmissionTestMarks() <= 89 )
			discountedFee = discountedFee * ( 1 - 5 / 100.0 );
		
		return Math.round(discountedFee*100) / 100.0;
	}
	@Override
	public void displayCourseDetails() {
		System.out.println("Regular Course Registration Details");
		System.out.println("***********************************");
		System.out.println("Student Name     : " + this.getStudentName());
		System.out.println("Course Name      : " + this.getCourseName());
		System.out.println("Course Duration  : " + this.getCourseDuration() + " months");
		System.out.println("Registration ID  : " + this.getRegistrationId());
		System.out.println("Fees             : " + this.calculateFee());
		System.out.println();
	}
	
//	Getters and Setters
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	
}
