package exception;

public class BusBooking {
	
//	Instance Variables
	private int bookingId;
	private String destination;
	private String tripPackage;
	private double totalAmount;
	
//	Constructor
	public BusBooking( int bookingId, String destination, String tripPackage ) {
		this.bookingId = bookingId;
		this.destination = destination;
		this.tripPackage = tripPackage;
		this.totalAmount = 0;
	}
	
//	Methods
	public String bookTrip( String couponCode, int numberOfMembers )throws InvalidDestinationException,
	InvalidTripPackageException, InvalidCouponCodeException{
		try {
			if(  this.destination.equals("Washington DC") ||
					 this.destination.equals("Philadelphia") ||	
					 this.destination.equals("Orlando") ||
					 this.destination.equals("Boston") ||
					 this.destination.equals("Atlanta")  ) {
				} else {
					throw new InvalidDestinationException( "Invalid Destination" );
				}
		} catch( InvalidDestinationException e ) {
			return e.getMessage();
		}
		
		try {
			if( this.tripPackage.equals("Regular") ||
					this.tripPackage.equals("Premium")	) {
				} else {
					throw new InvalidTripPackageException( "Invalid Trip Package" );
				}
		} catch( InvalidTripPackageException e ) {
			return e.getMessage();
		}
		
		try {
			validateCouponCode( couponCode, numberOfMembers );
		} catch ( InvalidCouponCodeException e ) {
			return e.getMessage();
		}
		
		if( this.tripPackage.equals("Regular") ) {
			this.totalAmount = 500 * numberOfMembers;
			return "Booking successful";
		} else if( this.tripPackage.equals("Premium") ) {
			this.totalAmount = 800 * numberOfMembers;
			return "Booking successful";
		}
		
		return "";
		
	}
	
	public boolean validateCouponCode( String couponCode, int numberOfMembers )throws InvalidCouponCodeException  {
		if( ( (couponCode.equals("BIGBUS") && numberOfMembers >= 10) ||
			  (couponCode.equals("MAGICBUS") && numberOfMembers >= 15) )	) {
			return true;
		}
		else {
			throw new InvalidCouponCodeException( "Invalid Coupon Code" );
		}
	}
	
//	Getters and Setters
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTripPackage() {
		return tripPackage;
	}
	public void setTripPackage(String tripPackage) {
		this.tripPackage = tripPackage;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
