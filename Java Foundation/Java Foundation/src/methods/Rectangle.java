package methods;
public class Rectangle {
	
//	Instance Variables
	public float length;
	public float width;
	
//	Methods
	public double calculateArea() {
		double area = this.length * this.width;
		double areaFinal = Math.round( area*100.0 ) / 100.0;
		return area;
	}
	
	public double calculatePerimeter() {
		double perimeter = 2 * (this.length + this.width);
		double perimeterFinal = Math.round( perimeter*100.0 ) / 100.0;
		return perimeterFinal;
		
	}
}
