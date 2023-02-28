package staticKeyword;

public class Participant {
	
//	Instance Variables
	private String registrationId;
	private String name;
	private long contactNumber;
	private String city;
	
//	Static Variables
	private static int counter;
	static {
		counter = 0;
	}
	
//	Constructor
	public Participant( String name, long contactNumber, String city ) {
		this.name = name;
		this.contactNumber = contactNumber;
		this.city = city;
		if( counter > 9 ) {
			this.registrationId = "D100" + (++counter);
		} else {
			this.registrationId = "D1000" + (++counter);
		}
	}
	
//	Getters and Setters
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
}
