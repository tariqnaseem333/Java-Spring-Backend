package exception;

public class ApplicantTester {

	public static void main(String[] args) {

		Applicant applicant = new Applicant();
		applicant.setApplicantName("Jason");
		applicant.setPostApplied("Assistant");
		applicant.setApplicantAge(25);

		try {
			Validator validation = new Validator();
			validation.validate(applicant); 
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		} catch (InvalidPostException e) {
			System.out.println(e.getMessage());
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
