package finalKeyword;

public class Shape { 
	
//	Instance Variables
	final private double length; 
	final private double breadth; 
	
//	Constructor
	public Shape(double length, double breadth) { 
		this.length = length; 
		this.breadth = breadth; 
	} 
	
//	Getters
	public final double getLength() {
		return length;
	}
	public final double getBreadth() {
		return breadth;
	}
	double getArea() {
		return 0;
	} 
} 
