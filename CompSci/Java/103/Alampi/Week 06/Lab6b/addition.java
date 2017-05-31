//************************************************
//           Name: John Alampi
//           Course:  CSC 101
//           Instructor:  John Alampi
//           Lecture Week 5:  Addition
//           Due Date:  October 15, 2009
//
//************************************************
//********************************************************************
//  Addition.java       Author: Lewis and Loftus
//
//  Demonstrates conversions of Numeric input data.
//********************************************************************

import java.io.*;

public class Addition
{
   //-----------------------------------------------------------------
   //  Reads two integers and prints their sum.
   //-----------------------------------------------------------------

   public static void main (String[] args) throws IOException
   {

   //-----------------------------------------------------------------
   //                         CONSTANT DECLARATIONs 
   //-----------------------------------------------------------------



   //-----------------------------------------------------------------
   //                         VARIABLE DECLARATIONs 
   //-----------------------------------------------------------------

   String string1,    // Used to hold the first number input
          string2;    // Used to hold the second number input

   int    num1,       // Used to hold the first number converted to Integer
          num2,       // Used to hold the second number converted to Integer
          sum;        //  Used to hold the sum of num1 + num2
                                                                                      
   //-----------------------------------------------------------------
   //  The following code sets up a text input stream from standard
   //  input
   //-----------------------------------------------------------------
 
      BufferedReader stdin = new BufferedReader
	(new InputStreamReader(System.in));


            
      System.out.print ("Enter a number: ");
      string1 = stdin.readLine();
      num1 = Integer.parseInt (string1);


      System.out.print ("Enter another number: ");
      string2 = stdin.readLine();
      num2 = Integer.parseInt (string2);

      sum = num1 + num2;
      System.out.print ("The sum is: " + sum);


   }  // method main

}  // class Addition








