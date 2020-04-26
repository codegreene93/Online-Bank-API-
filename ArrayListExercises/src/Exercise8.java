import java.util.ArrayList;
import java.util.Collections;

public class Exercise8 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		
		System.out.println("Original Array : " + colors);
		
		
		Collections.sort(colors);
		
		System.out.println("Sorted Array " + colors);
		
	}
}
