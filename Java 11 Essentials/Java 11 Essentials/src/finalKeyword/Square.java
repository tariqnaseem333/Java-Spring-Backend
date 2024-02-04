package finalKeyword;

public class Square extends Shape { 
	
//	Constructor
	public Square(double side) { 
		super(side, side); 
	} 
	
//	Overriding Getter Method from parent
	@Override
	final double getArea() { 
		return this.getLength() * this.getBreadth(); 
	} 
	
} 
