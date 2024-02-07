package assignmentSet2;

public class RRTechnicalCertificationTester {
	
	public static void main(String[] args) {
		
		RegularCourseCertification	regularCourse = new	RegularCourseCertification( "Rakesh", "J2EE", 5, 85 );
		regularCourse.displayCourseDetails();
		
		CrashCourseCertification crashCourse = new CrashCourseCertification( "Roshan", "Angular", 71 );
		crashCourse.displayCourseDetails();
		
	}

}
