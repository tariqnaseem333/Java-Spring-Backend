package regularExpression;

public class WebAddressValidator {

	public static boolean isValidWebAddress(String webAddress){
		String regex = "(https:\\/\\/|http:\\/\\/)(www\\.)?([A-Za-z0-9]+)\\.(com|org|net)";
		if( webAddress.matches(regex) ) {
			return true;
		} else {
			return false;
		}
	}
	
}

