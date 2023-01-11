package assignment3;

import java.util.ArrayList;
import java.util.List;

/*Write a program which will display true if list contains Mobile else prints false
List  - Web Automation, API Automation, Mobile Automation.
Output – True */

public class ListContains {

	public static void main(String[] args) {
		
		List<String> automation=new ArrayList<>();
		
		automation.add("Web Automation");
		automation.add("API Automation");
		automation.add("Mobile Automation");
		
		boolean check=automation.contains("Mobile Automation");
		
		System.out.println(check);
		
	}

}
