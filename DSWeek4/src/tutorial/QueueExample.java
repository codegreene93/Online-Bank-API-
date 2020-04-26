package tutorial;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<String> qu = new LinkedList<>();
		
		qu.add("Myrna");
		qu.add("Roy");
		qu.add("Stal");
		qu.add("Arnab");
		qu.add("Micheal");
		
		System.out.println("Queue: " + qu);
		
		String name = qu.remove();
		
		System.out.println("Removed Name : " + name);
		System.out.println("New Queue : " + qu);
		
		name = qu.poll();
		
		System.out.println("Removed Name : " + name);
		System.out.println("New Queue : " + qu);
		
		
	}
}
