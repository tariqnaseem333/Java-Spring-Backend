package designPatterns.abstractFactoryDesignPattern;

public class AndroidDeveloperFactory extends AbstractEmployeeFactory {

	@Override
	public Employee createEmployee() {
		return new AndroidDeveloper();
	}

}
