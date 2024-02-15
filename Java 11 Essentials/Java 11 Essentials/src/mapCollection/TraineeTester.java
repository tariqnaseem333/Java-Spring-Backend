package mapCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TraineeTester {

	public static void main(String[] args) {
		
		Trainee t1 = new Trainee(101, "Jack");
		Trainee t2 = new Trainee(102, "Mary");
		Trainee t3 = new Trainee(103, "Jane");

//		Creating a map with trainee object as keys and corresponding batch name as values
		HashMap<Trainee, String> traineeMap = new HashMap<Trainee, String>();
		traineeMap.put(t1, "Dec-LC1");
		traineeMap.put(t2, "Jan-LC2");
		traineeMap.put(t3, "Feb-LC3");
		
//		Print all the keys in the Map
		Set<Trainee> keySet = traineeMap.keySet();
		for( Trainee trainee : keySet ) {
			System.out.println(trainee);
		}
		
//		Print all the Trainee ids present in the keys
		for( Trainee trainee : keySet ) {
			System.out.println(trainee.getTraineeId());
		}
		
		
//		Print all the entries of the Map
		Set<Entry<Trainee, String>> entrySet = traineeMap.entrySet();
		for( Map.Entry<Trainee, String> entry : entrySet ) {
			System.out.println(entry);
		}
		
//		Add the entries in below String to the Map
		String traineeDetails = "105,Lily:Jan20-Lc2+106,Peter:Feb-Lc2+107,Jerry:Mar-LC1";
		System.out.println(traineeDetails);
		
		Trainee t4 = new Trainee(105, "Lily");
		Trainee t5 = new Trainee(106, "Peter");
		Trainee t6 = new Trainee(107, "Jerry");
		traineeMap.put(t4, "Jan20-Lc2");
		traineeMap.put(t5, "Feb-Lc2");
		traineeMap.put(t6, "Mar-LC1");
		
		System.out.println(traineeMap);
		

	}

}