package interfaceClass;

public class PurchaseDetails {
	
//	Instance Variables
	private String purchaseId;
	private String paymentType;
	private double taxPercentage;
	
//	Constructor
	public PurchaseDetails( String purchaseId, String paymentType ) {
		this.purchaseId = purchaseId;
		this.paymentType = paymentType;
	}
	
//	Methods
	public double calculateTax( double price ) {
		this.taxPercentage = 0;
		if( this.paymentType.equals("Debit Card") ) {
			this.taxPercentage = 2.0;
		} 
		else if( this.paymentType.equals("Credit Card") ) {
			this.taxPercentage = 3.0;
		} 
		else {
			this.taxPercentage = 4.0;
		}
		double totalAmount = price * ( 1 + this.taxPercentage / 100.0 );
		return totalAmount;
	}
	
//	Getters and Setters
	public String getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	
	
	

}
