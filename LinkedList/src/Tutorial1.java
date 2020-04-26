import java.util.Iterator;
import java.util.LinkedList;

public class Tutorial1 {
 public static void main(String[] args){
	 
	 LinkedList<String> list = new LinkedList<>();
	 list.add("Steve");
	 list.add("Carl");
	 list.add("Raj");
	 list.add("Negan");
	 list.add("Rick");

	 list.removeFirst();
	 
	 list.removeLast();
	 
	 
	 Iterator<String> iterator= list.iterator();
	 
	 while(iterator.hasNext()) {
		 System.out.println(iterator.next());
	 }
	 
	 
	 list.remove(1);
	 
	 System.out.println("\nAfter removing the nsecond element");
	 Iterator<String> iterator2 = list.iterator();
	 
	 while(iterator2.hasNext()) {
		 System.out.println(iterator2.next());
	 }
	 
	 
 }
}
