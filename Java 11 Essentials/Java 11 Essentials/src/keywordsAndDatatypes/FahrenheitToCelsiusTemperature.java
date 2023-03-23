package keywordsAndDatatypes;

public class FahrenheitToCelsiusTemperature {
	
    //The method converts temperature from one unit to another
    public static void main(String[] args) {
        double fahrenheit = 106.16;      // Input in Fahrenheit

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);     // conversion from fahrenheit to celsius
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        
        //Write code here to convert temperature to Kelvin
        double celsiusTemp = 41.2;
        
        double fahrenheitTemp = 32.0 + (9.0 * celsiusTemp) / 5.0;
        System.out.println(celsiusTemp + " degree Celsius is equal to " + fahrenheitTemp + " in fahrenheitTemp");
        
    }

}
