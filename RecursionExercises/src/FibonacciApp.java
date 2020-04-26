
public class FibonacciApp {
	public static void main(String[] args) {
		int fibonacci;
		
		Fibonacci myFibonacci = new Fibonacci();
		
		
		fibonacci = myFibonacci.getFibonacci(10);
		
		
		System.out.println(fibonacci);
		
		
		
	}
}


class Fibonacci{
	public Fibonacci() {}
	
	
	public int getFibonacci(int n) {
		
		if(n<=0) {
			return 0;
		}else if(n==1||n==2){
			return n-1;
		}else{
			return (getFibonacci(n-1) + getFibonacci(n-2));
		}
	}
	
}