package tutorial;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueIterator {
	public static void main(String[] args) {
		Queue<String> qu = new LinkedList<>();
		
		qu.add("Willy");
		qu.add("Myrna");
		qu.add("Wilmir");
		qu.add("Rhea");
		qu.add("Jhon");
		
		
		System.out.println("Using iterator and while loop");
		Iterator it = qu.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("Using forEach loop");		
		qu.forEach(name -> {
			System.out.println(name);
		});
		
		System.out.println("Using enhanced for loop");		
		for(String name:qu)
			System.out.println(name);
		
		
		System.out.println("Using iterator and forEach remaining method");		
		it.forEachRemaining(name -> {
			System.out.println(name);
		});
		
		
		
		
	}
}
