import java.util.ArrayList;
import java.util.Collections;

public class Exercise14 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		
		//Print Original Array
		System.out.println("Original Array : " + colors);
		
		//Swap first and last item
		Collections.swap(colors, 0, (colors.size()-1));
		
		//Print Array after swap
		System.out.println("Array with Swapped Elements : " + colors);

		
	}
}
