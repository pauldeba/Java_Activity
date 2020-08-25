package JavaActivityTwo;

import java.util.Arrays;

public class Activity1_2_Java {

	public static void main(String[] args) {
		int number[] = {10, 77, 10, 54, -11, 10};
			
		int add=0;
		for (int i =0; i<=number.length-1; i++) {
			System.out.println(number[i]);
			if (number[i]==10) {
				add=add+number[i];
				//System.out.println("Addition of" +i+"number is"+add);			
			}
			
		}
		
		System.out.println("Addition of numbers are: "+add);				
	}

}
