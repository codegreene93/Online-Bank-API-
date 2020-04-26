import java.util.ArrayList;

public class Exercise16 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		
		//Print original array
		System.out.println("Original Array: " + colors);

		//Create a new array list
		ArrayList<String> clonedColors = new ArrayList<>();
		
		//clone colors to clonedColors
		clonedColors = (ArrayList<String>)colors.clone();
		
		System.out.println("Cloned Copy of Array: " + clonedColors);
		
	}
}
