package lambdaExpression;

import java.util.ArrayList;

public class EmployeeTester {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1069001, "John", 100000, 1.0, "Manager", "M");
		Employee e2 = new Employee(1069002, "Mike", 50000, 1.7, "Systems Engineer", "M");
		Employee e3 = new Employee(1069003, "Harvey", 75000, 6.9, "Manager", "M");
		Employee e4 = new Employee(1069004, "Jessica", 25000, 3.1, "Trainee", "F");
		Employee e5 = new Employee(1069005, "Rachel", 53000, 2.0, "Support", "F");

		ArrayList<Employee> employeeArr = new ArrayList<>();
		employeeArr.add(e1);
		employeeArr.add(e2);
		employeeArr.add(e3);
		employeeArr.add(e4);
		employeeArr.add(e5);
        
//      Displaying the name of all the employees and their gender using lambda expressions.
		employeeArr.forEach(e -> System.out.println(e.getName() + " " + e.getGender()));
        
	}

}
