//************************************************
//           Name: John Alampi
//           Course:  CSC 101
//           Instructor:  John Alampi
//           Lecture Week 3:  JaAge.java
//           Due Date:  September 8, 2009
//
//************************************************
/**
*           convert a temperature from Celsius degrees to Fahrenheit
*           @PARAM C
*           A TEMPERATURE IN cELSIUS DEGREES
*           The Fahrenheit temperature equivalent to c has been
*           printed to System.out.
*           @exception IllegalArgumentException
*           Indicates that c is less than the smallest Celsius
*           temperature (-273.16)
**/
//           Due Date:  September 4, 2007
//
//************************************************
//********************************************************************
//  JaAge.java       Author: Lewis and Loftus
//
//  Demonstrates the use of an if statement.
//********************************************************************

import java.io.*;

public class JaAge
{
   //-----------------------------------------------------------------
   //  Reads the user's age and prints comments accordingly.
   //-----------------------------------------------------------------
   public static void main (String[] args) throws IOException
   {
     //-----------------------------------------------------------------
     //                         CONSTANT DECLARATIONs 
     //-----------------------------------------------------------------
      final int MINOR = 21;  // Minors Age

   //-----------------------------------------------------------------
   //  The following code sets up a text input stream from standard
   //  input
   //-----------------------------------------------------------------
 
      BufferedReader stdin = new BufferedReader
	(new InputStreamReader(System.in));


      System.out.print ("Enter your age: ");
      int age = Integer.parseInt (stdin.readLine());

      System.out.println ("You entered: " + age);

      if (age < MINOR)
         System.out.println ("Youth is a wonderful thing. Enjoy.");

      System.out.println ("Age is a state of mind.");
   }
}
