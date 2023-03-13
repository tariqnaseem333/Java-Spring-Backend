package regularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	
	public static boolean isValidEmail(String email) {
		
		final String EMAIL_PATTERN = 
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[_A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		boolean flag = false;
		String regex = "[a-zA-Z0-9]+@[a-zA-Z]+\\.(com|in)";

		if (email.matches(regex)) {
			flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {
		String email = "steve123@gmail.com";
		System.out.println("The Email Id of the customer is " + email);
		if (isValidEmail(email))
			System.out.println("The Email Id is valid!");
		else
			System.out.println("The Email Id is invalid!");
	}


}
