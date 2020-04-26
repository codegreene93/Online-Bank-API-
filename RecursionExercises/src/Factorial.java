import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int N;
		long factorial;
		
		
		Scanner in = new Scanner(System.in);
		
		FactorialCalculator fc = new FactorialCalculator();
		
		
		//Print the prompt
		System.out.println("Enter a number:");
		N = in.nextInt();
		
		factorial = fc.getFactorial(N);
		
		System.out.println("The factorial of " + N + " is " + factorial);
		
		
		
	}
	
}


class FactorialCalculator {
	
	public FactorialCalculator() {}
	
	
	public long getFactorial(int N) {
		if(N==0) {
			return 1;
		}else {
			return N*getFactorial(N-1);
		}
	
	}
}