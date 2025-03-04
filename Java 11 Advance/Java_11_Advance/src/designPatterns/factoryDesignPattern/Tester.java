package designPatterns.factoryDesignPattern;

public class Tester {

	public static void main(String[] args) {
		
		Employee androidEmployee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
		int androidEmployeeSalary = androidEmployee.getSalary();
		System.out.println("Salary: " + androidEmployeeSalary);
		
		Employee webEmployee = EmployeeFactory.getEmployee("WEB DEVELOPER");
		int webEmployeeSalary = webEmployee.getSalary();
		System.out.println("Salary: " + webEmployeeSalary);
		
	}

}
