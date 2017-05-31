//************************************************
//           Name: John Alampi
//           Course:  CSC 101
//           Instructor:  John Alampi
//           Lecture Week 1:  JaAge
//           Due Date:  September 8, 2009
//
//************************************************
//********************************************************************
//  JaAge.java       Author: Lewis and Loftus
//
//  Demonstrates the use of an if statement.
//********************************************************************

import java.util.*;

public class JaAge
{
   //-----------------------------------------------------------------
   //                         CONSTANT DECLARATIONs 
   //-----------------------------------------------------------------

   //-----------------------------------------------------------------
   //                         VARIABLE DECLARATIONs 
   //-----------------------------------------------------------------

   //-----------------------------------------------------------------
   //  Reads the user's age and prints comments accordingly.
   //-----------------------------------------------------------------
   public static void main (String[] args) 
   {
     //-----------------------------------------------------------------
     //                         CONSTANT DECLARATIONs 
     //-----------------------------------------------------------------
      final int MINOR = 21;  // Minors Age

     //-----------------------------------------------------------------------------------------
     //  The following code sets up a text input stream from standard
     //  input using the scanner class
     //-----------------------------------------------------------------------------------------
 
      Scanner scanner;
      scanner = new Scanner(System.in);


      System.out.print ("Enter your age: ");
      int age = scanner.nextInt ();

      System.out.println ("You entered: " + age);

      if (age < MINOR)
         System.out.println ("Youth is a wonderful thing. Enjoy.");

      System.out.println ("Age is a state of mind.");
   }
}
