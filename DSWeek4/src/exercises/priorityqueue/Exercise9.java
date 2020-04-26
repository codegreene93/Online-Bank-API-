package exercises.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Exercise9 {
	public static void main(String[] args) {
		Queue<Integer> ipq = new PriorityQueue<>();
		
		ipq.add(8);
		ipq.add(7);
		ipq.add(6);
		ipq.add(4);
		ipq.add(5);
		
		
		System.out.println("Retrieving and removing the fist element " + ipq.poll());
		
		
		
	}
}
