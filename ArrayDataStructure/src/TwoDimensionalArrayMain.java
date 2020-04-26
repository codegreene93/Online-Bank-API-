
public class TwoDimensionalArrayMain {
	public static void main(String[] args) {
		
		System.out.println("Creating a blank array of size 5x5...");
		TwoDimensionalArray sda = new TwoDimensionalArray(5,5);
		sda.traverseArray();
		
		
		sda.insertValueInTheArray(0, 2, 1000000001);
		sda.traverseArray();
		
		sda.insertValueInTheArray(0, 2, 1000000001);
		sda.traverseArray();
		
		sda.accessingSingleCell(0, 2);
		sda.accessingSingleCell(6, 2);
		sda.accessingSingleCell(2, 2);
		
		
		sda.searchingSingleValue(10);
		sda.searchingSingleValue(-2147483648);
		sda.searchingSingleValue(1000000001);
		
		
		sda.deleteValueFromArray(0, 2);
		sda.traverseArray();
		
		sda.deleteThisArray();
		sda.traverseArray();
	}
}
