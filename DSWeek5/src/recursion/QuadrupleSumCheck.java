package recursion;

public class QuadrupleSumCheck {

	public static void main(String[] args) {
		int[] arr = {2,3,4,1,6,1,1};
		int sum = 6;
		
		System.out.println("Quadruple exists: " + checkSumOfQudruple(arr,sum));
		System.out.println("\nQuadruples: ");
		printQuadruples(arr,sum);
	}

	public static boolean checkSumOfQudruple(int[] arr, int sum) {
		return checkSumAux(arr, sum, arr.length, 0);
	}
	
	public static boolean checkSumAux(int[] arr, int sum, int n, int count) {
		
		
		/*System.out.println("Sum: " + sum + ", N: " + n + ", Count: " + count);*/
		
		
		if(sum == 0 && count == 4) {
			return true;
		}
		
		if(count > 4 || n == 0) {
			return false;
		}
		
		return checkSumAux(arr,sum - arr[n-1],n-1,count+1) || checkSumAux(arr,sum,n-1,count);
	}
	
	
	public static void printQuadruples(int[] arr, int sum) {
		
		int n = arr.length;
		
		for(int i = 0; i<n-3; i++) {
			for(int j = i+1; j<n-2; j++) {
				for(int k = j+1; k<n-1; k++) {
					for(int l = k+1; l<n; l++) {
						if(arr[i] + arr[j] + arr[k] + arr[l] == sum) {
							System.out.println("(" + arr[i] + " " + arr[j] + " " + arr[k]+ " " + arr[l]+")");
						}
					}
				}
			}
		}
		
	}
	
	
}