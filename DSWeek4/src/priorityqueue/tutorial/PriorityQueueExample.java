package priorityqueue.tutorial;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		
		
		pq.add("Ashish");
		pq.add("Rahul");
		pq.add("Vivek");
		pq.add("Amit");
		
		System.out.println("Head of the queue : " + pq.peek());
		
		//Iterating over all the elements
		System.out.println("Printing all the elements");
		Iterator it = pq.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		//Removing the top priority element
		pq.poll();
		System.out.println("After removing the top priority element");
		Iterator it2 = pq.iterator();
		while(it2.hasNext())
			System.out.println(it2.next());
		
		//Removing Java using remove
		pq.remove("Java");
		System.out.println("After removign Java with remove function");
		Iterator it3 = pq.iterator();
		while(it3.hasNext())
			System.out.println(it3.next());
		
		//Check if an elemet is present using contains()
		boolean b = pq.contains("C");
		System.out.println("Priority queue contains C or not : " + b);
		
		//Getting objects from the queue using toArray()
		String[] names = pq.toArray(new String[pq.size()]);
		for(String name: names)
			System.out.println("Value : " + name);
		
		
		
		
		
	}
}
