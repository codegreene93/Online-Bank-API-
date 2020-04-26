import java.util.ArrayList;
import java.util.Collections;

public class Exercise10 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		
		//Print original array
		System.out.println("Original Array : " + colors);
		//Shuffle the elements using Collections
		Collections.shuffle(colors);
		//Array after shuffling
		System.out.println("Shuffled Array : " + colors);
		
		
		
		
	}
}
