import java.util.ArrayList;

public class Exercise13 {
	public static void main(String[] args) {
		ArrayList<String> colorsOne = new ArrayList<>();
		
		colorsOne.add("red");
		colorsOne.add("orange");
		colorsOne.add("yellow");
		colorsOne.add("green");
		
		//Print Array One
		System.out.println("Array One : " + colorsOne);

		ArrayList<String> colorsTwo = new ArrayList<>();
		
		colorsTwo.add("red");
		colorsTwo.add("orange");
		colorsTwo.add("yellow");
		colorsTwo.add("blue");
		
		//Print Array Two
		System.out.println("Array Two : " + colorsTwo);
		
		
		
		
		//Compare 2 arraylists using equals
		System.out.println("Using equals operations, the equality is: " + colorsOne.equals(colorsTwo));

		
		
		boolean equality = true;
		//Using nested for loops
		if(colorsOne.size() == colorsTwo.size()) {
			for(int i = 0; i<colorsOne.size(); i++) {
				if(!colorsTwo.contains(colorsOne.get(i))) {
					equality = false;
					break;
				}
			}
		}else {
			equality = false;
		}
		
		System.out.println("Using for loop, the equality is: "+equality);

		
		
	
	}
}
