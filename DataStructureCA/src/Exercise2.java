

public class Exercise2 {
	
	public static void main(String[] args) {
		int[] arr = {10,10,9,1,3,0};
		int sum = 20;
		System.out.println(sumArray(arr,sum));
	}

	public static boolean sumArray(int[] arr, int sum) {
		return sumArrayAux(arr, arr.length, sum, 0);
	}
	
	public static boolean sumArrayAux(int[] arr, int n, int sum, int count) {
		
		if(sum == 0 && count == 4) {
			return true;
		}
		
		if(sum < 0 || count > 4 || n ==0) {
			return false;
		}                     
		
		if(sumArrayAux(arr, n-1, sum - arr[n-1], count + 1)) {	
			System.out.print(arr[n-1] + " ");
			return true;
		} else if(sumArrayAux(arr, n-1, sum, count)){
			return true;
		} else {
			return false;
		}
		
		
	}
	
	
	
	
	
}
