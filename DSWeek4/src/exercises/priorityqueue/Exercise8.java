package exercises.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Exercise8 {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		
		queue.add("Ping");
		queue.add("Alex");
		queue.add("Dave");
		
		
		System.out.println("Retrieving the first element: " + queue.peek());
		
		
	}
}
