package designPatterns.singletonDesignPattern.breakable;

import java.io.Serializable;

public class Student implements Serializable, Cloneable {
	
	private static Student student;
	
	private Student() {
////		To Overcome Reflection API
//		if(student != null) {
//			throw new RuntimeException("Do not break Singleton Pattern");
//		}
	}
	
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
	
////	To Overcome Serialization and Deserialization
//	public Object readResolve() {
//		return student;
//	}
	
//	To Overcome cloning of object
	@Override
	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
		return student;
	}

}
