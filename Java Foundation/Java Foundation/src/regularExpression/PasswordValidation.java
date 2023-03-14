package regularExpression;

public class PasswordValidation {
	
    public static boolean checkPasswordValidity(String password) {
        boolean flag = false;
//        String regex = "([A-Za-z0-9_!@#$%&*]+){8,20}";
        String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[_!@#$%&*])([A-Za-z0-9_!@#$%&*]+){8,20}";
        if (password.matches(regex)) {
			flag = true;
		}
		return flag;
    }
    
    public static void main(String[] args) {
        
        //Change the value of password for testing your code with different passwords
        String password = "ALPX345@#";
        System.out.println("The password is "+ (checkPasswordValidity(password) ? "valid!" : "invalid!"));
    }

}
