import java.util.LinkedList;

public class Exercise17 {
	public static void main(String[] args) {
		
		LinkedList<String> c1 = new LinkedList<>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		
		System.out.println("List of the first linked list: " + c1);
		
		
		LinkedList<String> c2 = new LinkedList<>();
		c2.add("Red");
		c2.add("Green");
		c2.add("Black");
		c2.add("Pink");
		
		System.out.println("List of the second linked list: " + c2);
		
		LinkedList<String> a = new LinkedList<>();
		
		a.addAll(c1);
		a.addAll(c2);
		
		System.out.println("New linked List: " + a);
		
		
	}
}
