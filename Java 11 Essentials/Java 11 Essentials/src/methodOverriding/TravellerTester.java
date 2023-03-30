package methodOverriding;

public class TravellerTester {
	
	public static void main(String[] args) {
		
		Traveller t1 = new Traveller( "Roger", "AQW1344321" );
		t1.displayDetails();
		
		SeniorTraveller s1 = new SeniorTraveller( "Joey", "PJAMG7755TY",  70 );
		s1.displayDetails();
		
	}

}
