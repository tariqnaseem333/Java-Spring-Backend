package designPatterns.abstractFactoryDesignPattern;

public class EmployeeFactory {
	
//	Creating a Factory class and method for creating Object using another Factory 
	public static Employee getEmployee(AbstractEmployeeFactory abstractEmployeeFactory) {
		return abstractEmployeeFactory.createEmployee();
	}

}
