package recursion;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("adaDadAdadadada is a palindrome? " + checkPalindrome("adaDadAdadadada"));
		System.out.println("MadamImAdam is a palindrome? " + checkPalindrome("MadamImAdam"));
		System.out.println("12321 is a palindrome? " + checkPalindrome("12321"));

	}
	
	
	public static boolean checkPalindrome(String text) {

		return text.equalsIgnoreCase(reverseText(text));
		
	}
	
	
	public static String reverseText(String text) {
		if(text.length()==0) {
			return text;
		}
		
		return reverseText(text.substring(1)) + text.charAt(0);
	
	}
	
	

	

	
	
}
