package regularExpression;

import java.util.regex.Pattern;

public class NameValidity {
	
	public static boolean checkNameValidity(String name) {
		
		boolean flag = false;
//		String regex = "[A-Z]([a-z]\\s[a-z]+){2,30}";
		String regex = "[A-Z][a-z]+\\s+[A-Z][a-z]+";

		if (name.matches(regex)) {
			flag = true;
		}
		return flag;
	}  
	
	public static void main(String[] args) {

		//Change the value of name for testing your code with different names
		String name = "Roger Federer";
		System.out.println("The name is "+ (checkNameValidity(name) ? "valid!" : "invalid!"));      
	}

}
