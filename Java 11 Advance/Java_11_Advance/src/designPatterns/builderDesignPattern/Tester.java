package designPatterns.builderDesignPattern;

import designPatterns.builderDesignPattern.Car.CarBuilder;

public class Tester {

	public static void main(String[] args) {
		
		Car car = CarBuilder.builder()
				  			.setColor("Red")
				  			.setYear(2008)
				  			.build();
		System.out.println(car);
		
//		Car car = new Car.CarBuilder("Tesla", "Roadster")
//						 .setYear(2008)
//						 .setColor("Red")
//						 .build();
//		System.out.println(car);
		
//		Car.CarBuilder carBuilder = new Car.CarBuilder("Tesla", "Roadster");
//		Car car = carBuilder.setYear(2008).setColor("Red").build();
//		System.out.println(car);
		
	}

}

