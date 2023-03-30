package finalKeyword;

public class Rectangle extends Shape { 

	public Rectangle(double length, double breadth) { 
		super(length, breadth); 
	} 
	
	@Override
	final double getArea() { 
		return this.getLength() * this.getBreadth(); 
	}
	
} 
