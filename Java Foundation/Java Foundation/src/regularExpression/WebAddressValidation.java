package regularExpression;

public class WebAddressValidation {

	public static boolean checkWebAddressValidity(String webAddress) {
		boolean flag = false;
		String regex = "(https:\\/\\/|http:\\/\\/)([w]{3}\\.)([A-Za-z0-9@:%._\\\\+~#?&//=]+)(\\.)([A-Za-z]{3,5})";
		if (webAddress.matches(regex)) {
			flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {

		//Change the value of webAddress for testing your code with different web addresses
		String webAddress = "https://www.name12@.com";
		System.out.println("The web address is "+ (checkWebAddressValidity(webAddress) ? "valid!" : "invalid!"));
	}

}
