package methodAndConstructorOverloading;

public class PointTester {
	
	public static void main(String[] args) {
		
//		Creating Point p1 and calculating it's distance from origin
		Point p1 = new Point();
		p1.setX(2);
		p1.setY(3);
		System.out.println("The distance of the Point p1 from origin is: " + p1.distance());
		
//		Creating Point p2 and calculating it's distance from Point p1
		Point p2 = new Point();
		p2.setX(5);
		p2.setY(6);
		System.out.println("The distance of the Point p2 from Point p1 is: " + p2.distance(p1));
    		
	}

}
