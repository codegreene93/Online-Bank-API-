import java.util.Iterator;
import java.util.LinkedList;

public class Exercise1 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Red");
		list.add("Orange");
		list.add("Yellow");
		list.add("Green");
		list.add("Blue");
		list.add("Violet");
		
		
		Iterator<String> iterator = list.listIterator(1);
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		list.add(3,"Indigo");
		System.out.println("\n");
		
		Iterator<String> it = list.descendingIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		list.addFirst("Start");
		list.addLast("Last");
		
		
		System.out.println(list);
		
		
		
	}
}
