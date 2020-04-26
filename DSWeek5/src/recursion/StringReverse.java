package recursion;

public class StringReverse {
	
	public static void main(String[] args) {
		System.out.println(reverseString("abc"));
	}
	
	
	
	
	public static String reverseString(String text) {
		
		if(text.length()==1) {
			return text;
		}
	
		
		return reverseString(text.substring(1)) + text.charAt(0);
		
		
	}
}
