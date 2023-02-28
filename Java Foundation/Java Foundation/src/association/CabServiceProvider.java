package association;

public class CabServiceProvider {
	
//	Instance Variables
	private String cabServiceName;
	private int totalCabs;
	
//	Constructor
	public CabServiceProvider( String cabServiceName, int totalCabs ) {
		this.cabServiceName = cabServiceName;
		this.totalCabs = totalCabs;
	}
	
//	Methods
	public double calculateRewardPrice( Driver driver ) {
		double bonus = 0.0;
		float rating = driver.getAverageRating();
		if( this.cabServiceName.equals("Halo") ) {
			if( rating >= 4.5F && rating <= 5F ) {
				bonus = 10*rating;
				return Math.round(bonus*100) / 100;
			} else if( rating >= 4.0F && rating < 4.5F ) {
				bonus = 5*rating;
				return Math.round(bonus*100) / 100;
			} else {
				return bonus;
			}
		} else if( this.cabServiceName.equals("Aber") ) {
			if( rating >= 4.5F && rating <= 5F ) {
				bonus = 8*rating;
				return Math.round(bonus*100) / 100;
			} else if( rating >= 4.0F && rating < 4.5F ) {
				bonus = 3*rating;
				return Math.round(bonus*100) / 100;
			} else {
				return bonus;
			}
		}
		return bonus;
	}
	
//	Getters and Setters
	public String getCabServiceName() {
		return cabServiceName;
	}
	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName = cabServiceName;
	}
	public int getTotalCabs() {
		return totalCabs;
	}
	public void setTotalCabs(int totalCabs) {
		this.totalCabs = totalCabs;
	}

}
