package abstractClass;

public class CreditCardPayment extends Payment {
	
//	Static Variable
	private static int counter;
	static {
		counter = 0;
	}
	
//	Constructor
	public CreditCardPayment( int customerId ) {
		super( customerId );
		if( counter > 9 ) {
			super.setPaymentId("C10");
		} else {
			super.setPaymentId("C100");
		}
		super.setPaymentId( super.getPaymentId() + (++counter) );
	}
	
//	Methods
	public double payBill( double amount ) {
		double serviceTaxAmount = 0;
		if( amount <= 500 ) {
			super.setServiceTaxPercentage(3.0);
		}
		else if( amount > 500 && amount <= 1000 ) {
			super.setServiceTaxPercentage(5.0);
		}
		else if( amount > 1000 ) {
			super.setServiceTaxPercentage(6.0);
		}
		serviceTaxAmount = amount * super.getServiceTaxPercentage() / 100.0;
		double finalAmount = amount + serviceTaxAmount;
		return finalAmount;
	}

//	Getters and Setters
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		CreditCardPayment.counter = counter;
	}
	
	

}
