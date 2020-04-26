package exercises.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Exercise6 {
	public static void main(String[] args) {
		Queue<Double> dpq = new PriorityQueue<>();
		
		dpq.add(1.0);
		dpq.add(4.0);
		dpq.add(3.0);
		dpq.add(2.0);
		
		
		System.out.println("The priority queue: " + dpq + " has a size of " + dpq.size());
		
	}
}
