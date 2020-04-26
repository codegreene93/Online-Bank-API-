import java.util.ArrayList;
import java.util.Collections;

public class Exercise9 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		
		ArrayList<String> colorsCopy = new ArrayList<>();
		colorsCopy.addAll(colors);
	
		System.out.println("Copy of Original Array Using Clone : " + colorsCopy);
		
	}
}
