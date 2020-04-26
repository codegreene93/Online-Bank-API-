import java.util.Stack;

public class BracketsApp {
	public static void main(String[] args) {
		String valid = "{[]()}";
		String invalid1 = "{[()]";
		String invalid2 = "{{{{[[({{{{]";
		
		
		System.out.println(checkBraces(valid));
		System.out.println(checkBraces(invalid1));
		System.out.println(checkBraces(invalid2));

		
	}
	
	public static boolean checkBraces(String str) {
	
		Stack<Character> openings = new Stack<>();
		
		for(int i = 0; i<str.length(); i++) {
			char bracket = str.charAt(i);
			
			if(bracket == '{' || bracket == '[' || bracket == '(') {
				openings.push(bracket);
			}
			
			else if(bracket == '}' || bracket == ']' || bracket == ')') {
				
				char latestOpening;
				
				if(openings.empty()) {
					return false;
				}else {
					latestOpening = openings.peek();
				}
				
				if((bracket == '}' && latestOpening == '{') || (bracket == ']' && latestOpening == '[') || (bracket == ')'&& latestOpening == '(')) {
					openings.pop();
				}else {
					return false;
				}
				
			}
		}	
		
		return openings.empty();

		
	}
	
}
