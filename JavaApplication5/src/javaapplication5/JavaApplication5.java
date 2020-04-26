package javaapplication5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;


public class JavaApplication5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList does not support primitives
		ArrayList studentAges = new ArrayList<int>()
		*/
		
		/*Correct way to create ArrayList using Integers
		ArrayList studentAges = new ArrayList<Integer>();
		*/
		
		
		ArrayList studentsArrayList = new ArrayList<String>();
		
		studentsArrayList.add("John"); //Adds to the end of the ArrayList
		studentsArrayList.add("Mark");
		studentsArrayList.set(1,"Marcus"); //Updating values
		studentsArrayList.add(2,"Carl"); //Adding values at aspeicfic location
		studentsArrayList.add(3, "Jake");
		studentsArrayList.add(4,"Jake");

		System.out.println("Original ArrayList: " + studentsArrayList);
		
		
		//Removing values
		studentsArrayList.remove(0); //Remove element at index 0
		studentsArrayList.remove("Jake"); //Removes first occurence of the value
		System.out.println("ArrayList After Removing Index 0: " + studentsArrayList);

		
		//Returning values
		System.out.println("Value at Index 0: " + studentsArrayList.get(0));
		
		
		//Searching for a value
		if(studentsArrayList.contains("Jake")) {
			System.out.println("Found..");
			studentsArrayList.remove("Jake");
			System.out.println(studentsArrayList);
		}else {
			System.out.println("Not Found...");
		}
		
		//Swapping values
		Collections.swap(studentsArrayList, 1, 0);
		System.out.println("ArrayList after the swap: " + studentsArrayList);
		
		
		//Create a new List
		ArrayList studentsArrayList2 = new ArrayList<String>();
		studentsArrayList2.add("Fiona");
		studentsArrayList2.add("Aoife");
		studentsArrayList2.add("Sean");
		
		System.out.println("Not sorted : " + studentsArrayList2);
		Collections.sort(studentsArrayList2); //ascending order
		System.out.println("Sorted Ascending: " + studentsArrayList2);
		Collections.reverse(studentsArrayList2);
		System.out.println("Sorted Descending: " + studentsArrayList2);
		
		
		ArrayList studentsArrayListConsolidated = new ArrayList<String>();
		studentsArrayListConsolidated.addAll(studentsArrayList);
		studentsArrayListConsolidated.addAll(studentsArrayList2);
		System.out.println("Consolidated Array List : " + studentsArrayListConsolidated);
		
		
		
		//basic iteration using for loop
		for(int i = 0; i<studentsArrayListConsolidated.size(); i++) {
			System.out.println(studentsArrayListConsolidated.get(i));
		}
		
		
		ArrayList<String> moviesArrayList = new ArrayList<String>();
		
		//Using a while loop Keep prompting the user for a Movie Name until they enter the word exit
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter movies, input EXIT to finish");
		String movieName = in.nextLine();
		
		while(!movieName.toLowerCase().equals("exit")){
			//Add each movie name to the list;
			moviesArrayList.add(movieName);
			movieName = in.nextLine();
		}
		
		//Printing the movieList
		System.out.println("Movies:  " + moviesArrayList);
		
		
		
		//using advanced For Loop
		for(String movie : moviesArrayList) {
			System.out.println(movie);
		}
		
		//Using forEach loop
		moviesArrayList.forEach(movie -> System.out.println(movie));
		
		
		//Declaring and initializing arraylist at the same time
		//The first Integer wrapper in declaration is not required
		ArrayList<Integer> intArrayList = new ArrayList<Integer>() {
			{
				add(5);
				add(44);
				add(60);
				add(101);
			}
		};
		
		System.out.println(intArrayList);
		
		//Using iterator
		Iterator it = intArrayList.iterator();
		
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		for(int number:intArrayList) {
			System.out.println(number);
		}
		
		
		
	}

}
