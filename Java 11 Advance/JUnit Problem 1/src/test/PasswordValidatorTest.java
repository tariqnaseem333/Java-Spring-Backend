package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.infy.exception.InfyAcademyException;

import application.PasswordValidator;

public class PasswordValidatorTest {
	
	@Test
	public void validatePasswordValidPassword() throws InfyAcademyException {
		String validPassword = "Asdf123";
		PasswordValidator passwordValidator = new PasswordValidator();
		Assertions.assertTrue(passwordValidator.validatePassword(validPassword));
	}
	
	@Test
	public void validatePasswordInvalidPassword() throws InfyAcademyException {
		String invalidPassword = "Asdf";
		PasswordValidator passwordValidator = new PasswordValidator();
		Assertions.assertFalse(passwordValidator.validatePassword(invalidPassword));
	}
	
	public void validatePasswordInvalidPasswordException() throws InfyAcademyException {
		String nullPassword = null;
		PasswordValidator passwordValidator = new PasswordValidator();
		InfyAcademyException exception = Assertions.assertThrows(InfyAcademyException.class,
				() -> passwordValidator.validatePassword(nullPassword));
		Assertions.assertEquals("Invalid Password.", exception.getMessage());
	}
	
	@ParameterizedTest
	@CsvSource(value= {"Qwerty, false", "Qwerty1234, true" ,
						"QwertyAsdfZxcvVcxzFdsaRewq, false", "Zxcvb54321, true"})
	public void validatePasswordParameterizedPassword(String password, boolean expected) throws InfyAcademyException {
		PasswordValidator passwordValidator = new PasswordValidator();
		boolean actual = passwordValidator.validatePassword(password);
		Assertions.assertEquals(expected, actual);
	}
	
}