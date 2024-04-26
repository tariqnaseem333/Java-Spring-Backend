package application;

public class BoothValidator {

	public boolean validateBoothDetails(String boothName) throws Exception {
		
		if (boothName == null)
			throw new Exception("Booth name is invalid.");
		if (boothName.isBlank())
			return false;
		else
			return true;
		
	}

}
