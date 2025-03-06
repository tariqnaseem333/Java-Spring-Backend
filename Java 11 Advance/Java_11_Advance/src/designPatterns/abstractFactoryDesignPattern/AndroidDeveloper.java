package designPatterns.abstractFactoryDesignPattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int getSalary() {
		System.out.println("Getting Android Developer Salary");
		return 50_000;
	}

	@Override
	public String getName() {
		System.out.println("I am Android Developer");
		return "ANDROID DEVELOPER";
	}

}
