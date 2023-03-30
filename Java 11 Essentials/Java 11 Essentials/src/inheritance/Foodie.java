package inheritance;

public class Foodie {
	
//	Instance Variables
	protected int foodieId;
	protected String foodieName;
	protected String city;
	protected long mobileNo;
	protected double totalPrice;
	
//	Constructor
	public Foodie(int foodieId, String foodieName, String city, long mobileNo) {
		this.foodieId = foodieId;
		this.foodieName = foodieName;
		this.city = city;
		this.mobileNo = mobileNo;
	}
	
//	Methods
	public void calculateTotalPrice(Pizza[] pizzaList) {
		for (Pizza pizza : pizzaList) {
			totalPrice += pizza.price * pizza.quantity;
		}
	}
	
//	Getters and Setters
	public int getFoodieId() {
		return foodieId;
	}

	public void setFoodieId(int foodieId) {
		this.foodieId = foodieId;
	}

	public String getFoodieName() {
		return foodieName;
	}

	public void setFoodieName(String foodieName) {
		this.foodieName = foodieName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}

