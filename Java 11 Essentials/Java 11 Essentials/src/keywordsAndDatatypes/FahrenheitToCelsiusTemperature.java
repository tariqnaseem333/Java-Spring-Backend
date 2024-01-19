package keywordsAndDatatypes;

public class FahrenheitToCelsiusTemperature {
	
    //The method converts temperature from one unit to another
	public static void main(String[] args) {
		
        double fahrenheit = 212.0;      // Input in Fahrenheit

        double  celsius = ( ( 5 * (fahrenheit - 32.0) ) / 9.0);     // conversion from fahrenheit to celsius
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        
        //Code to convert from Celsius to Kelvin
        double  kelvin = celsius + 273.15;
        System.out.println(celsius + " degree Celsius is equal to " + kelvin + " in Kelvin");

	}

}
