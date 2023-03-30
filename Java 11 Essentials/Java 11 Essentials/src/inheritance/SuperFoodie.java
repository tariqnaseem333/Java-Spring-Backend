package inheritance;

public class SuperFoodie extends Foodie {
	
//	Instance Variable
	protected double discount;
	
//	Constructor
	public SuperFoodie(int foodieId, String foodieName, String city, long mobileNo, double discount) {
		super(foodieId, foodieName, city, mobileNo);
		this.discount = discount;
	}
	
//	Method
	public void calculateTotalPriceWithDiscount(Pizza[] pizzaList) {
		this.calculateTotalPrice(pizzaList);
		this.totalPrice -= totalPrice*(discount/100);
	}
	
//	Getters and Setters
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}

