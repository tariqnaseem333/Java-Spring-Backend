package mapCollection;

public class Trainee {
	
//	Instance Variables
	private Integer traineeId;
	private String name;

//	Constructor
	public Trainee(Integer traineeId, String name) {
		this.traineeId = traineeId;
		this.name = name;
	}

//	Methods
	// Computed based on trainee id
	// Will return same value for same trainee ids
	@Override
	public int hashCode() {
		final int primeNumber = 17;
		return primeNumber * this.traineeId;
	}
	// to check equality based on trainee Ids
	@Override
	public boolean equals(Object object) {
		boolean flag = false;
		Trainee secondObj = null;
		if (object != null)
			flag = true;
		// checking if passed object belongs to current class
		// if true then comparing trainee ids
		if (this.getClass() != object.getClass()) {
			secondObj = (Trainee) object;
			if (this.traineeId == secondObj.traineeId) {
				flag = true;
			} else {
				flag = false;
			}
		}
		return flag;
	}
	// overriding toString to print object references
	@Override
	public String toString() {
		return this.traineeId + " " + this.name;
	}

//	Getters and Setters
	public Integer getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(Integer traineeId) {
		this.traineeId = traineeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

