import java.util.ArrayList;
import java.util.LinkedList;

public class Tutorial3 {
	public static void main(String[] args) {
		LinkedList<String> listobj = new LinkedList<>();
		ArrayList<String> arraylist = new ArrayList<>();
		
		arraylist.add("String1");
		arraylist.add("String2");
		listobj.addAll(arraylist);
		
		System.out.println("Array List: " + arraylist);
				
		System.out.println("Linked List: " + listobj.removeFirst());
		
		
	}
}
