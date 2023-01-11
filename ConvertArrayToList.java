package assignment3;
//Write a program which will pick the values from Array and Store them List.

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

	public static void main(String[] args) {
		
		String[]names= {"Mukesh","Anusha","Sumit","Sachin","Uma","Bhairu","Swapnil"};
		
		List<String> list=Arrays.asList(names);
		
		System.out.println(list);

	}

}
