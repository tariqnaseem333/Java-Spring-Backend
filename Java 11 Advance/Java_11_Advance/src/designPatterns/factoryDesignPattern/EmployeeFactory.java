package designPatterns.factoryDesignPattern;

public class EmployeeFactory {
	
//	Creating a Factory class and method for creating Object based on Input
	public static Employee getEmployee(String employeeType) {
		
		if(employeeType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
			return new AndroidDeveloper();
		} else if(employeeType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
			return new WebDeveloper();
		} else {
			return null;
		}
		
	}

}
