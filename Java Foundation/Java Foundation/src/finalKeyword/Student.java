package finalKeyword;

public class Student {
	
//	Instance Variables
	private final int STIPEND = 100;
	private int studentId;
	private int aggregateMarks;
		
//	Constructor
	public Student() {
	}
	
//	Methods
	public double calculateTotalStipend() {
		int bonus = 0;
		if( this.aggregateMarks >= 85 && this.aggregateMarks < 90 ) {
			bonus = 10;
		} else if( this.aggregateMarks >= 90 && this.aggregateMarks < 95 ) {
			bonus = 15;
		} else if( this.aggregateMarks >= 95 && this.aggregateMarks <= 100 ) {
			bonus = 20;
		} else {
			bonus = 0;
		}
		double totalStipend = this.STIPEND + bonus;
		return totalStipend;
		
	}
	
//	Getters and Setters
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAggregateMarks() {
		return aggregateMarks;
	}
	public void setAggregateMarks(int aggregateMarks) {
		this.aggregateMarks = aggregateMarks;
	}
	public int getSTIPEND() {
		return STIPEND;
	}

}
