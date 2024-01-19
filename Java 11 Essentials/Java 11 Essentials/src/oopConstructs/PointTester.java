package oopConstructs;

public class PointTester {

	public static void main(String[] args) {
		
//		Creating 1st Point using Setter
		Point p1 = new Point();
		p1.setX(2);
		p1.setY(3);
		
//	    Distance of Point p1 from Origin
		System.out.println("The distance of the Point p1 from origin is: " + p1.distance());
		
//	    Creating 2nd Point using Constructor
		Point p2 = new Point( 5, 6 );
		
//	    Distance of Point p2 from p1
		System.out.println("The distance of the Point p2 from Point p1 is: " + p2.distance(p1));
	}

}
