//************************************************
//           Name: John Alampi
//           Course:  CSC 101
//           Instructor:  John Alampi
//           Lecture Week 3:  JaPrice
//           Due Date:  September 19, 2009
//
//************************************************
//********************************************************************
//  JaPrice.java       Author: Alampi, Lewis and Loftus
//
//  Demonstrates the use of NumberFormat methods.
//********************************************************************

import java.util.*;
import java.text.NumberFormat;

public class JaPrice
{

   //--------------------------------------------------------------
   //              Class Level CONSTANT NAMES
   //--------------------------------------------------------------	             

   //--------------------------------------------------------------
   //             Class Level  VARIABLE NAMES          
   //--------------------------------------------------------------

   //-----------------------------------------------------------------
   //  Calculates the final price of a purchased item using values
   //  entered by the user.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      //-----------------------------------------------------------------
      //                         CONSTANT DECLARATIONs 
      //-----------------------------------------------------------------

      final double TAX_RATE = 0.06;  // 6% sales tax


      //-----------------------------------------------------------------
      //                         VARIABLE DECLARATIONs 
      //-----------------------------------------------------------------

      int quantity;    // Used to hold the quantity number input
      double subtotal, // Used to hold the quantity * unitprice
             tax,      // Used in tax calculation
             totalCost, // Used in calculate tax +subtotal
             unitPrice; // Used to hold the unitprice number input


     //-----------------------------------------------------------------------------------------
     //  The following code sets up a text input stream from standard
     //  input using the scanner class
     //-----------------------------------------------------------------------------------------
 
      Scanner scanner;
      scanner = new Scanner(System.in);
 
     System.out.print ("Enter the quantity: ");
     quantity = scanner.nextInt();

      System.out.print ("Enter the unit price: ");
      unitPrice = scanner.nextDouble();

      subtotal = quantity * unitPrice;
      tax = subtotal * TAX_RATE;
      totalCost = subtotal + tax;

      // Print output with appropriate formatting
      NumberFormat money = NumberFormat.getCurrencyInstance();
      NumberFormat percent = NumberFormat.getPercentInstance();
      //percent.setMinimumFractionDigits(2);

      System.out.println ("\nSubtotal: " + money.format(subtotal));
      System.out.println ("Tax: " + money.format(tax) + " at "
                          + percent.format(TAX_RATE));
      System.out.println ("Total: " + money.format(totalCost));

   }  // method main
}    // class JaPrice







