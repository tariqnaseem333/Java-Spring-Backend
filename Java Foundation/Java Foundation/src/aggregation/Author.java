package aggregation;

public class Author {
	
//	Instance Variables
	private String authorName;
	private String emailId;
	private char gender;
	
//	Constructor
	public Author( String authorName, String emailId, char gender ) {
		this.authorName = authorName;
		this.emailId = emailId;
		this.gender = gender;
	}
	
//	Methods
	public void displayAuthorDetails() {
		System.out.println("Displaying Author Details \n***********");
		System.out.println("Author Name : " + authorName);
		System.out.println("Author Email Id : " + emailId);
		System.out.println("Author Gender : " + gender);
		System.out.println();
	}
	
//	Getters and Setters
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	

}
