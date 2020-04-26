package week1;

import java.util.ArrayList;

public class SmallestNumber {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		ArrayList<Integer> list4 = new ArrayList<>();
		ArrayList<Integer> list5 = new ArrayList<>();
		ArrayList<Integer> list6 = new ArrayList<>();


		addElements(list1, 1000);
		addElements(list2, 5000);
		addElements(list3, 10000);
		addElements(list4, 100000);
		addElements(list5, 1000000);
		addElements(list6, 10000000);

		
		long start = System.currentTimeMillis();

		findSmallElement(list1);
		
		long end = System.currentTimeMillis();
		
		System.out.println(list1.size() + " elements took " + (end-start) + " milliseconds.");

		
		 start = System.currentTimeMillis();

		findSmallElement(list2);
		
		 end = System.currentTimeMillis();
		
		System.out.println(list2.size() + " elements took " + (end-start) + " milliseconds.");
		
		 start = System.currentTimeMillis();

		findSmallElement(list3);
		
		  end = System.currentTimeMillis();
		
		System.out.println(list3.size() + " elements took " + (end-start) + " milliseconds.");
		
		 start = System.currentTimeMillis();

		findSmallElement(list4);
		
		  end = System.currentTimeMillis();
		
		System.out.println(list4.size() + " elements took " + (end-start) + " milliseconds.");
		
		 start = System.currentTimeMillis();

		findSmallElement(list5);
		
		  end = System.currentTimeMillis();
		
		System.out.println(list5.size() + " elements took " + (end-start) + " milliseconds.");
		
		 start = System.currentTimeMillis();

		findSmallElement(list6);
			
		 end = System.currentTimeMillis();
			
		System.out.println(list6.size() + " elements took " + (end-start) + " milliseconds.");
			
		 start = System.currentTimeMillis();

	
	}

	private static int findSmallElement(ArrayList<Integer> list) {
		int min = list.get(0);
		
		for(int i = 1; i<list.size(); i++) {
			if(min > list.get(i)) {
				min = list.get(i);
			}
		}
		
		return min;
		
	}

	
	private static void addElements(ArrayList<Integer> list, int size) {
		
		for(int i=0; i < size; i++) {
			int randNum = (int)(Math.random()*1000);
			list.add(randNum);
		}
	}
	
	
	
}
