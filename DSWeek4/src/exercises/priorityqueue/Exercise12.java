package exercises.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Exercise12 {
	public static void main(String[] args) {
	
		
		Comparator<String> comp = new Comparator<>() {

			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}
			
		};	
	
		Queue<String> rr = new PriorityQueue<>(comp);
		
		rr.add("Paloma");
		rr.add("Patrick");
		rr.add("Stephen");
		rr.add("Roberto");
		rr.add("Wilmir");
		
		
		while(!rr.isEmpty())
			System.out.println("RR Member: " + rr.remove());
		
		
		
			
		
	}
		
}