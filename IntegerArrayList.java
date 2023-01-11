package assignment3;
/*Write a program which can store List of Integer values and print all the values using for loop.

Write a program which can store List of Integer values and print all the values using for for loop.

Write a program which can store List of Integer values and print all the values using for iterator

 */

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Arrays;
import java.util.List;

public class IntegerArrayList {

	public static void main(String[] args) {
		
		//List<Integer> price=Arrays.asList(2000, 1700, 5000, 2580, 6500);
		
		List<Integer> price=new ArrayList<Integer>();
		
		price.add(2000);
		price.add(1700);
		price.add(5000);
		price.add(2580);
		price.add(6500);

		/* For Loop for iterating ArrayList */
		System.out.println("For Loop");
		for(int i=0; i < price.size(); i++ )
		{
			System.out.println(price.get(i));
		}
					
		System.out.println("Advanced for Loop or for each loop ");
		for (Integer num : price)
		{
			System.out.println(num);
		}
				
		System.out.println("Using Iterator");
		Iterator<Integer>itr=price.iterator();
		
		while (itr.hasNext())
		{
			Integer num1=itr.next();
			System.out.println(num1);
		}
				
		System.out.println("While Loop");
		int count = 0;
		while (price.size() > count) 
		{
			System.out.println(price.get(count));
			count++;
		}
		
	}

}
