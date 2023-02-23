package arrays;

public class AverageSalary {
	
	public static double[] findDetails( double[] salary ) {
		int n= salary.length;
		
//		Calculating Average Salary
		double averageSalary = 0;
		for( int i = 0; i < n; i++ ) {
			averageSalary = averageSalary + salary[i];
		}
		averageSalary = averageSalary / n;
		
//		Calculating count of greater and lesser Salary
		double greaterSalary = 0;
		double lesserSalary = 0;
		for( int i = 0; i < n; i++ ) {
			if( salary[i] > averageSalary ) {
				greaterSalary = greaterSalary + 1.0;
			}
			else if( salary[i] < averageSalary ) {
				lesserSalary = lesserSalary + 1.0;
			}
		}
		
//		Creating array for holding averageSalary, greaterSalary and
//		lesserSalary
		double[] details = new double[3];
		details[0] = averageSalary;
		details[1] = greaterSalary;
		details[2] = lesserSalary;
		
		return details;
		
	}
	
	public static void main(String[] args) {
		
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);

	}

}
