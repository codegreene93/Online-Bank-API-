package week1;

import java.util.*;

/**
 *
 * @author cmuntean
 */
public class SortArray {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        // TODO code application logic here

        //*--------------------------------------------
  // put lots of data into the collection
  // this puts all the fruits in 100 times
  //*--------------------------------------------

  ArrayList<String> aList = new ArrayList<String>();
  for (int i = 0; i < 10000 ; i ++ )
  {
	aList.add("Papaya     ");
	aList.add("Orange    ");
	aList.add("Grape     ");
	aList.add("Pineapple ");
	aList.add("Lemon     ");
	aList.add("Strawberry");
	aList.add("Kiwi      ");
	aList.add("Nectarine ");
	aList.add("Melon     ");
	aList.add("Raspberry ");
	aList.add("Apple     ");

   }

   //*--------------------------------------------
   // Shuffle the collection  before sorting it
   //*--------------------------------------------
   Collections.shuffle(aList);

   //*--------------------------------------------
   // find out the time before starting the sort
   //*--------------------------------------------
   long startTime = System.currentTimeMillis();

   //*--------------------------------------------
   // execute the sort by calling the sort method
   //*--------------------------------------------
   Collections.sort(aList);

   //*--------------------------------------------
   // find out the time when the sort is complete
   //*--------------------------------------------
   long endTime = System.currentTimeMillis();

   //*--------------------------------------------
   // calculate the elapsed time and print a message
   //*--------------------------------------------
   System.out.println("The sorting of " + aList.size() + " elements took "  + (endTime - startTime)  + " Milliseconds");

    }

}
