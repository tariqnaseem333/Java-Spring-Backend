package oopConstructs;

public class Point {
	
//	Instance Variables
	private double x;
	private double y;
	
//	Constructor
	public Point() {}
	
	public Point( double x, double y ) {
		this.x = x;
		this.y = y;
	}
	
//	Methods
	public double distance() {
		double expression = Math.pow(x, 2) + Math.pow(y, 2);
		double distance = Math.sqrt(expression);
		return Math.round(distance*100) / 100.0;
	}
	
	public double distance( Point p ) {
		double expression = Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2);
		double distance = Math.sqrt(expression);
		return Math.round(distance*100) / 100.0;
	}
	
//	Getters and Setters
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

}
