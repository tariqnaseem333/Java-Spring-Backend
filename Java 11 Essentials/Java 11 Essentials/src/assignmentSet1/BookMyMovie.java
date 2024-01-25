package assignmentSet1;

public class BookMyMovie {
	
//	Instance Variables
	private int movieId;
	private int noOfTickets;
	private double discount;
	private double totalAmount;
	
//	Constructor
	public BookMyMovie( int movieId, int noOfTickets ) {
		this.movieId = movieId;
		this.noOfTickets = noOfTickets;
	}
	
//	Methods
	public void calculateDiscount() {
		
		if( (this.getMovieId() == 101 || this.getMovieId() == 102 || this.getMovieId() == 103)
				&& (this.getNoOfTickets() < 5) ) {
			this.setDiscount(0);
		}
		else if(this.getMovieId() == 101 || this.getMovieId() == 103) {
			if(this.getNoOfTickets() >= 5 && this.getNoOfTickets() < 10) {
				this.setDiscount(15);
			}
			else if(this.getNoOfTickets() >= 10 && this.getNoOfTickets() <= 15) {
				this.setDiscount(20);
			}
		}
		else if(this.getMovieId() == 102) {
			if( this.getNoOfTickets() >= 5 && this.getNoOfTickets() < 10 ) {
				this.setDiscount(10);
			}
			else if( this.getNoOfTickets() >= 10 && this.getNoOfTickets() <= 15 ) {
				this.setDiscount(15);
			}
		}
		else {
			System.out.println("Sorry! Invalid Movie ID!");
			System.out.println("Please check the Movie ID and enter once again.");
		}
		
	}
	public double calculateTicketAmount() {
		this.calculateDiscount();
		double baseFare = switch( this.getMovieId() ) {
			case 101 -> 120;
			case 102 -> 170;
			case 103 -> 150;
			default -> 0;
		};
		double totalAmount = baseFare*this.getNoOfTickets() * (1 - (this.getDiscount() / 100.0));
		return Math.round(totalAmount*100) / 100.0;
	}
	
//	Getters and Setters
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	

}
