package setCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentTester {

	public static void main(String[] args) {

		Student student1 = new Student("Ron", 1, 101);
		Student student2 = new Student("Angela", 9, 102);
		Student student3 = new Student("Hazel", 5, 103);
		Student student4 = new Student("David", 3, 104);
		Student student5 = new Student("Alan", 4, 105);
		Student student6 = new Student("Hazel", 5, 103);
		Student student7 = new Student("Ron", 1, 101);

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(student6);
		studentList.add(student7);

		Set<Student> studentSet = new TreeSet<Student>(studentList);


		System.out.println("List of students who applied for re-evaluation: ");
		for( Student student : studentSet ) {
			student.displayStudentDetails();
		}

		System.out.println("List of students who applied for re-evaluation in more than one subject: ");
//		1st Approach:-
		Set<Student> studentNewSet = new TreeSet<Student>();
		for( Student student : studentList ) {
			if(!studentNewSet.add(student)) {
				System.out.println("Name: " + student.getStudentName());
			}
		}
//		2nd Approach:-
//		for( int i = 0; i < studentList.size()-1; i++ ) {
//			for( int j = i+1; j < studentList.size(); j++ ) {
//				if( studentList.get(i).getStudentId().equals(studentList.get(j).getStudentId()) ) {
//					System.out.println("Name: " + studentList.get(i).getStudentName());
//					break;
//				}
//			}  
//		}

	}

}

