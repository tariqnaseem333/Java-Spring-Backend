package assignmentSet2;

public class CrashCourseCertification extends RRTechnicalCertification implements Certification {

//	Constructor
	public CrashCourseCertification(String studentName, String courseName, int admissionTestMarks) {
		super(studentName, courseName, admissionTestMarks);
		this.generateRegistrationId();
	}
	
//	Methods
	@Override
	public void generateRegistrationId() {
		if( RRTechnicalCertification.counter%2 == 0 )
			this.setRegistrationId(RRTechnicalCertification.counter);
		else 
			this.setRegistrationId(++RRTechnicalCertification.counter);
		RRTechnicalCertification.counter++;
	}
	@Override
	public double calculateFee() {
//		Calculating DiscountedFee based on Admission Test Marks 
		double discountedFee = Certification.CRASH_COURSE_FEE;
		if( this.getAdmissionTestMarks() >= 90 && this.getAdmissionTestMarks() <= 100 )
			discountedFee = discountedFee * ( 1 - 10 / 100.0 );
		else if( this.getAdmissionTestMarks() >= 75 && this.getAdmissionTestMarks() <= 89 )
			discountedFee = discountedFee * ( 1 - 5 / 100.0 );
		
//		Adding Service Tax of 12.36% to discountedFee
		double totalFee  = discountedFee * ( 1 + 12.36 / 100.0 ); 
		return Math.round(totalFee*100) / 100.0;
	}
	@Override
	public void displayCourseDetails() {
		System.out.println("Crash Course Registration Details");
		System.out.println("*********************************");
		System.out.println("Student Name     : " + this.getStudentName());
		System.out.println("Course Name      : " + this.getCourseName());
		System.out.println("Course Duration  : 2 months");
		System.out.println("Registration ID  : " + this.getRegistrationId());
		System.out.println("Fees             : " + this.calculateFee());
		System.out.println();
	}
	
}