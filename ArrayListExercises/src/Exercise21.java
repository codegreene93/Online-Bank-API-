import java.util.ArrayList;

public class Exercise21 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
	
		//Print Original Array
		System.out.println("Original array: " + colors);
		
		//Replace the second element
		colors.set(1,"blue");
		
		//Print New Array
		System.out.println("Array after updating 2nd element : " + colors);
		
	
	}
}
