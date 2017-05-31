//*************************************************************************************************
//   Author: Collin Mitchell
//   Course: CSC 101
//   Instructor: John Alampi
//   Lab: Sort2java
//   Due Date: 28th April 2011
//*************************************************************************************************
//    This program will fill an array scores with up to 50 values of type int. It will then output
//    the numbers in increasing order for the user.
//**************************************************************************************************
import java.util.*;

class Sort2
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
		String userInput;
		int userNum;
		int[] scores = new int[50];
		int count = 0;
		Scanner scan = new Scanner(System.in);
		Sorts sort = new Sorts();
		
		System.out.println("Enter some nmbers between 0 and 100.");
		System.out.println("Signal the end by entering a number of that range.");
		userNum = Integer.parseInt(scan.next());
		
		while((userNum > 0) && (userNum < 100) && (count < 50)){
			scores[count] = userNum;
			count++;
			userNum = Integer.parseInt(scan.next());
		}

		sort.insertionSort(scores);
		System.out.println();
		System.out.println("The array sorted in increasing order is: ");
		for(int n = 0; n < scores.length; n++)
			if(scores[n] > 0)
				System.out.print( scores[n] + " ");
	}//end of main method
}//end of class sort1