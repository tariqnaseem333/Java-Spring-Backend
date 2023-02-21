package encapsulation;

public class EmployeeTester {
	
	public static void main(String args[]) {
		
		Employee employee = new Employee();
		
		employee.setEmployeeId("C101");
		employee.setEmployeeName("Steve");
		employee.setSalary(654);
		employee.setJobLevel(4);
		employee.calculateSalary();
		
		System.out.println("Employee Details");
		System.out.println("Employee Id: " + employee.getEmployeeId() );
		System.out.println("Employee Name: " + employee.getEmployeeName() );
		System.out.println("Salary: " + employee.getSalary() );
	}
}
