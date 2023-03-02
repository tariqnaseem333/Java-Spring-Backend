package methodOverriding;

public class TeamEvent extends Event {
	
//	Instance Variables
	private int noOfPartcipant;
	private int teamNo;
	
//	Constructor
	public TeamEvent( String eventName, String participantName, int noOfParticipant, int teamNo ) {
		super( eventName, participantName );
		this.noOfPartcipant = noOfParticipant;
		this.teamNo = teamNo;
	}
	
//	Methods
	public void registerEvent() {
		double registrationFee = 0;
		if( super.getEventName().equals("Singing") ) {
			registrationFee = 4;
		}
		else if( super.getEventName().equals("Dancing") ) {
			registrationFee = 6;
		}
		else if( super.getEventName().equals("DigitalArt") ) {
			registrationFee = 8;
		}
		else if( super.getEventName().equals("Acting") ) {
			registrationFee = 10;
		}
		super.setRegistrationFee(this.noOfPartcipant*registrationFee);
		
	}

//	Getters and Setters
	public int getNoOfPartcipant() {
		return noOfPartcipant;
	}
	public void setNoOfPartcipant(int noOfPartcipant) {
		this.noOfPartcipant = noOfPartcipant;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	

}
