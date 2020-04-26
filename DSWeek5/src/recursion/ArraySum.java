package recursion;

public class ArraySum {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		System.out.println("Sum of Array: " + sumArray(arr));
	
	}

	
	public static int sumArray(int[] arr) {	
		return sumArrayAux(arr, arr.length);
	}
	
	
	public static int sumArrayAux(int[] arr, int n) {	
		if(n==0) {
			return 0;
		}
		
		return arr[n-1] + sumArrayAux(arr, n-1);
	}

}
