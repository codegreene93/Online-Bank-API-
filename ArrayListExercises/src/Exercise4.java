import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input number from 1 to 4");
		int position = in.nextInt();
		
		//Retrieve the item at first position in the arraylist
		System.out.println("1st color : " + colors.get(position -1 ));
		
	}
}
