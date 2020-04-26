package weekend4.queueu;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueuesTutorial {
	public static void main(String[] args) {
		
		//UNBOUNDED QUEUE
		Queue<String> queue = new LinkedList<>();
		
		
		//Add some values
		queue.add("Programming for Big Data");
		queue.add("Data Visualization");
		queue.add("Data Mining");
		queue.add("Machine Learning");
		queue.add("Advanced Data Analytics");
		
		System.out.println(queue);
		
		//Operations
		queue.remove(); //removed the head
		System.out.println(queue);
		
		//Remove a specific element
		queue.remove("Data Mining");
		System.out.println(queue);

		//Get length of the queue
		System.out.println("Length: " + queue.size());

		
		//Read the head but do not dequeue it
		System.out.println("Head: " + queue.element());
		System.out.println(queue);
		
		
		
		//BOUNDED QUEUE
		Queue<Integer> intQueue = new ArrayBlockingQueue<>(3);
		/*intQueue.add(1);
		intQueue.add(2);
		intQueue.add(3);
		intQueue.add(4);*/
		
		System.out.println(intQueue.offer(1));
		System.out.println(intQueue.offer(2));
		System.out.println(intQueue.offer(3));
		System.out.println(intQueue.offer(4));

	
		
		//Iterating over a Queue
		//1. Using an enhanced for loop
		for (Integer i: intQueue)
			System.out.println("Item Value : "+ i);
		
		
		//2.Using an Iterator
		Iterator iter = intQueue.iterator();
		while(iter.hasNext())
			System.out.println("Item Value : " + iter.next());
		
		//3.Using forEach
		intQueue.forEach(element -> System.out.println(element));
		
		
		//Check if Queue is Empty
		System.out.println("Empty: " + queue.isEmpty());
	}
	
}
