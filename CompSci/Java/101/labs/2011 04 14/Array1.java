//*************************************************************************************************
//   Author: Collin Mitchell
//   Course: CSC 101
//   Instructor: John Alampi
//   Lab: Array1.java
//   Due Date: 14th May 2011
//*************************************************************************************************
//    This program will store 10 numbers in an array. It will then compare all of the previous
//    numbers with the last element in the array.
//**************************************************************************************************
import java.util.*;

class Array1
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
        double[] a = new double[10];
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 10 numbers: ");
        for(int i = 0; i < 10; i++)
            a[i] = Double.parseDouble(scan.next());
        
        System.out.println("The numbers and differences from the last numbers are: ");
        
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i] + " difffers from the last number by " + (a[a.length-1] - a[i]));
    }//end of main method
}//end of class Array1