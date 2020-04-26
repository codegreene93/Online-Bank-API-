import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem4 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(11);
		list.add(22);
		list.add(14);
		list.add(15);
		list.add(11);
		list.add(31);
		list.add(22);

		System.out.println("The list: " + list);
		System.out.println("The number of times each element occurs: ");
		generateFrequency(list);

	}

	public static void generateFrequency(List<Integer> list) {
		/*Used hashmap to store the element of the list as the key*/
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		/*Iterator which increments the value of key in the hashmap everytime the element is found in the list*/
		for (Integer n : list) {
			if (map.get(n) == null) {
				map.put(n, 1);
			} else {
				map.replace(n, map.get(n) + 1);
			}

		}
		
		/*Prints the occurence of each element*/
		for(Integer key : map.keySet()) {
			System.out.println(key + " occurs " + map.get(key) + (map.get(key) > 1? " times.": " time."));
		}
		
		

	}

}
