import java.util.Stack;

public class ParenthesesTutorial {
	public static void main(String[] args) {
		
		String validCombo = "{[({}[])]}";
		String invalidCombo = "{([]]}";

		System.out.println("Check validCombo : " + checkBraces(validCombo));
		System.out.println("Check invalidCombo : " + checkBraces(invalidCombo));

	
	}
	
	public static boolean checkBraces(String str) {
		
		Stack<Character> openingBraces = new Stack<>();
		
		for (int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			
			//the stack will only contains opening braces
			//push character to stack if it is an opening brace
			if(c=='{' || c=='(' || c=='[') 
			{
				openingBraces.push(c);
			}
			else if (c=='}' || c==')' || c==']')
			{
				if(openingBraces.empty()) {
					return false; 
				}
				
				char last = openingBraces.peek();
				
				if((last == '{' && c == '}')||(last == '[' && c == ']')||(last == '(' && c == ')')) 
				{
					openingBraces.pop(); //pop character if the closing bracket matches the opening brace
				}else {
					return false; //if not a match with top of the stack, then invalid
				}
				
			}
	
		}

		
		return openingBraces.isEmpty();
		
	
	}

}



