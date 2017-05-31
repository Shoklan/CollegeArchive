//***********************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 101
//   Instructor: John Alampi
//   Class: CMitc2Doo.java
//   Due Date: March 17th, 2011
//***********************************************************************
//***********************************************************************
//   This program is the working portion of project 2. This class will
//   contain a constructor, five methods, two constants, and four
//   variables.
//   The purpose of this program is to serve as a driver class that does
//   the work while keeping the main class[Cmitc2] simple and away from
//   the real data.
//***********************************************************************
import java.util.*;
import java.text.*;

public class CMitc2Doo
{
   //-------------------------------------------------------------------
   //   CONSTANTS
   //-------------------------------------------------------------------
   private final double PRICE_PER_LB = 4.76;
   private final double SALES_TAX = .0825;
   
   //-------------------------------------------------------------------
   //   Variables
   //-------------------------------------------------------------------
   private double unitWeight;          //The wieght of the Dooflings in pounds
   private double totalPrice;          //The total price of the Dooflings; without tax
   private double totalPriceWithTax;   //The total price of the Dooflings; with tax
   private int numberOfUnits;          //Number of Dooflings ordered

   //--------------------------------------------------------------------
   //   Default Constructor
   //--------------------------------------------------------------------
   public CMitc2Doo()
   {
      System.out.println("Collin Mitchell - Project 2");
   }
   
   //--------------------------------------------------------------------
   //   Public Methods
   //--------------------------------------------------------------------
   public void start()
   {
      describeProgram();
      getInput();
      computeTotalPrice();
      displayResult();
   }

   //--------------------------------------------------------------------
   //   This method is called from the public method start() and it
   //   outputs the purpose of the program along with the formulas it uses
   //   to come up with its numbers.
   //--------------------------------------------------------------------
   private void describeProgram()
   {
      System.out.println("This program accepts the unit weight of a Dooflingy in pounds");
      System.out.println("and the number of Dooflingies sold and displays the total price of the");
      System.out.println("sale, as computed as\n\n" +
         "    totalPrice         = unitWeight * numberOfUnits * " + PRICE_PER_LB + ";\n" +
         "    totalPriceWithTax  = totalPrice + totalPrice * " + SALES_TAX + ";\n\n" +
         "where " + PRICE_PER_LB + " is the PRICE_PER_POUND and " + SALES_TAX + 
         "is the SALES_TAX.\n\n\n");
   }

   //--------------------------------------------------------------------
   //   This method is called from the public method start() and this 
   //   method will request input from the user. It will then store
   //   the data received in two variables[numberOfUnits and unitWeight]
   //--------------------------------------------------------------------
   private void getInput()
   {
      //Used to get the user imput from the Standard input
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter the number of Dooflings sold: ");
      numberOfUnits = Integer.parseInt(scan.next());
      
      System.out.println("Enter the weight of the Dooflings(in lbs, e.g. 3.2): ");
      unitWeight = Double.parseDouble(scan.next());
      System.out.println("\n");
   }

   //--------------------------------------------------------------------
   //   This method is called from the public method start() and this 
   //   method caluclates the totalPrice and the TotalPriceWithTax
   //   using the data the user has input from the method getInput.
   //--------------------------------------------------------------------
   private void computeTotalPrice()
   {
      totalPrice = unitWeight * numberOfUnits * PRICE_PER_LB;
      totalPriceWithTax = totalPrice + totalPrice * SALES_TAX;
   }
   
   //--------------------------------------------------------------------
   //   This method is called from the public method start() and it will
   //   format the ouput the data for the user.
   //--------------------------------------------------------------------
   private void displayResult()
   {
      //Specifies the format for the output.
      DecimalFormat money = new DecimalFormat("$,###.00");
      DecimalFormat percent = new DecimalFormat(",###.00%");

      System.out.println("Number of Dooflings sold:   " + numberOfUnits);
      System.out.println("    Weight per Dooflingy:   " + unitWeight + " lbs");
      System.out.println("         Price per pound:   " + money.format(PRICE_PER_LB));
      System.out.println("               Sales tax:   " + percent.format(SALES_TAX));
      System.out.println("\n");
      System.out.println("             Total Price: " + money.format(totalPriceWithTax));
   }
}