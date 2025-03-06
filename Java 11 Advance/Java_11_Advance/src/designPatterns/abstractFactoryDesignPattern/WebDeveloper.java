package designPatterns.abstractFactoryDesignPattern;

public class WebDeveloper implements Employee {
	
	@Override
	public int getSalary() {
		System.out.println("Getting Web Developer Salary");
		return 30_000;
	}

	@Override
	public String getName() {
		System.out.println("I am Web Developer");
		return "WEB DEVELOPER";
	}

}
