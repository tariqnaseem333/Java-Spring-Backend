package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamProblem {

	public static void main(String[] args) {

//    	Return only those names which are stared with "J"
//    	and has exactly 4 letters in it.

		List<String> names=new ArrayList<String>();
		names.add("Jack");
		names.add("John");
		names.add("Jill");
		names.add("Jim");
		names.add("Garry");
		names.add("Frank");

//		First Approach
//		List<String> filteredList = names.stream().filter(name -> (name.startsWith("J") && name.length()==4)).collect(Collectors.toList());
//		Second Approach
		List<String> filteredList = names.stream().filter(name -> (name.startsWith("J") && name.length()==4)).toList();
		System.out.println(filteredList);

	}

}
