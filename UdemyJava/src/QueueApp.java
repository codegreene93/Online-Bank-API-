import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueApp {
	public static void main(String[] args) {
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		System.out.println("head of the queue: " + q1.element());
		
		try {
			q1.add(40);
		}catch (IllegalStateException e) {
			System.out.println("Tried to add too many items in the queue.");
		}
		
		for(Integer val:q1) {
			System.out.println("Queue value: " + val);
		}
				
		System.out.println("Removed from queueu: " + q1.remove());
		System.out.println("Removed from queueu: " + q1.remove());
		System.out.println("Removed from queueu: " + q1.remove());
		
		try {
			System.out.println("Removed from queueu: " + q1.remove());
		}catch (NoSuchElementException e) {
			System.out.println("Tried to remove too much value");
		}
		
		
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

		
		q2.offer(10);
		q2.offer(20);
		
		if(q2.offer(30) ==false) {
			System.out.println("Offer failed to add an item");
		}
		
		for(Integer val:q2) {
			System.out.println("Queue2 values: " + val);
		}
		
		
		System.out.println("Queue 2 poll: " + q2.poll());;
		System.out.println("Queue 2 poll: " + q2.poll());;
		System.out.println("Queue 2 poll: " + q2.poll());;

	}
}
