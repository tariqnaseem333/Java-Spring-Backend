package assignmentSet2;

public class CourseRegistrationTester {
	
	public static void main(String[] args) {
		
//		Input 1:- 
		CourseRegistration course1 = new CourseRegistration();
		course1.setStudentName("Peter");
		course1.setRegistrationId(5001);
		course1.setQualifyingMarks(58);
		course1.setCourseId(1005);
		course1.setHostelRequired(true);
		
//		Input 2:- 
		CourseRegistration course2 = new CourseRegistration();
		course2.setStudentName("Peter");
		course2.setRegistrationId(5001);
		course2.setQualifyingMarks(68);
		course2.setCourseId(1006);
		course2.setHostelRequired(true);
		
//		Input 3:- 
		CourseRegistration course3 = new CourseRegistration();
		course3.setStudentName("Peter");
		course3.setRegistrationId(5001);
		course3.setQualifyingMarks(78);
		course3.setCourseId(1005);
		course3.setHostelRequired(false);
		
		CourseRegistration[] courses = { course1, course2, course3 };
		for( CourseRegistration course : courses ) {
			course.displayCourseDetails();
		}
		
	}

}
