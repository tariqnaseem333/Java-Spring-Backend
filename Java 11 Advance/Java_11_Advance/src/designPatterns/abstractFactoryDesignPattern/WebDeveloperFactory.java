package designPatterns.abstractFactoryDesignPattern;

public class WebDeveloperFactory extends AbstractEmployeeFactory {
	
	@Override
	public Employee createEmployee() {
		return new WebDeveloper();
	}

}
