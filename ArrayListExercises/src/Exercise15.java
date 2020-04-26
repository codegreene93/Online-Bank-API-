import java.util.ArrayList;
import java.util.Collections;

public class Exercise15 {
	public static void main(String[] args) {
		ArrayList<String> colorsOne = new ArrayList<>();
		
		colorsOne.add("red");
		colorsOne.add("orange");
		colorsOne.add("yellow");
		colorsOne.add("green");
		
		//Print Array One
		System.out.println("Array One : " + colorsOne);

		ArrayList<String> colorsTwo = new ArrayList<>();
		
		colorsTwo.add("blue");
		colorsTwo.add("indigo");
		colorsTwo.add("violet");
		colorsTwo.add("pink");
		
		//Print Array Two
		System.out.println("Array Two : " + colorsTwo);
		
		ArrayList<String> combinedColors = new ArrayList<>();
		combinedColors.addAll(colorsOne);
		combinedColors.addAll(colorsTwo);
		
		System.out.println("Combined Arrays : " + combinedColors);
		

		
	}
}
