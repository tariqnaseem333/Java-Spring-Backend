package methodOverriding;

public class Traveller{
	
//	Instance Variables
	private String name;
	private String id;
	private double fare;
	
//	Constructor
	public Traveller( String name, String id ) {
		this.name = name;
		this.id = id;
	}
	
//	Methods
	public void calculateFare() {
//		Base Fare = 2000 and Service tax = 11.36% of Base Fare
		double totalFare = 2000 * ( 1 + 11.36 /100.0 );
		this.setFare(Math.round(totalFare*100) / 100.0);
	}
	public void displayDetails() {
		System.out.println("Traveller Details");
		System.out.println("*****************");
		System.out.println("Traveller Name:   " + this.getName());
		System.out.println("Traveller Id:     " + this.getId());
		this.calculateFare();
		System.out.println("Cost of Travel:   " + this.getFare());
		System.out.println();
		
	}
	
//	Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	
}
