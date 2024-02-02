package methodAndConstructorOverloading;

public class Point {
	
//	Instance Variables
	private double x;
	private double y;
	
//	Methods
//	Method To obtain distance of a point w.r.t origin
	public double distance(){
	    double distance = Math.sqrt( Math.pow(this.x, 2) + Math.pow(this.y, 2) );
	    return Math.round(distance*100) / 100.0;
	}
	//Method to obtain distance of a point w.r.t another point
	public double distance(Point point){
	    double distance = Math.sqrt( Math.pow(this.x-point.x, 2) + Math.pow(this.y-point.y, 2) );
	    return Math.round(distance*100) / 100.0;
	}
	
//	Setters
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}

}
