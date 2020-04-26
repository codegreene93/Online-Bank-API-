import java.util.ArrayList;

public class Exercise17 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		
		//Print original array
		System.out.println("Original Array: " + colors);

		
		//Empty the array
		colors.clear();
		
		//Print array after emptying it
		System.out.println("New Array: " + colors);
		
		
	}
}
