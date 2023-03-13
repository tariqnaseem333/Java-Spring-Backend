package exception;

public class BusBookingTester {
	
	    public static void main(String[] args)throws InvalidDestinationException,
	    InvalidCouponCodeException, InvalidTripPackageException{
			BusBooking booking = new BusBooking(101,"Orlando", "Regular");
			String result = booking.bookTrip("BIGBUS", 8);
			if(result.equals("Booking successful")){
				System.out.println(result);
				System.out.println("Total amount for the trip: " + booking.getTotalAmount());
			}
			else{
				System.out.println(result);
				System.out.println("Your booking was not successful, please try again!");
			}
		}

}
