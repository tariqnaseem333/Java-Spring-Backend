package designPatterns.singletonDesignPattern.breakable;

public class Tester {

	public static void main(String[] args) throws Exception {

//		3rd Way: Cloning of Object
		Student student1 = Student.getStudent();
		System.out.println("Student1: " + student1.hashCode());
		System.out.println("After cloning of Object");
		
		Student student2 = (Student)student1.clone();
		System.out.println("Student1: " + student2.hashCode());
		
////		2nd Way : Using Serialization and Deserialization
//		Student student1 = Student.getStudent();
//		System.out.println("Student1: " + student1.hashCode());
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student"));
//		oos.writeObject(student1);
//		System.out.println("Serialization Done....");
//		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student"));
//		Student student2 = (Student)ois.readObject();
//		System.out.println("Student2: " + student2.hashCode());
		
////		Ways of Breaking Singleton Design Pattern
////		Ist Way : Using Reflection API
//		Student student1 = Student.getStudent();
//		System.out.println("Student1: " + student1.hashCode());
//		
//		Constructor<Student> constructor = Student.class.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		Student student2 = constructor.newInstance();
//		System.out.println("Student2: " + student2.hashCode());

	}

}
