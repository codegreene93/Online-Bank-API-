import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers: ");
		int num1 = 0;
		int num2 = 0;
		boolean check = true;
		
		while(check) {
			try {
				num1 = in.nextInt();
				num2 = in.nextInt();
				check = false;
			} catch (InputMismatchException e) {
				System.out.println("One of the numbers inputted is invalid. Enter 2 numbers again: ");
				in.nextLine();
			}
		}

	
		System.out.println("\nSum: " + (num1+num2));
		System.out.println("Difference: " + (num1 - num2));
		System.out.println("Product: " + (num1 * num2));
		System.out.println("Quotient: " + (num1 / num2));

		
	}
}
