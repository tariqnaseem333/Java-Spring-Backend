package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.infy.exception.InfyAcademyException;

import application.EmailValidator;

public class EmailValidatorTest {
	
	@Test
	public void validateEmailIdValidEmailId() throws InfyAcademyException {
		String validEmailId = "Jame_Potter@infy.com";
		EmailValidator emailValidator = new EmailValidator();
		Assertions.assertTrue(emailValidator.validateEmailId(validEmailId));
	}

	@Test
	public void validateEmailIdInvalidEmailId() throws InfyAcademyException {
		String invalidEmailId = "Jame_Potter@infy.org";
		EmailValidator emailValidator = new EmailValidator();
		Assertions.assertFalse(emailValidator.validateEmailId(invalidEmailId));
	}

	@Test
	public void validateEmailIdInvalidEmailIdException() throws InfyAcademyException {
		String nullEmailId = null;
		EmailValidator emailValidator = new EmailValidator();
		InfyAcademyException exception = Assertions.assertThrows(InfyAcademyException.class,
										() -> emailValidator.validateEmailId(nullEmailId));
		Assertions.assertEquals("Invalid Email ID", exception.getMessage());
	}
	
	@ParameterizedTest
	@CsvSource(value= {"NymphieTonks@magic.com, true", "Sirius_Black, false" ,
						"Lily_Evans@Hoggy.in, true", "Remus_Lups, false"})
	public void validateEmailIdParamterizedEmailId(String emailId, boolean expected) throws InfyAcademyException {
		EmailValidator emailValidator = new EmailValidator();
		boolean actual = emailValidator.validateEmailId(emailId);
		Assertions.assertEquals(expected, actual);
	}
	
}
