package tutorial;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueExample {
	public static void main(String[] args) {
		Queue<String> queue = new ArrayBlockingQueue<>(2);
		
		
		System.out.println(queue.offer("one"));
		System.out.println(queue.peek());
		System.out.println(queue);
		queue.clear();
		System.out.println(queue.peek());
		
	}
}
