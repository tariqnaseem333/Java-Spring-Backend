package regularExpression;

public class WebAddressValidatorTester {

	public static void main(String[] args) {
		String str = "http://www.infosys.com";
		if( WebAddressValidator.isValidWebAddress(str) ) {
			System.out.println("You have entered a valid web address");
		} else {
			System.out.println("You have entered an invalid web address");
		}
	}

}
