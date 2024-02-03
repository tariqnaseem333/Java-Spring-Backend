package methodOverriding;

public class SeniorTraveller extends Traveller{
	
//	Instance Variable
	private int age;
	
//	Constructor
	public SeniorTraveller( String name, String id, int age ) {
		super( name, id );
		this.age = age;
	}
	
//	Methods
	@Override
	public void calculateFare() {
//		Base Fare = 2000 and Service tax = 11.36% of Base Fare
		double discountedFare = 0;
		if( this.age >= 50 && this.age <= 65 ) {
			discountedFare = 2000 * ( 1 - 10 / 100.0 );
		}
		else if( this.age > 65 ) {
			discountedFare = 2000 * ( 1 - 15 / 100.0 );
		}
		else if( this.age < 50 ) {
			this.setFare(-1);
			System.out.println("You not a Senior");
			return;
		}
		double totalFare = discountedFare * ( 1 + ( 11.36 /100.0 ) );
		this.setFare( Math.round(totalFare*100) / 100.0 );
	}
	@Override
	public void displayDetails() {
		System.out.println("Senior Traveller Details");
		System.out.println("************************");
		System.out.println("Traveller Name:   " + this.getName());
		System.out.println("Traveller Id:     " + this.getId());
		this.calculateFare();
		System.out.println("Cost of Travel:   " + this.getFare());
		System.out.println();
	}

//	Getters and Setters
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
