package staticKeyword;

public class Car {
	
//	Instance Variable
    private String color;
    
//  Static Variable
	private static int numberOfCars = 0;
	
//	Constructor
	public Car(String color) {
	   this.color = color;
	   numberOfCars++;
	}
	
//	Method
	public void displayColor() {
		System.out.println("Color of the car : " + this.color);
	}
	
//	Getters
	public String getColor() {       //static method
	    return this.color;
	}
	public static int getNumberOfCars() {
		return numberOfCars;
	}
	
}
