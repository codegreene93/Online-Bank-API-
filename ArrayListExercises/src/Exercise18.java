import java.util.ArrayList;

public class Exercise18 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		
		
		//Check if array is empty
		if(colors.isEmpty()) {
			System.out.println("Array is empty.");
		}else {
			System.out.println("Array is not empty");
		}
		
		//Print original array
		System.out.println("Original Array: " + colors);
		
		
		
		//Empty the array
		colors.clear();
		
		//Check again if array is empty
		if(colors.isEmpty()) {
			System.out.println("\nArray is empty.");
		}else {
			System.out.println("\nArray is not empty");
		}
		
		
		//Print array after emptying it
		System.out.println("New Array: " + colors);
		
		
	}
}
