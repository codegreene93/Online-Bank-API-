package priorityqueue.tutorial;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCustomComparatorExample {
	public static void main(String[] args) {
		Comparator<String> comp = new Comparator<>(){

			@Override
			public int compare(String o1, String o2) {
				if(o1.length()<o2.length()) {
					return -1;
				}else if(o1.length()>o2.length()) {
					return 1;
				}		
				return 0;
			}	
		};
		
		Queue<String> pq = new PriorityQueue<>(comp);
		pq.add("Wilmir");
		pq.add("Alex");
		pq.add("Ping");
		pq.add("Almira");
		pq.add("Rose");
		
		
		
		while(!pq.isEmpty())
			System.out.println("Removed Name : " + pq.remove());
		
		

	}
	
}
