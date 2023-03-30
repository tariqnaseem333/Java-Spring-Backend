package finalKeyword;

public class Shape { 
	final private double length; 
	final private double breadth; 
	
	
	public Shape(double length, double breadth) { 
		this.length = length; 
		this.breadth = breadth; 
	} 
	
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
