package abstractKeyword;

public abstract class Student{
	
//	Instance Variables
	private String name;
	private int[] test = new int[4];
	private String result;
	
//	Constructor
	protected Student( String name ) {
		this.name = name;
	}
	
//	Methods
	public abstract void generateResult();
	
//	Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getTest() {
		return test;
	}
	public void setTestScore( int testNumber,  int testScore) {
		this.test[testNumber] = testScore;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
