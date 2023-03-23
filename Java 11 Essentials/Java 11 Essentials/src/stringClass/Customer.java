package stringClass;

public class Customer{
	
//	Instance Variables
	private String customerName;
	private int applicableDiscount;
	
//	Methods
	public void findDiscountAndName(String inputString) {
		String str = inputString.trim();
		int n = str.indexOf(":");
		this.setCustomerName(str.substring(n+1, str.length()));
		String customerType = str.substring(0, n);
		if( customerType.equals("Regular") ) {
			this.setApplicableDiscount(10);
		} else if( customerType.equals("Privileged") ) {
			this.setApplicableDiscount(20);
		} else {
			this.setApplicableDiscount(0);
		}
		this.setApplicableDiscount(applicableDiscount);
	}
	
//	Getters and Setters
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getApplicableDiscount() {
		return applicableDiscount;
	}
	public void setApplicableDiscount(int applicableDiscount) {
		this.applicableDiscount = applicableDiscount;
	}
}
