package exercises.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Exercise5 {
	public static void main(String[] args) {
		Queue<Integer> ipq = new PriorityQueue<>();
		
		ipq.add(9);
		ipq.add(8);
		ipq.add(3);
		ipq.add(5);
		ipq.add(7);
		
		//Remove all the elements in the queue
		ipq.clear();
	
		System.out.println("After removing all the elements in the priority queue: " + ipq);
		
		
	}
}
