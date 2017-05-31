//*****************************************************************
//    Name: Collin Mitchell
//    Course: CSC 101
//    Instructor: John Alampi
//    Lab: LoanCalculator4.java
//    Due Date: February 10, 2011
//*****************************************************************

/*
  Program LoanCalculator (Step 4)
  
  A program to compute the monthly payment for a given loan
  amount, annual interest rate, and number of years.
  
*/
import java.util.*;
import java.text.*;

public class LoanCalculator4
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

     DecimalFormat df = new DecimalFormat("$,##0.000");
     DecimalFormat money = new DecimalFormat("$,##0.0#");
     DecimalFormat percent = new DecimalFormat(",##0.0#%");



     //--------------------------------------------------------------
     //  Describe the Program
     //--------------------------------------------------------------
     System.out.println("This program computes the monthly and total");
     System.out.println("payments for a given loan amount, annual ");
     System.out.println("interest rate, and loan period.");
     System.out.println("Loan amount in dollars and cents, e.g., 12345.50");
     System.out.println("Annual interest rate in percentage e.g., 12.75");
     System.out.println("Loan period in years, e.g., 15");
     System.out.println("\n"); //skip two lines
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
     System.out.println("Loan Amount:          " + money.format(loanAmount));
     System.out.println("Annual Interest Rate:  " + percent.format(annualInterestRate/100));
     System.out.println("Loan Period(Years):    " + loanPeriod);

     System.out.println("\n"); //skip two lines
     System.out.println("Monthly payment is  " + df.format(monthlyPayment));
     System.out.println("Total payment is  " + money.format(totalPayment));
     // System.Exit(0);
    }//End of method
}//End of class