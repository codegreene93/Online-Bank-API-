
public class RecursionPractices {
	public static void main(String[] args) {
		int[] arr = {9,2,3,4,5,6};
		int sum = 18;
		
		generateQuads(arr,sum);
	
	}

	private static boolean generateQuads(int[] arr, int sum) {

		return checkQuadsinArray(arr, sum, arr.length, 0);
	}

	private static boolean checkQuadsinArray(int[] arr, int sum, int n, int counter) {
		
		if(sum == 0 && counter == 4) {
			return true;
		}
		
		
		if(counter > 4 || n==0) {
			return false;
		}
		
		
		if (checkQuadsinArray(arr, sum - arr[n-1], n - 1, counter+1)) {
			System.out.print(arr[n-1] + " ");
			return true;
		} else if (checkQuadsinArray(arr, sum, n-1, counter)){
			return true;
		} else {
			return false;
		}
		
			
	}
	
	
	
	
}
