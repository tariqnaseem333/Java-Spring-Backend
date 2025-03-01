package designPatterns.singletonDesignPattern;

public class Student {
	
	private static Student student;
	
	private Student() {
		
	}
	
//	Lazy Way of Creating Singleton Object -- ThreadSafe
	public static Student getStudent() {
		if(student == null) {
			synchronized(Student.class) {
				if(student == null) {
					student  = new Student();
				}
			}
		}
		return student;
	}
	
////	Lazy Way of Creating Singleton Object
//	public static Student getStudent() {
//		if(student == null) {
//			student  = new Student();
//		}
//		return student;
//	}

}
