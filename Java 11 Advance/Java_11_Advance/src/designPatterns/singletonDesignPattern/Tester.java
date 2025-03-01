package designPatterns.singletonDesignPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tester {

	public static void main(String[] args) {
		
//		Singleton Object - Eager Way of Creating Object
		Teacher teacher1 = Teacher.getTeacher();
		Teacher teacher2 = Teacher.getTeacher();
		System.out.println("Teacher1: " + teacher1.hashCode());
		System.out.println("Teacher2: " + teacher2.hashCode());
		System.out.println("-------------------");
		
//		Singleton Object - Lazy Way of Creating Object(Thread Safe)
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(() -> System.out.println("Student1: " + Student.getStudent().hashCode()));
		service.execute(() -> System.out.println("Student1: " + Student.getStudent().hashCode()));
		System.out.println("-------------------");
		
////		Singleton Object - Lazy Way of Creating Object
//		Student student1 = Student.getStudent();
//		Student student2 = Student.getStudent();
//		System.out.println("Student1: " + student1.hashCode());
//		System.out.println("Student2: " + student2.hashCode());

	}

}
