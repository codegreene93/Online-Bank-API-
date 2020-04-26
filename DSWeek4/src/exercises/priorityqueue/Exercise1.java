package exercises.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Exercise1 {
	public static void main(String[] args) {
		Queue<String> colours = new PriorityQueue<>();
		
		colours.add("Red");
		colours.add("Orange");
		colours.add("Yellow");
		colours.add("Green");
		colours.add("Blue");
		colours.add("Violet");
		
		
		System.out.println("Priority Queue: " + colours);
		
		
		while(!colours.isEmpty())
			System.out.println("Removed colour: " + colours.remove());

	}
}
