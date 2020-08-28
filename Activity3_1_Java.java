package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Activity3_1_Java {

	public static void main(String[] args) {
		//create an ArrayList<>
		List<String> myList = new ArrayList<>();
		//Add 5 name to the list object at default index
		myList.add("Jhon");
		myList.add("Mary");
		myList.add("Tom");
		//Adding object at specific index
		myList.add(3, "Alice");
		myList.add(1, "Peter");
		
		System.out.println("Printing all the object");
		for(String s:myList) {
			System.out.println(s);
		}
		/*-- for loop to print
		//printing all the name using for loop
		for(int i=0; i<=(myList.size()-1);i++) {
			String name = myList.get(i);
			System.out.println("Names are:"+name);
		}
		**/
		System.out.println("3rd Name:"+myList.get(2));
		
		if(myList.contains("Jhon")) {
			System.out.println("Jhon is present in the list");
		}
		
		System.out.println("Size of ArrayList:"+myList.size());
		myList.remove("Jhon");
		System.out.println("Size of ArrayList after remove:"+myList.size());

	}

}
