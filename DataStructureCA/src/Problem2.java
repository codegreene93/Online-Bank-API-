import java.util.Arrays;

class Problem2 { 
	
    public static void main (String[] args) { 
        int arr[] = {0,6, -2, 3, 4, 5,7,-1}; 
        int sum =18;
        
        System.out.println("The array: " + Arrays.toString(arr));
        System.out.println("\nPrinting combination of 4 numbers in the array whose sum equals " + sum + "...");
        printCombinations(arr, sum);
        System.out.println("\nPrinting done. No other combinations found.");
    } 
	
    
    /* Intermediary method which accepts the array, and targeted sum
     * 1. Declares a temporary array of size 4
     * 2. Calls the recursive array*/
    public static void printCombinations(int arr[], int sum) {
        
        int temp_arr[] = new int[4];
        
        recurArray(arr,temp_arr,0,0,sum);
    }
    
    
  	/* A recursive function which:
    * 1. generates all the possible 4-element array combinations
    * 2. Prints the array if the sum of 4 elements = sum.
    * 3. Variables used:
    * 	a. arr[] - the original array
    *   b. temp_arr - the temporary array storing the combination of 4 elements
    *   c. index - the current index of temporary array
    *   d. start - the current index of the orinal array
    *   e. sum - the targeted sum */
    public static void recurArray(int arr[], int temp_arr[], int index,  int start, int sum) 
    { 
    	
    	/*Print array if temp_arr is full and sum of all elements equals sum*/
        if (index == 4) 
        { 
        	if(arraySum(temp_arr, temp_arr.length) == sum) {
        		System.out.println(Arrays.toString(temp_arr));
        	}
            return; 
        } 
  
        
        if(start==arr.length)
        	return;
        
        
        temp_arr[index] = arr[start];
        
        
        recurArray(arr, temp_arr, index+1, start+1, sum);
        
        //fix to the previous index, and slide the start by 1 when the index == 4 or start = arr.length
        recurArray(arr, temp_arr, index,  start+1, sum);
        
    } 
  
    //Another recursive function which calculates the sum of the array
	public static int arraySum(int[] data, int n) {
		if(n==0) {
			return 0;
		}
		return data[n-1] + arraySum(data, n-1);
	}


} 