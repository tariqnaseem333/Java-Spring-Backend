package methodOverriding;

public class TravellerTester {
	
	public static void main(String[] args) {
		
		Traveller traveller = new Traveller( "Roger", "AQW1344321" );
		traveller.displayDetails();
		
		SeniorTraveller seniorTraveller = new SeniorTraveller( "Joey", "PJAMG7755TY",  70 );
		seniorTraveller.displayDetails();
		
	}

}
