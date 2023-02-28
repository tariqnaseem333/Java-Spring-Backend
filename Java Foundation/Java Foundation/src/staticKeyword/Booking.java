package staticKeyword;

public class Booking {
	
//	Instance Variables
	private String customerEmail;
	private int seatsRequired;
	private boolean isBooked;
	
	
//	Static Variable
	private static int seatsAvailable;
	static {
		seatsAvailable = 400;
	}
	
//	Constructor
	public Booking( String customerEmail, int seatsRequired ) {
		this.customerEmail = customerEmail;
		this.seatsRequired = seatsRequired;
		if( this.seatsRequired <= seatsAvailable ) {
			this.isBooked = true;
			seatsAvailable = seatsAvailable - seatsRequired;
		} else {
			this.isBooked = false;
		}
	}
	
	
//	Methods
	
	

//  Getters and Setters
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public int getSeatsRequired() {
		return seatsRequired;
	}
	public void setSeatsRequired(int seatsRequired) {
		this.seatsRequired = seatsRequired;
	}
	public boolean isBooked() {
		return isBooked;
	}
	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	public static int getSeatsAvailable() {
		return seatsAvailable;
	}
	public static void setSeatsAvailable(int seatsAvailable) {
		Booking.seatsAvailable = seatsAvailable;
	}

}
