package inheritance;

public class UltraFoodie extends SuperFoodie {
	
//	Instance Variable
	protected int rewardPoints;
	
//	Constructor
	public UltraFoodie(int foodieId, String foodieName, String city, long mobileNo, double discount) {
		super(foodieId, foodieName, city, mobileNo, discount);
	}
	
//	Method
	public void calculateTotalPriceWithRewardPoints(Pizza[] pizzaList) {
		this.calculateTotalPriceWithDiscount(pizzaList);
		rewardPoints = (int)(totalPrice/10);
	}
	
//	Getters and Setters
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

}

