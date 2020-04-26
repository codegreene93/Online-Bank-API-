package weekend4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsTutorial {
	public static void main(String[] args) {
		ArrayList objArrayList = new ArrayList();

		objArrayList.add(1);
		objArrayList.add("Mark");
		
		
		Integer intValue = (Integer) objArrayList.get(0);
		String stringValue = (String) objArrayList.get(1);
		
		System.out.println("Integer value: " + intValue);
		System.out.println("String value: " + stringValue);
	
		
		List<Integer> intArrayList = new ArrayList<>();
		intArrayList.add(1);
		intArrayList.add(2);
		
		Integer integerSum = intArrayList.get(0) + intArrayList.get(1);
		
		System.out.println("Sum: " + integerSum);
		
		intArrayList = new LinkedList<>();
		
		
	}
}
