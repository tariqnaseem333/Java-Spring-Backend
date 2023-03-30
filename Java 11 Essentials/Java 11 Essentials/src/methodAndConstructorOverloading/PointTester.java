package methodAndConstructorOverloading;

public class PointTester {
	
	public static void main(String[] args) {
		
////	For Testing Point Class Code 
////		Creating Point 1
//		Point p1 = new Point();
//		p1.setX(2);
//		p1.setY(3);
//		
////		Calculating Point 1 distance from origin
//		System.out.println("The distance of Point P1 from Origin: " + p1.distance());
//		
////		Creating Point 1
//		Point p2 = new Point();
//		p2.setX(5);
//		p2.setY(6);
//		
////		Calculating Point 1 distance from Point 2
//		System.out.println("The distance of Point P1 from Point2: " + p1.distance(p2));
		
		
		
		
//	For Testing PointFromOrigin Class Code 		
//	Creating Point 1 of Origin having (0,0) Coordinates
	PointFromOrigin p0 = new PointFromOrigin();
//	Creating Point 2
	PointFromOrigin p1 = new PointFromOrigin( 2, 3 );
	
//	Calculating Point 1 distance from origin
	System.out.println("The distance of Point P1 from Origin: " + p1.distance(p0));
    		
	
	

	}

}
