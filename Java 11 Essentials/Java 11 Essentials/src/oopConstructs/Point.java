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
	
//	Method to obtain distance of a point w.r.t origin
	public double distance() {
		double distance = Math.sqrt( Math.pow(this.x, 2) + Math.pow(this.y, 2) );
	    return Math.round(distance*100) / 100.0;
	}
	
//	Method to obtain distance of a point w.r.t another point
	public double distance( Point point ) {
	    double distance = Math.sqrt( Math.pow(this.x-point.x, 2) + Math.pow(this.y-point.y, 2) );
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
