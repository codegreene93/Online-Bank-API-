import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackToList {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		List<Integer> list = new ArrayList<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		list.addAll(stack);
		
		System.out.println("Non-Empty Stack : " + stack);
		System.out.println("Non-Empty List : " + list);
		
		
	}
}
