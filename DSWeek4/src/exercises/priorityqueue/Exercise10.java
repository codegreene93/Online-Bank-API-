package exercises.priorityqueue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Exercise10 {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		
		queue.add("Wilmir");
		queue.add("Rhea");
		queue.add("Jhon");
		
		
		Object[] siblings = queue.toArray();
		
		System.out.println(Arrays.toString(siblings));
		
		
	}
}
