package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3A_Java {

	public static void main(String[] args) {
		Queue<Integer> number = new LinkedList<>();
		//add element
		for(int i=1; i<6; i++) {
			number.add(i);
		}
		// print the element of the queue
		System.out.println(number);
		//to remove the head of the queue
		int removeEle = number.remove();
		System.out.println("Removed element:"+removeEle);
		//to view the head of queue
		int headEle = number.peek();
		System.out.println("head of queue:"+headEle);
		int size = number.size();
		System.out.println("size of element:"+size);

	}

}
