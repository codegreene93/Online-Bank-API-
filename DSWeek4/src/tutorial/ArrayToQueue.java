package tutorial;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayToQueue {
	public static void main(String[] args) {
		
		String[] family = {"Willy","Myrna","Wilmir","Rhea","Jhon"};
		
		//Create a queue
		Queue<String> queue = new LinkedList<>();
		
		//Add all the elements of family array to the Queue queue
		Collections.addAll(queue, family);
		
		//Print the queue
		System.out.println(queue);
		
		
		
		
		
		
	}
}
