package staticKeyword;

public class Bill {
	
//	Instance Variables
	static private int counter;
	private String billId;
	private String paymentMode;
	
	static {
		counter = 0;
	}
	
//	Constructors
	public Bill( String paymentMode ) {
		this.paymentMode = paymentMode;
		this.billId = "B900" + (++counter);
	}
	 
//	Getters and Setters
	public static int getCounter() {
		return counter;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	

}
