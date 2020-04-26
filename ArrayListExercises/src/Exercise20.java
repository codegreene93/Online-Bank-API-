import java.util.ArrayList;

public class Exercise20 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
	
		//ensure Capacity to be set to 15
		colors.ensureCapacity(15);
	
	}
}
