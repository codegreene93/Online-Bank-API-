import java.util.ArrayList;

public class Exercise6 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		
		
		System.out.println("Original ArrayList : " + colors);
		//Remove 3rd item
		colors.remove(2);
		System.out.println("Arraylist after removing 3rd item : " + colors);
		
	}
}
