import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListToStack {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("Non-Empty stack addAll operation: " + stack.addAll(list));
		System.out.println("Non-Empty stack: " + stack);
		
	}
}
