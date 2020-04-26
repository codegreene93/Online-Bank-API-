import java.util.LinkedList;

public class Tutorial2 {
	public static void main(String[] args) {
		
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Item1");
		list.add("Item5");
		list.add("Item3");
		list.add("Item6");
		list.add("Item2");
		
		
		System.out.println("Linked List Content: " + list);
		
		
		
		list.addFirst("First Item");
		list.addLast("Last Item");
		System.out.println("LinkedList Content after addition: "+ list);
		
		
		Object firstVar = list.get(0);
		System.out.println("First element: " + firstVar);
		
		
		list.set(0, "Changed first item");
		Object firstVar2 = list.get(0);
		System.out.println("First element after update by set method: " + firstVar2);
		
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println("Linked List after removal of first and last element: " + list);
		
		list.add(0, "Newly added item");
		list.remove(2);
		System.out.println("Final Content: " + list);
		
		
		
	}
}
