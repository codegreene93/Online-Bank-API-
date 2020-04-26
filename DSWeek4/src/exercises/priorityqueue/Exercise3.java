package exercises.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Exercise3 {
	public static void main(String[] args) {
		Queue<String> queue1 = new PriorityQueue<>();
		
		queue1.add("Adele");
		queue1.add("Rihanna");
		queue1.add("Beyonce");
		
		Queue<String> queue2 = new PriorityQueue<>();
		
		Collections.addAll(queue2, queue1.toArray(new String[queue1.size()]));
		
		
		while(!queue2.isEmpty())
			System.out.println(queue2.poll());
		
		
		
	}
}
