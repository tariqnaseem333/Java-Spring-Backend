package assignmentSet1;

public class BookMyMovieTester {
	
	public static void main(String[] args) {
		
		BookMyMovie booking1 = new BookMyMovie( 101, 5 );
		BookMyMovie booking2 = new BookMyMovie( 102, 4 );
		BookMyMovie booking3 = new BookMyMovie( 103, 8 );
		
		BookMyMovie[] bookings = { booking1, booking2, booking3 };
		
		for( BookMyMovie booking : bookings ) {
			booking.calculateTicketAmount();
			System.out.println("The Total Amount for your booking is: " + booking.getTotalAmount());
		}
		
		
		
		
	}

}
