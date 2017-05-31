//*************************************************************************
//   Author: Collin Mitchell
//   Course: CSC 101
//   Instructor: John Alampi
//   Class: CoffeeDiscount.java
//   Due Date: March 24th, 2011
//*************************************************************************
//   This program will take input from a user [numBags]. Then, the program
//   will calculate the totalCharge using some other variables [coffeeCost,
//   discountRate, discountTotal, totalCharge].
//*************************************************************************
import java.util.*;
import java.text.*;

class CoffeeDiscount
{
    //---------------------------------------------------------------------
    //    This is the main method
    //---------------------------------------------------------------------
    public static void main(String [] args)
    {
        //-----------------------------------------------------------------
        //    CONSTANTS
        //-----------------------------------------------------------------
        final float PRICE_PER_2LB_BAG = 5.50f;

        //-----------------------------------------------------------------
        //    Variables
        //-----------------------------------------------------------------
        Scanner scan = new Scanner(System.in);
        DecimalFormat money = new DecimalFormat("$##0.00");
        DecimalFormat percent = new DecimalFormat("##0.##%");
        
        int numBags = 0;
        double coffeeCost = 0.0;
        double discountRate = 0.0;
        double discountTotal = 0.0;
        double totalCharge = 0.0;

        //-----------------------------------------------------------------
        //    Get input from the user. [numBags]
        //    Calculate cost of the coffee [coffeeCost]
        //-----------------------------------------------------------------
        System.out.println("Input: ");
        System.out.print("  Enter the number of coffee bags: ");
        numBags = Integer.parseInt(scan.next());
        coffeeCost = numBags * PRICE_PER_2LB_BAG;

        //-----------------------------------------------------------------
        //    Compute the discountRate, discountTotal, and totalCost.
        //-----------------------------------------------------------------
        if(numBags >= 300)
            discountRate = .30;
        else if(numBags >= 200)
                discountRate = .25;
        else if(numBags >= 150)
            discountRate = .2;
        else if(numBags >= 100)
            discountRate = .15;
        else if(numBags >= 50)
            discountRate = .10;
        else if(numBags >= 25)
            discountRate = .05;
        else
            discountRate = 0;

        discountTotal = coffeeCost * discountRate;
        totalCharge = coffeeCost - discountTotal;

        //------------------------------------------------------------------
        //    Output the important details
        //------------------------------------------------------------------
        System.out.println("\n");
        System.out.println("Output: ");
        System.out.println("  Number of Bags ordered : " + numBags + " - " + money.format(coffeeCost) + "\n");
        System.out.println("                  Dicount: " + percent.format(discountRate) + " - " + money.format(discountTotal) + "\n\n");
        System.out.println("    Your total charge is : " + money.format(totalCharge));
    }//end of main method
}//end of class CoffeeDiscount