package weekend4;

public class ArraySwap {

	public static void main(String[] args) {
		Integer[] intArray = new Integer[] {1,3,5,7,9,11};
		
		swapPosition(intArray,0,5);
		
		
		System.out.println();
		
		Double[] doubleArray = new Double[] {1.0,3.0,5.0,7.0,9.0,22.0};
		
		genericSwapPosition(doubleArray,0,5);
		
	}
	
	
	//Non-generic method
	public static void swapPosition(Integer[] array, int a, int b) {
		Integer temp = array[a];
		array[a] = array[b];
		array[b] = temp;		
		
		for(Integer value:array)
			System.out.print(value + " ");	
	}
	
	
	
	//Generic method
	public static <T> void genericSwapPosition(T[] array, int a, int b) {
		T temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		
		for(T value:array)
			System.out.print(value + " ");
	}
	
	

}
