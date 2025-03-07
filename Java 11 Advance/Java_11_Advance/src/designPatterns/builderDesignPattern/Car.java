package designPatterns.builderDesignPattern;

public class Car {
	
	private final String make;    // required field
	private final String model;   // required field
	private final Integer year;   // optional field
	private final String color;   // optional field
	
//	Passing CarBuilder Object, below constructor will initialize
//	Car's instance Variables based on CarBuilder's instance Variables
	private Car(CarBuilder carBuilder) {
		this.make = carBuilder.make;
		this.model = carBuilder.model;
		this.year = carBuilder.year;
		this.color = carBuilder.color;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", color=" + color + "]";
	}
	
//	Getters
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public Integer getYear() {
		return year;
	}
	public String getColor() {
		return color;
	}

	
	//	Defining Static Inner Class which will build the object
	static class CarBuilder {
		
		private String make;
		private String model;
		private Integer year;
		private String color;
		
		public CarBuilder() {
		}
		
		public CarBuilder(String make, String model) {
			this.make = make; 
			this.model = model;
		}

		// It will set year and return the updated CarBuilder object
		public CarBuilder setYear(Integer year) {
			this.year = year;
			return this;
		}
		
		// It will set year and return the updated CarBuilder object
		public CarBuilder setColor(String color) {
			this.color = color;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
		
		public static CarBuilder builder() {
			return new CarBuilder();
		}
		
	}
	

}
