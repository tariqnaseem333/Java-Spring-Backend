package enumeration;

public class Shop {
	
//	Instance Variables
	private double amount;
	private Category type;
	private double discount;
	
//	Constructor
	Shop(double amount, Category type){
		this.amount = amount;
		this.type = type;
	}
	
//	Methods
	public void checkDiscountApplicability(double amount, Category type) {
		if(amount >= 30_000){
			System.out.println("Congratulations you are applicable for discount");
			this.applyDiscount(type);
		}
		else {
			System.out.println("Thank you for shopping, your bill amount is: " + this.getAmount());
		}
	}
	public void applyDiscount(Category type) {
		if( type.equals(Category.MOBILE) && this.getAmount() >= 30_000 ) {
			this.setDiscount(15);
		}
		else if( type.equals(Category.TABLET) && this.getAmount() >= 35_000 ) {
			this.setDiscount(10);
		}
		else if( type.equals(Category.LAPTOP) && this.getAmount() >= 35_000 ) {
			this.setDiscount(8);
		}
		else if( type.equals(Category.DESKTOP) && this.getAmount() >= 50_000 ) {
			this.setDiscount(10);
		}
		else {
			this.setDiscount(7);
		}
		System.out.println("Your discount is: " + this.getDiscount() + "%");
		this.amount = this.amount * ( 1 - this.discount / 100.0 );
		System.out.println("Your total Amount after Discount is: " + this.amount);
	
	}
	
//	Getters and Setters
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public Category getType() {
		return type;
	}

}