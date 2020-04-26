import java.util.ArrayList;
import java.util.Collections;

public class Exercise11 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		
		//Print original array
		System.out.println("Original Array : " + colors);
		//Reverse the order of  the elements using Collections
		Collections.reverse(colors);
		//Array after reversing
		System.out.println("Reversed Array : " + colors);
	
		
		
	}
}
