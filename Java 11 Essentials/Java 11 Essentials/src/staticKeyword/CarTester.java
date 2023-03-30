package staticKeyword;

public class CarTester {
	
	public static void displayCar() {
	    System.out.println("Displaying Car details");
	}
	
	public static void main(String[] args) {
		Car c1 = new Car("Red");
		Car c2 = new Car("Green");
		Car c3 = new Car("Blue");

		CarTester.displayCar();
        System.out.println("Number of Cars created: " + Car.getNumberOfCars());
        System.out.println("Colors of the Cars: ");
        c1.displayColor();
        c2.displayColor();
        c3.displayColor();
		
	}

}
