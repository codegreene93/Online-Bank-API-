import java.util.Collections;
import java.util.LinkedList;

public class Exercise9 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Red");
		list.add("Orange");
		list.add("Yellow");
		
		System.out.println("Original linked list: " + list);
		
		
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("White");
		list2.add("Pink");
		
		list.addAll(1,list2);
		
		System.out.println("Original linked list after the add all: " + list);
	
		System.out.println("First element: " + list.getFirst());
		System.out.println("Last element: " + list.getLast());
	
		
		
		list.remove(1);
		list.removeFirst();
		list.removeLast();
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println("Element at index " + i + " : "+ list.get(i));
		}
		

		Collections.swap(list, 0, 1);
		
		System.out.println("New list" + list);
		
		list.add("Maroon");
		
		Collections.shuffle(list);
		
		System.out.println("Shuffled list" + list);

		
	}
}
