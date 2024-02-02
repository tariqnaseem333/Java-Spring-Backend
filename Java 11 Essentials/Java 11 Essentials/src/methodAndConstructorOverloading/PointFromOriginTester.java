package methodAndConstructorOverloading;

public class PointFromOriginTester {

	public static void main(String[] args) {
		
//		Creating origin Point
		PointFromOrigin origin = new PointFromOrigin();
		
//		Creating a Point with Coordinates
		PointFromOrigin p1 = new PointFromOrigin( 2, 3 );
		
//		Calculating the distance of the Point p1 from origin
		System.out.println("The distance of the Point p1 from origin is: " + p1.distance(origin));

	}

}
