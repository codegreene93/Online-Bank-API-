import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		
		//HashSet does not remember any kind of order
		//Set<String> set1 = new HashSet<>();
		
		//LinkedHashSet remembers the order you added items in
		//Set<String> set1 = new LinkedHashSet<>();
		
		//TreesSet sorts in natural order
		Set<String> set1 = new TreeSet<>();

		if(set1.isEmpty())
			System.out.println("Set is empty at start");
		
		set1.add("dog");
		set1.add("mouse");
		set1.add("cat");
		set1.add("snake");
		set1.add("bear");

		
		set1.add("mouse");
		
		
		System.out.println(set1);
		
		
		for(String element: set1)
			System.out.println(element);
		
		if(set1.contains("aardvark"))
			System.out.println("Contains aardvark");
		
		
		if(set1.contains("cat"))
			System.out.println("Contains cat");
		
		
		
		
		
		
		
		
		///Intersection
		Set<String> set2 = new TreeSet<>();

		set2.add("dog");
		set2.add("ant");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");

		
		
		Set<String> intersection = new HashSet<String>(set1);
		
		System.out.println(intersection);
		
		intersection.retainAll(set2);
		
		System.out.println(intersection);
		
		
		
		
		
		///Difference
		
		Set<String> difference = new HashSet<String>(set1);

		difference.removeAll(set2);
		
		System.out.println(difference);

		
	}
}
