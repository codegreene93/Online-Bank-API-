import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class StackReview {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(10);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);

		
		Collections.sort(stack);
		
		System.out.println("Original: " + stack);
		
		System.out.println("Popping " + stack.pop());
		
		System.out.println("Removing " + stack.removeElement(10));
		
		System.out.println("After popping and removal of 10: " + stack);

		stack.removeIf(val -> val>70);
		
		System.out.println("After remove criteria <70: " + stack);
	
		ArrayList<Integer> array = new ArrayList<>() {
			{
				add(90);
				add(30);
				add(120);
			}
		};
	
		System.out.println("Applying removeAll " + stack.removeAll(array));
		
		System.out.println("After removeAll: " + stack);
		
		System.out.println("Get value at index 2 " + stack.get(2));
	
		System.out.println("Find 60 " + stack.search(10000));
		
	}
}
