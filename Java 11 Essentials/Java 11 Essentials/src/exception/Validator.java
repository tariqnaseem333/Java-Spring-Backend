package exception;

public class Validator {

	public void validate(Applicant applicant) throws InvalidNameException, InvalidPostException, InvalidAgeException{

		if( !this.isValidName(applicant.getApplicantName()))
			throw new InvalidNameException("Invalid applicant name");
		else if( !this.isValidPost(applicant.getPostApplied()))
				throw new InvalidPostException("Invalid post");
		else if( !this.isValidAge(applicant.getApplicantAge()))
				throw new InvalidAgeException("Invalid age exception");
		else
				System.out.println("All the values are valid.");
	}

	public boolean isValidName(String name) {
		return !name.isBlank();
	}

	public boolean isValidAge(int age) { 
		return (age >= 18 && age <= 35);
	}

	public boolean isValidPost(String name) {
		return name.matches("(Probationary Officer)|(Assistant)|(Special Cadre Officer)");
	}

}

