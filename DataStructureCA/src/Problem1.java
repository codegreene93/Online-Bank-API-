import java.util.ArrayList;
import java.util.List;


public class Problem1 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(6);
		list.add(5);
		list.add(8);
		list.add(9);
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(1);
		list.add(2);

		System.out.println("Original ArrayList: " + list);
		System.out.println("ArrayList after deleting the pairs: " + MyArrayList.DeletePairs(list));
		
		
	}
}




class MyArrayList {
	
	public static List<Integer> DeletePairs(List<Integer> list){
		
		/* 1. Remove the last element if the size of an array is odd number
		 */
		if(list.size()%2 == 1) {
			list.remove(list.size() - 1);
		}
		
		int length = list.size();
		
		/* 1. Traverse every other element of the array list
		 * 2. Compare current element to next element
		 * 3. Remove current and next element, if current element is greater than next element
		 */
		for(int i = 0; i<length; i++) {
			
			if(list.get(i)>list.get(i+1)) {
				list.remove(i);
				list.remove(i);
				
				i -= 2;
				length -= 2;
			}
		
			++i;
			
		}		
		
		return list;

		
	}
	
}
	
