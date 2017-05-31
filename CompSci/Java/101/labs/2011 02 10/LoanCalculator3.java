//*****************************************************************
//    Name: Collin Mitchell
//    Course: CSC 101
//    Instructor: John Alampi
//    Lab: LoanCalculator3.java
//    Due Date: February 10, 2011
//*****************************************************************

/*
  Program LoanCalculator (Step 3)
  
  A program to compute the monthly payment for a given loan
  amount, annual interest rate, and number of years.
  
*/
import java.util.*;

public class LoanCalculator3
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
     final int MONTHS_IN_YEAR = 12;

     //--------------------------------------------------------------
     //  VARIABLE DECLARATIONS
     //--------------------------------------------------------------
     double loanAmount,
            annualInterestRate;

     double monthlyPayment,
            totalPayment;

     double monthlyInterestRate;

     int loanPeriod;

     int numberOfPayments;
     String inputStr;  //Used to hold the users input
     //--------------------------------------------------------------
     //  Gets the inputted values
     //--------------------------------------------------------------
     Scanner scanner = new Scanner(System.in);
     String lineSeparator = System.getProperty("line.separator");
     scanner.useDelimiter(lineSeparator);

     System.out.print("Loan Amount (Dollars + Cents): ");
     inputStr = scanner.next();
     loanAmount = Double.parseDouble(inputStr);

     System.out.print("Annual Interest Rate(e.g. 9.5): ");
     inputStr = scanner.next();
     annualInterestRate = Double.parseDouble(inputStr);

     System.out.print("Loan Period - # of Years: ");
     inputStr = scanner.next();
     loanPeriod = Integer.parseInt(inputStr);


     //--------------------------------------------------------------
     //  Compute the monthly and total payments
     //--------------------------------------------------------------
     monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / 100;
     numberOfPayments = loanPeriod * MONTHS_IN_YEAR;

     monthlyPayment = (loanAmount * monthlyInterestRate) / 
                      (1 - Math.pow(1/(1 + monthlyInterestRate),
                                           numberOfPayments));
     totalPayment = monthlyPayment * numberOfPayments;

     //--------------------------------------------------------------
     //  Display the result
     //--------------------------------------------------------------
     System.out.println("Loan Amount:          $" + loanAmount);
     System.out.println("Annual Interest Rate:  " + annualInterestRate + "%");
     System.out.println("Loan Period(Years):    " + loanPeriod);

     System.out.println("\n"); //skip two lines
     System.out.println("Monthly payment is $ " + monthlyPayment);
     System.out.println("  Total payment is $ " + totalPayment);
     // System.Exit(0);
    }//End of method
}//End of class