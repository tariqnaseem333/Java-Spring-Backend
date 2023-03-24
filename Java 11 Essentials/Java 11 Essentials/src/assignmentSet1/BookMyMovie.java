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
		if( this.movieId == 101  || this.movieId == 102 || this.movieId == 103 ) {
			if( this.noOfTickets < 5 ) {
				this.setDiscount(0);
			}
		}
		else if( this.movieId == 101  || this.movieId == 103 ) {
			if( this.noOfTickets >= 5 && this.noOfTickets < 10 ) {
				this.setDiscount(15);
			}
			else if( this.noOfTickets >= 10 && this.noOfTickets <= 15 ) {
				this.setDiscount(20);
			}
		}
		else if( this.movieId == 102 ) {
			if( this.noOfTickets >= 5 && this.noOfTickets < 10 ) {
				this.setDiscount(10);
			}
			else if( this.noOfTickets >= 10 && this.noOfTickets <= 15 ) {
				this.setDiscount(15);
			}
		}
		
	}
	
	public double calculateTicketAmount() {
		this.calculateDiscount();
		
		double baseFare = 0;
		if( this.movieId == 101 ) {
			baseFare = 120;
		} 
		else if( this.movieId == 102 ) {
			baseFare = 170;
		} 
		else if( this.movieId == 103 ) {
			baseFare = 150;
		}
		else {
			System.out.println("Sorry! Invalid Movie ID!");
			System.out.println("Please check the Movie ID and enter once again.");
		}
		double totalAmount = baseFare * this.noOfTickets * ( 1 - (discount/100.0));
		this.setTotalAmount(totalAmount);
		return totalAmount;
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
