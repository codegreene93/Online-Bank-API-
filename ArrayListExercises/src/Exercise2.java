import java.util.ArrayList;

public class Exercise2 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		
		//Iterate through each element in the array list		
		for(int i=0; i<colors.size(); i++) {
			System.out.println(colors.get(i));
		}
		
		
		
		
	}
}
