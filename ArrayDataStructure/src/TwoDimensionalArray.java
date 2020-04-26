
public class TwoDimensionalArray {
	int arr[][] = null;
	
	//Constructor
	public TwoDimensionalArray(int rows, int columns) {
		arr = new int[rows][columns];
		for (int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}
	
	//Traversal of an Array
	public void traverseArray() {
		try{
			System.out.println("Printing array now...");
			for(int row=0;row<arr.length;row++) {
				for(int col=0;col<arr[row].length;col++) {
					System.out.print(arr[row][col]+ "   ");
				}
				System.out.println();
			}
			System.out.println("\n");
			
		}catch (Exception e) {
			System.out.println("Array does not exist");
		}
	}
	
	
	//Inserting a value in the Array
	public void  insertValueInTheArray(int row, int col, int value) {
		try {
			if(arr[row][col]==Integer.MIN_VALUE) {
				arr[row][col]=value;
				System.out.println("Succesfully inserted " +  value + " in the array");
			}else {
				System.out.println("This cell is already occupied by another value");
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array !");
			//e.printStackTrace();
		}
	}
	
	
	
	//Accessing a given value for an array
	public void accessingSingleCell(int row, int col) {
		System.out.println("\n Accessing Row#" + row + ", Col#"+ col +"...");
		try {
			System.out.println("Cell value is: " + arr[row][col]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array !");
			//e.printStackTrace();
		}
		System.out.println();
	}
	
	
	//Searching a value from the array
	public void searchingSingleValue(int value) {
		System.out.println("\n Searching value " + value + " int the array");
		for(int row=0; row<arr.length; row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==value) {
					System.out.println("Value is found at location Row:" + row + " & Col:" + col + "\n\n");
					return;
				}
			}
		}
		
		System.out.println("Value is not found in Array\n");
	}
	
	
	//Deleting a value from Array
	public void deleteValueFromArray(int row, int col) {
		System.out.println("Deleting the value from Row#" + row + " & Col#" + col + "...");
		try {
			System.out.println("Successfully deleted: " + arr[row][col]);
			arr[row][col] = Integer.MIN_VALUE;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Can't delete the value as cell# provided is not in the range of the array !");
		}
	}
	
	
	//Delete the entire array
	public void deleteThisArray() {
		arr = null;
		System.out.println("Array has been successfully deleted");
	}
	
}//end of class
