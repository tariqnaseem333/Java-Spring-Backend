package application;

import java.util.List;

import com.infy.exception.InfyAcademyException;

public class GradeCalculator {

	public Character calculateGrade(List<Integer> marksList) throws InfyAcademyException {

		if(marksList.isEmpty())		
			throw new InfyAcademyException("MarksList is Empty, can't calculate grade.");

		Integer sum=0;
		Integer average=0;
		Character grade;

		for(Integer marks:marksList) {
			sum+=marks;
		}
		
		average=sum/marksList.size();
		
		if(average>=90) {
			grade='A';
		}
		else if(average>=80) {
			grade='B';
		}
		else if(average>=70) {
			grade='C';
		}
		else if(average>=60) {
			grade='D';
		}
		else if(average>=50) {
			grade='E';
		}
		else {
			grade='F';
		}
		
		return grade;
		
	}
}
