package designPatterns.factoryDesignPattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int getSalary() {
		System.out.println("Getting Android Developer Salary");
		return 50_000;
	}

}
