//*************************************************************************************************
//   Author: Collin Mitchell
//   Course: CSC 101
//   Instructor: John Alampi
//   Lab: CountInt.java
//   Due Date: 14th May 2011
//*************************************************************************************************
//    This program will take input from the user. It will take input until a number entered is
//    outside the range [0-50]. It will Add up the total number of occurences for each number input
//    It will then call SumValue and have that calculate the total number of elements.
//**************************************************************************************************
import java.util.*;

class CountInt2
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
        int[][] array = new int[51][2];
        int userNum = 1;
        
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < 51; i++){
            array[i][0] = i;
            array[i][1] = 0;
        }
        
        System.out.println("Enter numbers in the range 0 to 50.");
        System.out.println("Signal end of the list with a number outside the range.");
        
        while(userNum < 0 | userNum < 51){
            userNum = Integer.parseInt(scan.next());
            for(int i = 0; i < array.length; i++)
                if(userNum == array[i][0])
                    array[i][1] += 1;
        }
        
        System.out.println("Number    Times");
        for(int i = 0; i < array.length; i++)
            if(array[i][1] > 0)
                System.out.println(i + "\t  " + array[i][1]);
				
		SumValue sum = new SumValue();
		System.out.println("\nThe sun of the elements of the array are " + sum.sum(array));
    }//end of main method
}//end of class CountInt
