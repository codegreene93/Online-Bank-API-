package generics.practice;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcards {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(5);
		ints.add(10);
		
		double sum = sum(ints);
		System.out.println(sum);
	}
	
	
	public static double sum(List<? extends Number> list) {
		double sum = 0;
		for(Number val:list) {
			sum += val.doubleValue();
		}
		return sum;
	}
}
