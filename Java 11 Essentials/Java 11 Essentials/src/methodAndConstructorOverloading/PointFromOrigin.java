package methodAndConstructorOverloading;

public class PointFromOrigin {
	
//	Instance Variables
	private double x;
	private double y;
	
//	Constructors
	public PointFromOrigin() {
	}
	public PointFromOrigin(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
//	Methods
	//Method to obtain distance of a point w.r.t origin
	public double distance(){
	    double distance = Math.sqrt( Math.pow(this.x, 2) + Math.pow(this.y, 2) );
	    return Math.round(distance*100) / 100.0;
	}
	//Method to obtain distance of a point w.r.t another point
	public double distance(PointFromOrigin point){
	    double distance = Math.sqrt( Math.pow(this.x-point.getX(), 2) + Math.pow(this.y-point.getY(), 2) );
	    return Math.round(distance*100) / 100.0;
	}
	
//	Getters and Setters
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}

}
