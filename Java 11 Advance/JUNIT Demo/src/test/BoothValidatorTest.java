package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import application.BoothValidator;

public class BoothValidatorTest {

	@Test
	public void validateBoothDetailsValidTest() throws Exception {
		String boothName = "Booth1";
		BoothValidator boothValidator = new BoothValidator();
		Assertions.assertTrue(boothValidator.validateBoothDetails(boothName));
	}

	@Test
	public void validateBoothDetailsInvalidTest1() throws Exception {
		String boothName = "";
		BoothValidator boothValidator = new BoothValidator();
		Assertions.assertFalse(boothValidator.validateBoothDetails(boothName));
	}

	@Test
	public void validateBoothDetailsInvalidTest2() throws Exception {
		String boothName = null;
		BoothValidator boothValidator = new BoothValidator();
		Exception exception = Assertions.assertThrows(Exception.class,
				() -> boothValidator.validateBoothDetails(boothName));
		Assertions.assertEquals("Booth name is invalid.", exception.getMessage());
	}

	@Tag("dev")
	@ParameterizedTest
	@CsvSource(value = { "'  ',false", "Booth2,true", "Boo3,true", "'',false" })
	public void validateBoothDetailsTestParameter(String boothName, boolean expected) throws Exception {
		BoothValidator boothValidator = new BoothValidator();
		boolean actual = boothValidator.validateBoothDetails(boothName);
		Assertions.assertEquals(expected, actual);
	}
	
}
