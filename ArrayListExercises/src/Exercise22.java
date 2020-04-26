import java.util.ArrayList;
import java.util.Iterator;

public class Exercise22 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
	
		//Iteration Using for loop
		System.out.println("Using for loop:");
		for(int i = 0; i<colors.size(); i++) {
			System.out.println(colors.get(i));
		}
		
		
		//Iteration Using Advanced For Loop
		System.out.println("\nUsing advanced for loop:");
		for(String x: colors) {
			System.out.println(x);
		}
		
		
		//Iteration Using For Each Loop
		System.out.println("\nUsing forEach loop:");
		colors.forEach(color -> System.out.println(color));
		
		
		//Using Iterator
		System.out.println("\nUsing an Iterator:");
		Iterator it = colors.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	
	}
}
