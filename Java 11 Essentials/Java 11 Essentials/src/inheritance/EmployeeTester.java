package inheritance;

public class EmployeeTester {

	public static void main(String[] args) {
		
		PermanentEmployee permanentEmployee = new PermanentEmployee( 101, "Anil", 10_000, 1500, 3 );
		permanentEmployee.calculateSalary();
		System.out.println("Permanent Employee Salary: " + permanentEmployee.getSalary());
		
		ContractEmployee contractEmployee = new ContractEmployee( 102, "Ankit", 500, 10 );
		contractEmployee.calculateSalary();
		System.out.println("Contract Employee Salary: " + contractEmployee.getSalary());
		
	}

}
