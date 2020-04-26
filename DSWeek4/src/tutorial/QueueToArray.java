package tutorial;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueToArray {
	public static void main(String[] args) {
		//Create a queue
		Queue<String> queue = new LinkedList<>();

		queue.add("Willy");
		queue.add("Myrna");
		queue.add("Wilmir");
		queue.add("Rhea");
		queue.add("Jhon");
	
		//Convert the queue into array and assign to family array
		String[] family = queue.toArray(new String[queue.size()]);
		
		
		//Print the array using the static toString method
		System.out.println(Arrays.toString(family));

		
	}
}
