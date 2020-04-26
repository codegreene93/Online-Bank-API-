package exercises.priorityqueue;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Exercise7 {
	public static void main(String[] args) {
		Queue<String> queue1 = new PriorityQueue<>();
		
		queue1.add("Tall");
		queue1.add("Fair");
		queue1.add("Handsome");
		
		
		Queue<String> queue2 = new PriorityQueue<>();
		
		queue2.add("Tall");
		queue2.add("Handsome");
		queue2.add("Dark");
		queue2.add("Rich");
		
		ArrayList<Boolean> array = new ArrayList<>();
		
		queue1.forEach(adjective ->{
			array.add(queue2.contains(adjective));
		});
		
		
		System.out.println(array);
		
		
		
	}
}
