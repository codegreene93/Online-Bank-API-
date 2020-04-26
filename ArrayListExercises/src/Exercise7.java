import java.util.ArrayList;

public class Exercise7 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		
		
		String color = "red";
		
		if(colors.contains(color)) {
			System.out.println(color + " is found");
		}else {
			System.out.println(color + " is not found");
		}
		
	}
}
