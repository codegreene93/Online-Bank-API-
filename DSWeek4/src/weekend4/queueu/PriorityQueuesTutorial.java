package weekend4.queueu;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuesTutorial {
	public static void main(String[] args) {
		Queue<Integer> pQueue = new PriorityQueue<>();
		
		pQueue.add(10);
		pQueue.add(5);
		pQueue.add(15);
		pQueue.add(8);
		
		System.out.println("PriorityQueue : " + pQueue);
		
		
		while(!pQueue.isEmpty()) {
			System.out.println("Value: " + pQueue.remove());
		}
		
		
		//String
		
		Queue<String> namesQueue = new PriorityQueue<>();
		namesQueue.add("Mark");
		namesQueue.add("Joe");
		namesQueue.add("Peter");
		namesQueue.add("Colm");
		namesQueue.add("Anthony");

		System.out.println("Names priority queue : " + namesQueue);
		
		while(!namesQueue.isEmpty()) {
			System.out.println("Name Removed : " + namesQueue.remove());
		}
		
		
	
		//CUSTOM ORDERING
		Comparator<String> comp = new Comparator<>() {

			@Override
			public int compare(String string1, String string2) {
				// TODO Auto-generated method stub
				if(string1.length() < string2.length())
				{
					return 1;
				}
				else if (string1.length() > string2.length()){
					return -1;
				}
				return 0;
			}
			
		};
		
		
		Queue<String> namesQueue2 = new PriorityQueue<>(comp);
		namesQueue2.add("Mark");
		namesQueue2.add("Anthony");
		namesQueue2.add("Ken");
		namesQueue2.add("Colm");
		namesQueue2.add("Joe");


		System.out.println("#########################################");
		
		
		System.out.println("Priority Queue 2 " + namesQueue2);
		
		while(!namesQueue2.isEmpty()) {
			System.out.println("Name Removed: " + namesQueue2.remove());
		}
		
		
		
	}
}
