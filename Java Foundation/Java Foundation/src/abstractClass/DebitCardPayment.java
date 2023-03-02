package abstractClass;

public class DebitCardPayment extends Payment {
	
//	Instance Variable
	private double discountPercentage;
	
//	Static Variable
	private static int counter;
	static {
		counter = 0;
	}
	
//	Constructor
	public DebitCardPayment( int customerId ) {
		super( customerId );
		if( counter > 9 ) {
			super.setPaymentId("D10");
		} else {
			super.setPaymentId("D100");
		}
		super.setPaymentId( super.getPaymentId() + (++counter) );
	}
	
//	Methods
	public double payBill( double amount ) {
		double serviceTaxAmount = 0;
		if( amount <= 500 ) {
			super.setServiceTaxPercentage(2.5);
		}
		else if( amount > 500 && amount <= 1000 ) {
			super.setServiceTaxPercentage(4.0);
		}
		else if( amount > 1000 ) {
			super.setServiceTaxPercentage(5.0);
		}
		serviceTaxAmount = amount * super.getServiceTaxPercentage() / 100.0;
		
		double amountAfterDiscount = 0;
		if( amount <= 500 ) {
			this.discountPercentage = 1.0;
		}
		else if( amount > 500 && amount <= 1000 ) {
			this.discountPercentage = 2.0;
		}
		else if( amount > 1000 ) {
			this.discountPercentage = 3.0;
		}
		amountAfterDiscount = amount * ( 1 - this.discountPercentage / 100.0 );
		double finalAmount = amountAfterDiscount + serviceTaxAmount;
		return finalAmount;
	}
	
//	Getters and Setters
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		DebitCardPayment.counter = counter;
	}

}
