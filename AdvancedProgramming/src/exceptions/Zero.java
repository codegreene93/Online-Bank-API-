package exceptions;

public class Zero {
	public static void main(String[] args) {
		int numerator = 10;
		int denominator = 0;
		
		System.out.println("Before the attempt to divide by zero.");
		
		try {
			System.out.println(numerator/denominator);	
		} catch (ArithmeticException e) {
			System.out.println(" Cannot divide by zero");
		}
		
		System.out.println("This text will not be printed");
	}
}
