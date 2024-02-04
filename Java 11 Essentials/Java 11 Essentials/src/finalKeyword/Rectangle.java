package finalKeyword;

public class Rectangle extends Shape { 

//	Constructor
	public Rectangle(double length, double breadth) { 
		super(length, breadth); 
	} 
	
//	Overriding Getter Method from parent
	@Override
	final double getArea() { 
		return this.getLength() * this.getBreadth(); 
	}
	
} 
