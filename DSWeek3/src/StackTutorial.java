import java.util.ArrayList;
import java.util.Stack;

public class StackTutorial {
	public static void main(String[] args) {
		Stack<String> namesStack = new Stack<>();
		namesStack.push("Ken");
		namesStack.push("Mark");
		namesStack.push("Ken");
		namesStack.push("Paul");
		namesStack.push("Tony");
		
		System.out.println(namesStack);

		namesStack.pop();
		
		System.out.println("Stack after the first pop: " + namesStack);
		
		namesStack.pop();
		
		System.out.println("Stack after the second pop: " + namesStack);
		
		namesStack.removeElement("Ken");
		
		System.out.println("Stack after removing Ken: " + namesStack);
	
		namesStack.remove(1);
	
		System.out.println("Stack after removing the element at the specified index: " + namesStack);
		
		
		Stack<Integer> numsStack = new Stack<>();
		numsStack.push(1);
		numsStack.push(2);
		numsStack.push(3);
		numsStack.push(4);
		numsStack.push(5);
		numsStack.push(6);
		numsStack.push(7);
		numsStack.push(8);
		numsStack.push(9);
		numsStack.push(10);
		
		numsStack.removeIf(element -> element<6);
		
		System.out.println("numsStack after removal" + numsStack);
		
		
		
		ArrayList<Integer> numsArrayList = new ArrayList<>() {
			{
				add(6);
				add(7);
				add(8);
			}
		};
		
		System.out.println(numsArrayList);
		
		numsStack.removeAll(numsArrayList);
		
		System.out.println("After removeAll : " + numsStack);
		
		
		//Peek to read the value at the top of the Stack
		
		System.out.println("After calling Peek : " + numsStack.peek());
	
		System.out.println("Stack after Peek: " + numsStack);
		
		
		System.out.println("Search for the value 10: " + numsStack.search(10));
		System.out.println("Search for the value 9: " + numsStack.search(9));
		System.out.println("Search for the value 8: " + numsStack.search(8));
		
		//GET
		System.out.println("Value at index 0: " + numsStack.get(0));
		System.out.println("Value at index 1: " + numsStack.get(1));
		//System.out.println("Value at index 2: " + numsStack.get(2));
		//The line immediately above returns an Index Out of Bounds Exception
		
		
		Stack<Integer> intStack = new Stack<>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		
		ArrayList<Integer> intArrayList = new ArrayList<>() {
			{
				add(4);
				add(5);
				add(6);
			}
		};
		
		System.out.println("Before the addAll method: " + intStack);
		
		intStack.addAll(intArrayList);
		
		System.out.println("After the addAll method: " + intStack);
	
		
		System.out.println("Size: " + intStack.size());
	
		
		intStack.forEach(element -> System.out.println(element));
		
		
	}
}
