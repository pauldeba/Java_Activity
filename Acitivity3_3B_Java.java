package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Acitivity3_3B_Java {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<>();
		//add element to the deque
		dq.add("Cat");
		dq.addFirst("Tiger");
		dq.addLast("Lion");
		// alternate way of adding element to the queues
		dq.offer("Dod");
		dq.offerFirst("Wolf");
		dq.offerLast("Hyena");
		
		//Iterator
		Iterator<String> animal = dq.iterator();
		while(animal.hasNext()) {
			System.out.println(animal.next());
		}
		//peek the head of element
		System.out.println("head element:"+dq.peekFirst());
		System.out.println("tail element:"+dq.peekLast());
		// show that the element that didnot deleted
		System.out.println("After peek:"+dq);
		// check if Wolf present or not
		System.out.println("Wolf is present:"+dq.contains("Wolf"));
		//
		System.out.println("remove first element:"+dq.removeFirst());
		System.out.println("remove last element:"+dq.removeLast());
		System.out.println("After removing first and last elemes:"+dq);
		System.out.println("size of element is:"+dq.size());
		
		
	}

}
