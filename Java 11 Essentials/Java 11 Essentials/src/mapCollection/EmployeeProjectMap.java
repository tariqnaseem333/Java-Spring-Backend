package mapCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeProjectMap {

	public static void main(String[] args) {
		
//		Each Employee can work on 1 or more Projects
		ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("Ajay","Sachin","Kamal","Swati","Ajay","Rahul","Amit")) ;
		Map<String,Integer> employeeDetails = new HashMap<String,Integer>();
		
//		Adding details in Employee-Project Map
		employeeDetails.put(employeeList.get(0), 2);
		employeeDetails.put(employeeList.get(1), 1);
		employeeDetails.put(employeeList.get(2), 4);
		employeeDetails.put(employeeList.get(3), 1);
		employeeDetails.put(employeeList.get(4), 3);
		employeeDetails.put(employeeList.get(5), 1);
		employeeDetails.put(employeeList.get(6), 2);
		
//		Displaying Details of Employee-Project Map
		Set<Entry<String, Integer>> entrySet = employeeDetails.entrySet();
		String name = "";
		int projectCount = 0;
		for( Map.Entry<String, Integer> entry : entrySet ) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
			if( entry.getValue() > projectCount ) {
				projectCount = entry.getValue();
				name = entry.getKey();
			}
		}
		
//		Displaying Name of Employee with maximum Projects
		System.out.println("Employee with maximum number of projects: " + name);

	}

}
