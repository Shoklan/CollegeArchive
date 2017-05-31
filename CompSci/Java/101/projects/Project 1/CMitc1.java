//*************************************************************************
//   Author: Collin Mitchell
//   Course: CSC 101
//   Instructor: John Alampi
//   Class: CMitc.java
//   Due Date: March 3rd, 2011
//*************************************************************************
//*************************************************************************
//   This program was designed for the Rinky Doofling Company. It will take
//   input[numberOfDooflings] from the user, compute the total of different
//   sized boxes[HUGE, LARGE, MEDIUM, SMALL] for packaging the Dooflings,
//   and then output the cost[boxCost + dooflingCost] of the order along
//   with number of each sized box.
//*************************************************************************
import java.util.*;
import java.text.*;

public class CMitc1
{
   //------------------------------------------------------
   //   CONSTANTS
   //------------------------------------------------------

   //------------------------------------------------------
   //   Variables
   //------------------------------------------------------

   //------------------------------------------------------
   //   This is the main Method. This is where all the fun
   //   stuff happens, like calculations and output.
   //------------------------------------------------------
   public static void main(String [] args)
   {
      //------------------------------------------------------
      //   COINSTANTS
      //------------------------------------------------------
      final double PRICE_PER_DOO = .26;
      final double HUGE_BOX_COST = 3.08;
      final double LARGE_BOX_COST = 2.08;
      final double MEDIUM_BOX_COST = 1.08;
      final double SMALL_BOX_COST = .58;
      final int HUGE_BOX_CAPACITY = 50;
      final int LARGE_BOX_CAPACITY = 20;
      final int MEDIUM_BOX_CAPACITY = 5;
      final int SMALL_BOX_CAPACITY = 1;
      final int MAX = 15000;

      //------------------------------------------------------
      //   Variables
      //------------------------------------------------------
      Scanner scan = new Scanner(System.in);
      DecimalFormat financialNumber = new DecimalFormat("$,###.00");
      DecimalFormat genericNumber = new DecimalFormat(",###.##");
      
      int numberOfHugeBoxes;
      int numberOfLargeBoxes;
      int numberOfMediumBoxes;
      int numberOfSmallBoxes;
      int numberOfDooflings;
      int totalDooflings;
      double dooflingCost;
      double boxCost;
      String userInput;

      //------------------------------------------------------
      //   Get the number of Dooflings from the user.
      //   Note: totalDooflings will initailly be the same as
      //   numberOfDooflings, but I wanted a seperate variable
      //   to maintain the original total while I use
      //   numberOfDooflings to compute the amount of boxes.
      //------------------------------------------------------
      System.out.print("Enter the amount to ship [1-" + MAX + "]: ");
      userInput = scan.next();
      numberOfDooflings = Integer.parseInt(userInput);
      totalDooflings = numberOfDooflings;
      
      //------------------------------------------------------
      //   Compute the breakdown of the Dooflings Box count.
      //   The dooflingCost and boxCost are also calculated
      //   in this block.
      //------------------------------------------------------
      numberOfHugeBoxes = numberOfDooflings / HUGE_BOX_CAPACITY;
      numberOfDooflings %= HUGE_BOX_CAPACITY;
      numberOfLargeBoxes = numberOfDooflings / LARGE_BOX_CAPACITY;
      numberOfDooflings %= LARGE_BOX_CAPACITY;
      numberOfMediumBoxes = numberOfDooflings / MEDIUM_BOX_CAPACITY;
      numberOfDooflings %= MEDIUM_BOX_CAPACITY;
      numberOfSmallBoxes = numberOfDooflings;
      dooflingCost = totalDooflings * PRICE_PER_DOO;
      boxCost = (numberOfHugeBoxes * HUGE_BOX_COST) +
                (numberOfLargeBoxes * LARGE_BOX_COST) +
                (numberOfMediumBoxes * MEDIUM_BOX_COST) +
                (numberOfSmallBoxes * SMALL_BOX_COST);


      //------------------------------------------------------
      //   Output the results of all calculations as well as
      //   format the output's appearance.
      //------------------------------------------------------
      System.out.println("Number of Dooflings ordered:  " + genericNumber.format(totalDooflings) + "  - " + financialNumber.format(dooflingCost));
      System.out.println();
      System.out.println("The containers used are given as: \n");
      System.out.println("   Container          Number          Cost");
      System.out.println("   =========          ======         ======");
      System.out.println("   Huge        \t \t"  + numberOfHugeBoxes   +  " \t     " + financialNumber.format(numberOfHugeBoxes * HUGE_BOX_COST));
      System.out.println("   Large       \t \t " + numberOfLargeBoxes  +  " \t     " + financialNumber.format(numberOfLargeBoxes * LARGE_BOX_COST));
      System.out.println("   Medium      \t \t " + numberOfMediumBoxes +  " \t     " + financialNumber.format(numberOfMediumBoxes * MEDIUM_BOX_COST));
      System.out.println("   Small       \t \t " + numberOfSmallBoxes  +  " \t     " + financialNumber.format(numberOfSmallBoxes * SMALL_BOX_COST));
      System.out.println();
      System.out.println("Your total cost is : " + financialNumber.format(boxCost + dooflingCost));
   }//end of main method
}//end of class CMitc1