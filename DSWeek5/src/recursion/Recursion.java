package recursion;

public class Recursion {
	public static void main(String[] args) {
		countDown(3);
		System.out.println("\nCalculating the factorial");
		System.out.println(factorial(5));
		
		System.out.println("\nCalculating the fibonacci");
		
		for(int i = 1; i<=10;i++) {
			System.out.print(fibonacci(i) + " ");
		}
	
		
		
	}
	
	
	public static void countDown(int n) {
		
		if(n==0) //STOP condition
		{
			System.out.println("Done");
		}else {
			System.out.println(n);
			countDown(n-1); //recursive method call
		}
	}
	

	public static int factorial(int n) {
		
		if(n==1) {//STOP condition
			return 1;
		}
		
		return n*factorial(n-1);
	}
	

	public static int fibonacci(int n) {
		
		if(n<=1) {
			return n;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	
	
	
}
