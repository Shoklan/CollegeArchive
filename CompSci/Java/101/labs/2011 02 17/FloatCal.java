//*************************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 101
//   Instructor: John Alampi
//   Class: FloatCal.java
//   Due Date: February 17th, 2011
//*************************************************************************
//*************************************************************************
//   This program will take two floats from the user and compute their
//   sum, product, and difference of the two numbers. The program will
//   then finish by outputting the results to the user.
//*************************************************************************
import java.util.*;
import java.text.*;

class FloatCal
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
      float one, two, sum, product, difference;
      String str1, str2;

      Scanner scan = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.000");

      //----------------------------------------------------------------------
      //   Get the first float number from the user
      //----------------------------------------------------------------------
      System.out.print("Enter the first number: ");
      str1 = scan.next();
      one = Float.parseFloat(str1);

      //----------------------------------------------------------------------
      //   Get the second float number from the user
      //----------------------------------------------------------------------
      System.out.print("Enter the second number: ");
      str2 = scan.next();
      two = Float.parseFloat(str2);
      System.out.println();
      System.out.println();

      //----------------------------------------------------------------------
      //   Compute the sum, product, and differece of the numners
      //----------------------------------------------------------------------
      sum =        one + two;
      product =    one * two;
      difference = one - two;

      //----------------------------------------------------------------------
      //   Output the results to the user
      //----------------------------------------------------------------------
      System.out.println("The sum is: "  + df.format(sum) + "\n" +
                         "The difference is: "  + df.format(difference) + "\n" +
                         "The product is: " + df.format(product));
      }//end of main method
}//end of class FloatCal