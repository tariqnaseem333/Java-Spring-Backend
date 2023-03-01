package methodOverloading;

public class Point {
	
//	Instance Variables
	private double xCoordinate;
	private double yCoordinate;
	
//	Constructor
	public Point( double xCoordinate, double yCoordinate ) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
//	Methods
	public double calculateDistance() {
		double distance = Math.sqrt( Math.pow(this.xCoordinate, 2.0) + Math.pow(this.yCoordinate, 2.0) );
		return Math.round(distance*100) / 100.0;
	}
	
	public double calculateDistance( Point point ) {
		double distance = Math.sqrt( Math.pow(this.xCoordinate - point.xCoordinate , 2.0) + Math.pow(this.yCoordinate - point.yCoordinate, 2.0) );
		return Math.round(distance*100) / 100.0;
	}
	
    public String toString(){
        return "Point\nxCoordinate: "+this.getxCoordinate()+"\nyCoordinate: "+this.getyCoordinate();
    }
	
//	Getters and Setters
	public double getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public double getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

}
