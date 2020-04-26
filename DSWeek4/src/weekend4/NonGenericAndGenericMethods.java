package weekend4;

public class NonGenericAndGenericMethods {

	public static void main(String[] args) {
		Integer[] nums = new Integer[] {2,6,10,20,30};
		
		DisplayArrayValues(nums);
		
		
		Double[] doubleNums = new Double[] {10.55,50.77,100.78,45.50};
		
		DisplayGenericArrayValues(doubleNums);

	}
	
	//Non-Generic Method
	public static void DisplayArrayValues(Integer[] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.println("Value : " + array[i]);
		}
	}
	
	//Generic Method
	public static <T> void DisplayGenericArrayValues(T[] array) {
		for(T element: array) {
			System.out.println("Value : " + element);
		}
	}
	

}
