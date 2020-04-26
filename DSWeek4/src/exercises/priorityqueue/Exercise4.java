package exercises.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Exercise4 {
	public static void main(String[] args) {
		Queue<String> pq = new PriorityQueue<>();
		
		pq.add("Rihanna");
		pq.add("Adele");
		pq.add("Beyonce");
		
		while(!pq.isEmpty())
			System.out.println(pq.remove());
	}
}
