//*****************************************************************
//    Name: Collin Mitchell
//    Course: CSC 101
//    Instructor: John Alampi
//    Lab: Coffee.java
//    Due Date: March 3rd, 2011
//*****************************************************************
//*****************************************************************
//   This program takes input from the user [numberOfUnits and 
//   unitWeight], calculates the total cost for the user, and then
//   outputs the information to the user.
//*****************************************************************
import java.util.*;
import java.text.*;
public class Coffee
{
   //--------------------------------------------------------------
   //  Class Level CCONSTANT NAMES
   //--------------------------------------------------------------
   
   //--------------------------------------------------------------
   //  Class level VARIABLE NAMES
   //--------------------------------------------------------------
   //--------------------------------------------------------------
   //  Method to calculate loan payments
   //--------------------------------------------------------------
   public static void main(String [] args)
   {
      //--------------------------------------------------------------
      //  CCONSTANT DECLARATIONS
      //--------------------------------------------------------------
      final float PRICE_PER_LB = 5.99f;
      final float SALES_TAX = .0725f;

      //--------------------------------------------------------------
      //  VARIABLE DECLARATIONS
      //--------------------------------------------------------------
      Scanner scan = new Scanner(System.in);
      DecimalFormat money = new DecimalFormat("$,###.00");
      DecimalFormat percent = new DecimalFormat("###.00%");
      DecimalFormat totalFormat = new DecimalFormat("$,###.000");
      
      double totalPrice;
      double totalPriceWithTax;
      double unitWeight;
      int numberOfUnits;
      String userInput;
      
      //---------------------------------------------------------------
      // Get the input from the user.
      //---------------------------------------------------------------
      System.out.print("Enter the nunber of bags sold: ");
      userInput = scan.next();
      numberOfUnits = Integer.parseInt(userInput);
      
      System.out.print("Enter the weight of the bag(in lbs, e.g. 41): ");
      userInput = scan.next();
      unitWeight = Double.parseDouble(userInput);

      //----------------------------------------------------------------
      // Calculate the totalPrice and the totalPriceWithTax
      //----------------------------------------------------------------
      totalPrice = unitWeight * numberOfUnits * PRICE_PER_LB;
      totalPriceWithTax = totalPrice + totalPrice * SALES_TAX;

      //----------------------------------------------------------------
      // Display all relevant information to the user.
      //----------------------------------------------------------------
      System.out.println("\n");
      System.out.println("Number of bags sold: " + numberOfUnits);
      System.out.println("     Weight per bag: " + unitWeight + " lbs");
      System.out.println("    Price per pound: " + money.format(PRICE_PER_LB));
      System.out.println("          Sales Tax: " + percent.format(SALES_TAX));
      System.out.println("\n");
      System.out.print("Total Price is: " + totalFormat.format(totalPriceWithTax));
    }//end of main method
}//end of class Coffee