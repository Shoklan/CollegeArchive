//*************************************************************************
//   Author: Collin Mitchell
//   Course: CSC 101
//   Instructor: John Alampi
//   Class: Fahr.java
//   Due Date: February 10th, 2011
//*************************************************************************
//*************************************************************************
//   This program converts Celsius to Fahrenheit
//*************************************************************************

import java.util.*;
import java.text.*;

public class Fahr{
   public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat(",###.00");
      
      //---------------------------------------------------------------------
      //   CONSTANTS
      //---------------------------------------------------------------------
   
      //---------------------------------------------------------------------
      //   VARIABLES
      //---------------------------------------------------------------------
      double fahrenheit, celsius;
      String userInput;
   
      //----------------------------------------------------------------------
      //   Describe the program
      //----------------------------------------------------------------------
      System.out.println("This program will take a number and convert that number from Celsius to Fahrenheit.");
      System.out.println("The formula used for this conversion is \"Fahrenheit = 1.8 * Celsius + 32\"");
   
      //----------------------------------------------------------------------
      //   Get input from the user
      //----------------------------------------------------------------------
      System.out.print("Enter temperature in celsius?: ");
      userInput = scan.next();
      celsius = Double.parseDouble(userInput);
   
      //----------------------------------------------------------------------
      //   Convert Celsius to Fahrenheit
      //----------------------------------------------------------------------
      fahrenheit = 1.8 * celsius + 32;
   
      //----------------------------------------------------------------------
      //   Output the result to the user
      //----------------------------------------------------------------------
      System.out.println("\nInput:   " + df.format(celsius) + "C\n" + 
                         "       is equivialent to");
      System.out.println("Output: " + df.format(fahrenheit) + "F");
   }
}