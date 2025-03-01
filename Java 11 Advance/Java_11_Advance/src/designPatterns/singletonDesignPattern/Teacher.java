package designPatterns.singletonDesignPattern;

public class Teacher {
	
//	Eager Way of creating Singleton Object
	private static Teacher teacher = new Teacher();
	
	public static Teacher getTeacher() {
		return teacher;
	}

}
