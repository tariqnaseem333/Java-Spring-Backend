package oopConstructs;

public class PointTester {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.setX(2);
		p1.setY(3);
		System.out.println("The distance of the Point p1 from origin: " + p1.distance());
		
		Point p2 = new Point( 5, 6 );
		System.out.println("The distance of the Point p1 from Point p2 is: " + p2.distance(p1));
	}

}
