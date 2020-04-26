import java.util.Random;
import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		
		Random rand = new Random();
				
		for(int i=0; i<arr.length; i++) {
			arr[i] = rand.nextInt(1000);
		}
		
		System.out.println("Please enter the index you need to pull");
		Scanner in = new Scanner(System.in);
		
		int num = 0; 
		boolean check = true;
		
		while(check) {
			try {
				num = in.nextInt();
				System.out.println(arr[num]);
				check = false;
			} catch (ArrayIndexOutOfBoundsException e){
				System.out.println("Index is Out of Bound. Enter another index: ");
				in.nextLine();
			}
		}

		
	}
}
