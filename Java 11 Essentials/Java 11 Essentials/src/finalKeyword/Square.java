package finalKeyword;

public class Square extends Shape { 
	public Square(double side) { 
		// calling Shape class constructor 
		super(side, side); 
	} 
	
	@Override
	final double getArea() { 
		return this.getLength() * this.getBreadth(); 
	} 
	
} 
