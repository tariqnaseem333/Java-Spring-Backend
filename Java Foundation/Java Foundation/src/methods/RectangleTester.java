package methods;
public class RectangleTester {
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
		
		rectangle.length = 12F;
		rectangle.width = 5F;
		double area = rectangle.calculateArea();
		double perimeter = rectangle.calculatePerimeter();
		
		//Display the area and perimeter using the lines given below
		System.out.println("Area of the rectangle is " + area);
		System.out.println("Perimeter of the rectangle is " + perimeter);
	}
}
