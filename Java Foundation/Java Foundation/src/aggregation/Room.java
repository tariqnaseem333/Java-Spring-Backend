package aggregation;

public class Room {
	
//	Instance Variables
	private int roomNo;
	private int capacity;
	
//	Static Variable
	private static int roomCounter;
	static {
		roomCounter = 500;
	}
	
//	Constructor
	public Room() {
		this.roomNo = roomCounter++;
		this.capacity = 4;
	}
	
//	Methods
	public String toString(){
        return "Room\nroomNo: "+this.roomNo+"\ncapacity: "+this.capacity;
    }

	
//	Getters and Setters
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public static int getRoomCounter() {
		return roomCounter;
	}
	public static void setRoomCounter(int roomCounter) {
		Room.roomCounter = roomCounter;
	}
	
	

}
