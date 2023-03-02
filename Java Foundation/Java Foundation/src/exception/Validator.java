package exception;

public class Validator {
	
	public boolean validateName( String name ) {
		if( name.isEmpty() || name.equals("") ) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean validateJobProfile( String jobProfile ) {
		if( jobProfile.equalsIgnoreCase("Associate") || 
			jobProfile.equalsIgnoreCase("Clerk") ||
			jobProfile.equalsIgnoreCase("Executive") ||
			jobProfile.equalsIgnoreCase("Officer") ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean validateAge( int age ) {
		if( age >= 18 && age <= 30 ) {
			return true;
		} else {
			return false;
		}
	}
	
//	Using Concept of Association
	public void validate( Applicant applicant )throws Exception {
		if( !( this.validateName(applicant.getName()) ) ) {
			throw new InvalidNameException("Invalid name");
		}
		else if( !(this.validateAge(applicant.getAge()) )  ) {
			throw new InvalidAgeException("Invalid age");
		}
		else if( !(this.validateJobProfile(applicant.getJobProfile()) )  ) {
			throw new InvalidJobProfileException("Invalid job profile");
		}
		
	}

}
