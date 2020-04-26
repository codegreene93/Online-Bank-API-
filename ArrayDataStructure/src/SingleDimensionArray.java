
public class SingleDimensionArray {
	int arr[] = null;
	
	public SingleDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray];		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	
	//Print the array
	public void traverseArray() {
		try {
			for (int i=0;i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
		}catch (Exception e) {
			System.out.println("Array no longer exists !");
		}
	}
	
	
	
	//Insert value into the array
	public void insert(int location, int valueToBeInserted) {
		try {
			if(arr[location]==Integer.MIN_VALUE) {
				arr[location]=valueToBeInserted;
				System.out.println("Successfully inserted " + valueToBeInserted + " at location " + location);
			}else {
				System.out.println("This cell is already occupied by another value.");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array !");
			//e.printStactTrace();
		}
	}
	
	
	//Access a particular element of an array
	public void accessingCell(int cellNumber) {
		try {
			System.out.println(arr[cellNumber]);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index to access array !");
		}
	}
	
	
	//Search for an element in a given array
	public void searchInAnArray(int valueToSearch) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==valueToSearch) {
				System.out.println("Value found!");
				System.out.println("Index of " + valueToSearch + " is: " + i);
				return;
			}
		}
		
		System.out.println(valueToSearch + " is not found!");
	}
	
	//Delete a value from a givenArray
	public void deleteValueFromArray(int deleteValueFromThisCell) {
		try {
			arr[deleteValueFromThisCell] = Integer.MIN_VALUE;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Can't delete a value as cell number provided is not in the range of the array");
			//e.printStackTrace();
		}
	}
	
	
	
	
	
}//end of class
