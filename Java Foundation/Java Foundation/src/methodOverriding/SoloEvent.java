package methodOverriding;

public class SoloEvent extends Event {
	
//	Instance Variable
	private int participantNo;
	
//	Constructor
	public SoloEvent( String eventName, String participantName, int participantNo ) {
		super( eventName, participantName );
		this.participantNo = participantNo;
	}
	
//	Methods
	public void registerEvent() {
		super.registerEvent();
	}
	
//	Getters and Setters
	public int getParticipantNo() {
		return participantNo;
	}
	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}

}
