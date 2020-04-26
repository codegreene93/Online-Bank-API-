import java.util.Scanner;

public class BadScriptCaught {
	public static void main(String[] args) {
		
		String arr[] = {"Ana","Lorna","Dan","Joe","Mary","Lisa","Ken","Miro","Elon","Jack"};
		
		System.out.println("Enter an index:");
		Scanner in = new Scanner(System.in);
		int num = 0;
		boolean check = true;
		
		while(check) {
			try {
				num = in.nextInt();
				System.out.println("The name on this index is: " + arr[num-1]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("The index inputted is out of bounds. Please enter another number: ");
				in.nextLine();
			}
		}
		
	}
}
