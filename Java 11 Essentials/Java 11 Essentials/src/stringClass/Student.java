package stringClass;

public class Student {
	
//	Instance Variables
	private String firstName;
	private String middleName;
	private String lastName;
	
//	Methods
	public Student change() {
        this.setFirstName(this.firstName.trim());
        this.setMiddleName(this.middleName.trim());
        this.setLastName(this.lastName.trim());
        if( this.middleName.isBlank() || this.middleName.isEmpty() ) {
        	this.setMiddleName("N.A.");
        }
        return this;
	}
	public String generateInitials() {
		Student student = this.change();
		String str = student.getFirstName().substring(0,1) + student.getMiddleName().substring(0,1) + student.getLastName().substring(0,1);
		return str;
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
