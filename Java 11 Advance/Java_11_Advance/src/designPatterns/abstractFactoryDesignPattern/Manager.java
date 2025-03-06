package designPatterns.abstractFactoryDesignPattern;

public class Manager implements Employee {

	@Override
	public int getSalary() {
		System.out.println("Getting Manager Salary");
		return 1_00_000;
	}

	@Override
	public String getName() {
		System.out.println("I am Manager");
		return "MANAGER";
	}

}
