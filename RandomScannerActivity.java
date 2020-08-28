package Utility;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {

	public static void main(String[] args) {
		//create scanner object
		Scanner scan = new Scanner(System.in);
		
		//ArrayList object
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// Random class object
		Random indexGen = new Random();
		
		System.out.println("Please enter Integer Number Please");
		System.out.println("(EOF or non-integer to terminate): ");
		while(scan.hasNextInt()) {
			list.add(scan.nextInt());
		}
		
		Integer nums[] = list.toArray(new Integer[1]);
		int index = indexGen.nextInt(nums.length);
		System.out.println("Index value generated: "+index);
		System.out.println("Value in array at generated index: "+nums[index]);
		
		scan.close();
		

	}

}
