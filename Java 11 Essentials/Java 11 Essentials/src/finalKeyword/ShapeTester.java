package finalKeyword;

public class ShapeTester {
	
	public static void main(String[] args) { 
		
		Shape rectangle = new Rectangle(50, 30); 
		Shape square = new Square(60); 
		System.out.println("Area of Rectangle :  "+ rectangle.getArea()); 
		System.out.println("Area of Square :     "+ square.getArea()); 
		
	} 

}
