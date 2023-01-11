package assignment3;
//Write a program which will print sum of all numbers which is stored in list.

import java.util.ArrayList;
import java.util.List;

public class SumOfList {

	public static void main(String[] args) {
		
		List<Integer> numbers=new ArrayList<>();
		
		numbers.add(25);
		numbers.add(45);
		numbers.add(35);
		numbers.add(95);
		
		System.out.println(numbers);
		
		int sum=0;
		
		for (int i=0; i<numbers.size(); i++)
			sum=sum+numbers.get(i);
		{
			System.out.println("Total = "+ sum );
		}
	}
}
