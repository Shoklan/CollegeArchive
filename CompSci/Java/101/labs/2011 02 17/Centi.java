//*************************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 101
//   Instructor: John Alampi
//   Class: Centi.java
//   Due Date: February 17th, 2011
//*************************************************************************
//*************************************************************************
//   This program will take a centimeter and convert it to feet and inches.
//*************************************************************************
import java.util.*;
import java.text.*;

class Centi
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
      final double INCHES_TO_CM = 2.54;
      final double FEET_TO_INCHES = 12;

      //----------------------------------------------------------------------
      //   Variables
      //----------------------------------------------------------------------
      String str1;
      double numberToConvert;
      int answerFeet;
      double answerInches;
      double convertToInches;

      Scanner scan = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.000000");

      //----------------------------------------------------------------------
      //   Take input from the user
      //----------------------------------------------------------------------      
      System.out.print("Enter centimeters (e.g. 174.5): ");
      str1 = scan.next();
      numberToConvert = Double.parseDouble(str1);
      System.out.println();

      //----------------------------------------------------------------------
      //   Convert centimeters to inches
      //----------------------------------------------------------------------
      convertToInches = numberToConvert / INCHES_TO_CM;
      answerFeet = (int)(convertToInches / FEET_TO_INCHES);
      answerInches = convertToInches % FEET_TO_INCHES;
      

      //----------------------------------------------------------------------
      //   Output the resutls to the user
      //----------------------------------------------------------------------
      System.out.println(numberToConvert + " cm is equivalent to\nOutput: " + answerFeet + " ft and " + df.format(answerInches) + " inches.");

     }//end of main method
}//end of classCenti