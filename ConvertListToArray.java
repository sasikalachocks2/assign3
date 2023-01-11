package assignment3;

import java.util.ArrayList;
import java.util.List;

//Convert List into array

public class ConvertListToArray {

	public static void main(String[] args) {
		
		List<String> listNames=new ArrayList<>();
		listNames.add("Mukesh");
		listNames.add("Anusha");
		listNames.add("Sumit");
		listNames.add("Sachin");
		listNames.add("Uma");
		listNames.add("Swapnil");
		
		
		String[]arrNames= new String[listNames.size()];
		
		for (int i=0; i<listNames.size(); i++)
			arrNames[i]= listNames.get(i);
		
		for (String x:arrNames)
		{
			System.out.println(x);
		}
		
	}

}
