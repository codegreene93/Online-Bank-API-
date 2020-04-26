import java.util.Iterator;
import java.util.LinkedList;

public class Tutorial4 {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("apple");
		list.add("orange");
		list.add("mango");
		
		System.out.println("for loop");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Advanced For Loop");
		for(String str:list) {
			System.out.println(str);
		}
		
		System.out.println("Iterator");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
		System.out.println("Using while loop");
		int num = 0;
		while(num < list.size()) {
			System.out.println(list.get(num));
			num++;
		}
		
		
		
		
		
	}
}
