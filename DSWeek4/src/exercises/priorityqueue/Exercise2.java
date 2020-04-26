package exercises.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Exercise2 {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		
		queue.add("Server Side Development");
		queue.add("Data Structures and Algorithm");
		queue.add("Web Services and API Development");
		
		Iterator iter = queue.iterator();

		iter.forEachRemaining(course -> {
			System.out.println("Course : " + course);
		});
		
		
	}
}
