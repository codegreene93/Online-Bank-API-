package exceptions;

import java.util.Scanner;

public class SquareRoot {
	public static double getSquareRoot(int num) throws ArithmeticException{
		if(num < 0) {
			throw new ArithmeticException();
		}else {
			return Math.sqrt(num);
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		System.out.print("The square root of " + num + " is ");
		
				
		try {
			System.out.println(getSquareRoot(num));
		}catch (ArithmeticException e) {
			System.out.println("NaN");
			System.out.println("Cannot take a square root of a negative number");
		}
		
	}
	
	
}
