package assignment3;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

/* Create a list of numbers 33,44,55,66,77,88 and perform below operation
	Remove second element from list using index
	Remove second element from list using value
	Add 90 at index 3
	Get the length of list
	Print all values from list using any values
	 */

public class OperationsInList {

	public static void main(String[] args) {
		
		
		//List<Integer> numbers=Arrays.asList(33,44,55,66,77,88);
		
		List<Integer> numbers=new ArrayList<>();
		numbers.add(33);
		numbers.add(44);
		numbers.add(55);
		numbers.add(66);
		numbers.add(77);
		numbers.add(88);
				
		System.out.println(numbers);
		numbers.remove(1);
		//numbers.remove(44);
		numbers.add(3, 90);
		numbers.size();
		System.out.println(numbers);
			

	}

}
