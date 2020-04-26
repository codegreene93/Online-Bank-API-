
package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		int num = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter and integer");
		
		try {
			num = in.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("The character entered is not an integer");
		}
	}
}
