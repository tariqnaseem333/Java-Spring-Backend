package stringClass;

public class Student {
	
//	Instance Variables 
	private String firstName;
	private String middleName;
	private String lastName;
	
//	Methods
	public Student change() {
        this.setFirstName(this.getFirstName().trim());
        this.setLastName(this.getLastName().trim());
        if( this.getMiddleName().isBlank() ) {
        	this.setMiddleName("N.A.");
        } else {
        	this.setMiddleName(this.getMiddleName().trim());
        } 
        return this;
	}
	public String generateInitials() {
        Student student = this.change();
        return student.getFirstName().split("")[0] + student.getMiddleName().split("")[0] + student.getLastName().split("")[0];
//		return student.getFirstName().substring(0,1) + student.getMiddleName().substring(0,1) + student.getLastName().substring(0,1);
//      return String.valueOf(this.getFirstName().charAt(0)) + 
//         	   String.valueOf(this.getMiddleName().charAt(0)) +
//         	   String.valueOf(this.getLastName().charAt(0));
	}
	
//	Getters and Setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}