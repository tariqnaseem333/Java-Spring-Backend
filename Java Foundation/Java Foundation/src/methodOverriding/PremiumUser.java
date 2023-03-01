package methodOverriding;

public class PremiumUser extends User {
	
//	Instance Variables
	private int rewardPoints;
	
//	Constructor
	public PremiumUser( int id, String userName, String emailId, double walletBalance ) {
		super( id, userName, emailId, walletBalance );
	}
	
//	Methods
	@Override
	public boolean makePayment( double billAmount ) {
		if( super.getWalletBalance() >= billAmount ) {
			this.rewardPoints = (int)(this.rewardPoints + 0.10 * billAmount);
			super.setWalletBalance( super.getWalletBalance() - billAmount );
			return true;
		}
		return false;
	}

//	Getters and Setters
	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	

}
