package oopConstructs;

public class PointTester {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.setX(2);
		p1.setY(3);
		System.out.println("The distance of Point P1 from origin: " + p1.Distance());
		
		Point p2 = new Point();
		p2.setX(5);
		p2.setY(6);
		System.out.println("The distance of Point P2 from P2: " + p1.Distance(p2));
	}

}
