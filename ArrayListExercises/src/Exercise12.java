import java.util.ArrayList;

public class Exercise12 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		
		//Print original array
		System.out.println("Original Array : " + colors);
		//Get a portion (2nd and 3rd item) through sublist
		System.out.println(colors.subList(1, 3));
	
	}
}

