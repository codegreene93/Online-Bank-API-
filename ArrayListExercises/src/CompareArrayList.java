import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CompareArrayList {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Red");
		list1.add("Orange");
		list1.add("White");
		list1.add("Yellow");
		list1.add("Green");
		
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Red");
		list2.add("Orange");
		list2.add("Yellow");
		list2.add("Green");
		
		ArrayList<String> list3 = new ArrayList<>();
		
		for(String color:list1) {
			list3.add(list2.contains(color)? "Yes":"No");
		}
	
		
		System.out.println("Comparison result: " + list3);
		
		
		System.out.println("Using a forEach loop");
		
		list1.forEach(color -> System.out.println(color));
		
		Iterator<String> iter = list3.listIterator(1);


		Collections.sort(list1);
		
		System.out.println("Sorted list 1: " + list1);
		
	}
}
