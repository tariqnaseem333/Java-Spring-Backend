package designPatterns.factoryDesignPattern;

public class WebDeveloper implements Employee {
	
	@Override
	public int getSalary() {
		System.out.println("Getting Web Developer Salary");
		return 30_000;
	}

}
