package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.infy.exception.InfyAcademyException;

import application.GradeCalculator;

public class ApplicationTests {
	
	@ParameterizedTest
	@MethodSource( "testListData" )
	public void calculateGradeValidTest1(List<Integer> marksList, Character expected) throws InfyAcademyException {
		GradeCalculator gradeCalculator = new GradeCalculator();
		Character actual = gradeCalculator.calculateGrade(marksList);
		Assertions.assertEquals(expected, actual);
	}
	
	public static Stream<Arguments> testListData() {
		return Stream.of(
				Arguments.of(Arrays.asList(94, 90, 85, 98, 99), 'A'),
				Arguments.of(Arrays.asList(94, 90, 85, 77, 79), 'B'),
				Arguments.of(Arrays.asList(70, 75, 86, 64, 72), 'C'),
				Arguments.of(Arrays.asList(60, 65, 76, 54, 62), 'D'),
				Arguments.of(Arrays.asList(23, 35, 38, 80, 15), 'F')
				); 
	}
	
	@Test
	public void calculateGradeInvalidTest1()  {
		GradeCalculator a2 = new GradeCalculator();
		List<Integer> marksList = new ArrayList<>();
		Exception exception = Assertions.assertThrows(Exception.class, () -> a2.calculateGrade(marksList));
		Assertions.assertEquals("MarksList is Empty, can't calculate grade.", exception.getMessage());
	}
	
}
