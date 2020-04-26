import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		
		
		System.out.println("Original array: " + colors);
		//Update item 3
		colors.set(2, "blue");
		System.out.println("New array after updating the 3rd color: " + colors);

		
	}
}
