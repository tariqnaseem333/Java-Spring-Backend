package inheritance;

public class EmployeeTester {

	public static void main(String[] args) {
		
		PermanentEmployee p1 = new PermanentEmployee( 101, "Anil", 10000, 1500, 3 );
		p1.calculateSalary();
		System.out.println("Permanent Employee Salary: " + p1.getSalary());
		
		ContractEmployee c1 = new ContractEmployee( 102, "Ankit", 500, 10 );
		c1.calculateSalary();
		System.out.println("Permanent Employee Salary: " + c1.getSalary());
		
	}

}
