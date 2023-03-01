package methodOverloading;

public class Triangle {
	
//	Instance Variables
	private Point point1; // Using Aggregation here
	private Point point2;
	private Point point3;
	
//	Constructor
	public Triangle() {
		this.point1 = new Point( 0, 0  );
		this.point2 = new Point( 1, 1  );
		this.point3 = new Point( 2, 5  );
	}
	
	public Triangle( double point1XCoordinate, double point1YCoordinate, 
			double point2XCoordinate, double point2YCoordinate,
			double point3XCoordinate, double point3YCoordinate) {
		this.point1 = new Point( point1XCoordinate, point1YCoordinate );
		this.point2 = new Point( point2XCoordinate, point2YCoordinate );
		this.point3 = new Point( point3XCoordinate, point3YCoordinate );
	}
	
	public Triangle( Point point1, Point point2, Point point3 ) {
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
	
//	Methods
	public double calculatePerimeter() {
		double distance12 = point1.calculateDistance(point2);
		double distance23 = point2.calculateDistance(point3);
		double distance31 = point3.calculateDistance(point1);
		
		double perimeter = distance12 + distance23 + distance31;
		return Math.round( perimeter * 100.0 ) / 100.0;
	}
	
	public double calculateArea() {
		double distance12 = point1.calculateDistance(point2);
		double distance23 = point2.calculateDistance(point3);
		double distance31 = point3.calculateDistance(point1);
		
		double s = ( distance12 + distance23 + distance31 ) / 2.0;
		double area = Math.sqrt( s * ( s - distance12 ) * ( s - distance23 ) * ( s - distance31  ) );
		return Math.round( area * 100.0 ) / 100.0;
	}

	
//	Getters and Setters
	public Point getPoint1() {
		return point1;
	}
	public void setPoint1(Point point1) {
		this.point1 = point1;
	}
	public Point getPoint2() {
		return point2;
	}
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}
	public Point getPoint3() {
		return point3;
	}
	public void setPoint3(Point point3) {
		this.point3 = point3;
	}
	
	

}
