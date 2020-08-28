package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class Activity3_2_Java {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		hs.add("M");
		hs.add("L");
		hs.add("X");
		hs.add("M");
		hs.add("A");
		hs.add("B");
		//Print HashSet
		System.out.println("Original HashSet:"+hs);
		//print size() of the HashSet
		System.out.println("Size of the elements is:"+hs.size());
		//remove element
		System.out.println("Removing 'B' from element"+hs.remove("B"));
		//remove element that is not present
		if(hs.remove("K")) {
			System.out.println("K removed from the set");
		} else {
			System.out.println("K is not present in the Set");
		}
		System.out.println("Check if M present:"+hs.contains("M"));
				
		System.out.println("Updated HashSet:"+hs);

	}

}
