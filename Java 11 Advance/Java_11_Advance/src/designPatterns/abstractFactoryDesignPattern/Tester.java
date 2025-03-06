package designPatterns.abstractFactoryDesignPattern;

public class Tester {

	public static void main(String[] args) {
		
		Employee androidEmployee = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
		int androidEmployeeSalary = androidEmployee.getSalary();
		System.out.println("Salary: " + androidEmployeeSalary);
		String androidEmployeeName = androidEmployee.getName();
		System.out.println("Name: " + androidEmployeeName);
		System.out.println("--------------------------------");
		
		Employee webEmployee = EmployeeFactory.getEmployee(new WebDeveloperFactory());
		int webEmployeeSalary = webEmployee.getSalary();
		System.out.println("Salary: " + webEmployeeSalary);
		String webEmployeeName = webEmployee.getName();
		System.out.println("Name: " + webEmployeeName);
		System.out.println("--------------------------------");
		
		Employee managerEmployee = EmployeeFactory.getEmployee(new ManagerFactory());
		int managerEmployeeSalary = managerEmployee.getSalary();
		System.out.println("Salary: " + managerEmployeeSalary);
		String managerEmployeeName = managerEmployee.getName();
		System.out.println("Name: " + managerEmployeeName);
		System.out.println("--------------------------------");
		
	}

}

