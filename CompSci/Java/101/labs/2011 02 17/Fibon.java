//*************************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 101
//   Instructor: John Alampi
//   Class: Fibon.java
//   Due Date: February 17th, 2011
//*************************************************************************
//*************************************************************************
//   This program will take a centimeter and convert it to feet and inches.
//*************************************************************************
import java.util.*;
import java.text.*;

class Fibon
{
   //----------------------------------------------------------------------
   //   CONSTANTS
   //----------------------------------------------------------------------

   //----------------------------------------------------------------------
   //   Variables
   //----------------------------------------------------------------------

   //----------------------------------------------------------------------
   //   Taking input from the user and outputing the computed results
   //----------------------------------------------------------------------
   public static void main(String [] args)
   {
      //----------------------------------------------------------------------
      //   CONSTANTS
      //----------------------------------------------------------------------

      //----------------------------------------------------------------------
      //   Variables
      //----------------------------------------------------------------------
      int fibonacciNumber;
      double dblA; //This will be the first piece to the Fibonacci formula
      double dblB; //This will be the second piece to the Fibonacci formula
      double dblC; //This will be the third piece to the Fibonacci forumla
      int nThNumber;
      String str1;
      
      Scanner scan = new Scanner(System.in);
      
      //---------------------------------------------------------------------------------------
      //   Get the input from the user
      //---------------------------------------------------------------------------------------
      System.out.print("Enter N to compute the Nth Fibonacci number: ");
      str1 = scan.next();
      nThNumber = Integer.parseInt(str1);
      System.out.println();
      //----------------------------------------------------------------------------------------
      //   Compute the Fibonacci Number
      //----------------------------------------------------------------------------------------
      dblA = 1 / Math.sqrt(5);                       //Part one of the Fibonacci Formula
      dblB = ((1 + Math.sqrt(5)) / 2);                 //Part two of the Fibonacci Formula
      dblB = Math.pow(dblB, nThNumber);              //Altered part two of Fibonacci Formula
      dblC = ((1 - Math.sqrt(5)) / 2);                 //Part three of the Fibonacci Formula
      dblC = Math.pow(dblC, nThNumber);              //Altered part three of Fibonacci Formula
      fibonacciNumber = (int)(dblA * (dblB - dblC)); //Fibonacci Formula
      
      System.out.println(" n : " + nThNumber);
      System.out.println(" Fn: " + fibonacciNumber);
    }
}