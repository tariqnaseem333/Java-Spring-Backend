package enumeration;

public class Shop {

	//	Instance Variables
	private double amount;
	private Category type;
	private double discount;

	//	Constructor
	Shop(double amount,Category type){
		this.amount=amount;
		this.type=type;
	}

	//	Methods
	public void checkDiscountApplicability(double amount,Category type)
	{
		if(amount>=30000){
			System.out.println("congratulations you are applicable for discount");
			this.applyDiscount(type);
		}
		else {
			System.out.println("Thank you for shopping, your bill amount is: " + this.getAmount());
		}
	}
	public void applyDiscount(Category type) {

		if( type.equals(type.MOBILE) && this.amount >= 30000 ) {
			this.discount = 15;
			this.amount = this.amount * ( 1 - this.discount / 100.0 );
			System.out.println("Your total Amount after Discount is: " + this.amount);
		}
		else if( type.equals(type.TABLET) && this.amount >= 35000 ) {
			this.discount = 10;
			this.amount = this.amount * ( 1 - this.discount / 100.0 );
			System.out.println("Your total Amount after Discount is: " + this.amount);
		}
		else if( type.equals(type.LAPTOP) && this.amount >= 35000 ) {
			this.discount = 8;
			this.amount = this.amount * ( 1 - this.discount / 100.0 );
			System.out.println("Your total Amount after Discount is: " + this.amount);
		}
		else if( type.equals(type.COMPUTER) && this.amount >= 35000 ) {
			this.discount = 10;
			this.amount = this.amount * ( 1 - this.discount / 100.0 );
			System.out.println("Your total Amount after Discount is: " + this.amount);
		}
		else {
			this.discount = 7;
			this.amount = this.amount * ( 1 - this.discount / 100.0 );
			System.out.println("Your total Amount after Discount is: " + this.amount);
		}
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
