package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import application.VoterValidator;

public class VoterValidatorTest {

	private static int counter;

	@BeforeAll
	public static void beforeMethod() {
		System.out.println("Before test cases");
	}

	@AfterAll
	public static void afterMethod() {
		System.out.println("After test cases");
	}

	@BeforeEach
	public void beforeEachMethod() {
		System.out.println("Before test case " + (++counter));
	}

	@AfterEach
	public void afterEachMethod() {
		System.out.println("After test case " + (counter));
	}

	@Test
	public void validateVoterAgeValidTest() throws Exception {
		int age = 18;
		VoterValidator voterValidator = new VoterValidator();
		Assertions.assertTrue(voterValidator.validateVoterAge(age));
	}

	@Test
	public void validateVoterAgeInvalidTest1() throws Exception {
		int age = 14;
		VoterValidator voterValidator = new VoterValidator();
		Assertions.assertFalse(voterValidator.validateVoterAge(age));
	}

	@Tag("prod")
	@Test
	public void validateVoterAgeInvalidTest2() throws Exception {
		int age = -14;
		VoterValidator voterValidator = new VoterValidator();
		Exception exception = Assertions.assertThrows(Exception.class, () -> voterValidator.validateVoterAge(age));
		Assertions.assertEquals("Invalid age", exception.getMessage());
	}

	@Tag("dev")
	@ParameterizedTest(name = "Testing for values #{index}")
	@CsvSource(value = { "19, true", "20,true", "17,false", "16,false" })
	public void validateVoterAgeTestParameter(int age, boolean expected) throws Exception {
		VoterValidator voterValidator = new VoterValidator();
		boolean actual = voterValidator.validateVoterAge(age);
		Assertions.assertEquals(expected, actual);
	}

}
