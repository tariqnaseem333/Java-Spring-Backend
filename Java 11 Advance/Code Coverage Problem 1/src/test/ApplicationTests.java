package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.infy.exception.InfyAcademyException;

import application.GradeCalculator;

public class ApplicationTests {
	@Test
	public void calculateGradeValidTest1() throws InfyAcademyException {
		GradeCalculator a1 = new GradeCalculator();
		List<Integer> marksList = new ArrayList<>();
		marksList.add(23);
		marksList.add(35);
		marksList.add(38);
		marksList.add(80);
		marksList.add(15);
		Character actual = a1.calculateGrade(marksList);
		Assertions.assertEquals(Character.valueOf('F'), actual);
	}
	
	@Test
	public void calculateGradeInvalidTest1()  {
		GradeCalculator a2 = new GradeCalculator();
		List<Integer> marksList = new ArrayList<>();
		Exception exception = Assertions.assertThrows(Exception.class, () -> a2.calculateGrade(marksList));
		Assertions.assertEquals("MarksList is Empty, can't calculate grade.", exception.getMessage());
	}
	
}
