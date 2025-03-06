package designPatterns.abstractFactoryDesignPattern;

public class ManagerFactory extends AbstractEmployeeFactory {
	
	@Override
	public Employee createEmployee() {
		return new Manager();
	}

}
