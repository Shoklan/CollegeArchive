//*************************************************************************************************
//   Author: Collin Mitchell
//   Course: CSC 101
//   Instructor: John Alampi
//   Lab: Sort3java
//   Due Date: 28th April 2011
//*************************************************************************************************
//    This class will take names from the console, send them to sorts.java, and then output the
//     result to the console.
//**************************************************************************************************
import java.util.*;

class Sort3
{
    //---------------------------------------------------------------------------------------------
    //    CLASS CONSTANTS
    //---------------------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------------------
    //    Instance Variables
    //---------------------------------------------------------------------------------------------

    //--------------------------------------------------------------------------------------------
    //    This is the main method
    //--------------------------------------------------------------------------------------------
    public static void main(String [] args)
    {
        //---------------------------------------------------------------------------------------------
        //    CONSTANTS
        //---------------------------------------------------------------------------------------------

        //---------------------------------------------------------------------------------------------
        //    Variables
        //---------------------------------------------------------------------------------------------
		String userInput = "";
		String[] friends = new String[50];
		int count = 0;
		Scanner scan = new Scanner(System.in);
		Sorts sort = new Sorts();
		
		for(int i = 0; i < friends.length; i++)
			friends[i] = "";

		System.out.println("Enter some friends.");
		System.out.println("Signal the end by entering a lowercase z.");
		userInput = scan.next();
		
		while(!(userInput.equalsIgnoreCase("z")) && (count < 50)){
			friends[count] = userInput;
			count++;
			userInput = scan.next();
		}

		sort.insertionSort(friends);
		System.out.println();
		System.out.println("The array sorted in increasing order is: ");
		for(int n = 0; n < friends.length; n++)
		if(!(friends[n].equals("")))
			System.out.print(friends[n] + " ");
	}//end of main method
}//end of class sort1