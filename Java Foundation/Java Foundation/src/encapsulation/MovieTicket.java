package encapsulation;
public class MovieTicket {
	
//	Instance Variables
	private int movieId;
	private int noOfSeats;
	private double costPerTicket;
	
//	Constructor
	public MovieTicket( int movieId, int noOfSeats ) {
		this.movieId = movieId;
		this.noOfSeats = noOfSeats;
	}
	
//	Methods
	public double calculateTotalAmount() {
		if( this.movieId == 111 ) {
			this.costPerTicket = 7;
		} else if( this.movieId == 112 ) {
			this.costPerTicket = 8;
		} else if( this.movieId == 113 ) {
			this.costPerTicket = 8.5;
		} else {
			return 0.0;
		}
		
		double amount = this.costPerTicket * this.noOfSeats;
		double totalAmount = amount * ( 1 + 2.0/100.0 );
		double finalAmount = Math.round( totalAmount);
		
		return finalAmount;
	}
	
//	Generate Getters and Setters
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public double getCostPerTicket() {
		return costPerTicket;
	}
	public void setCostPerTicket(double costPerTicket) {
		this.costPerTicket = costPerTicket;
	}
}
