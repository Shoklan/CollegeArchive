//**************************************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 101
//   Instructor: John Alampi
//   Class: Histogram.java
//   Due Date: April 12th 2011
//***************************************************************************************
//   This program will take input from the user. It will check the numbers for what range
//   they are in. It will then increment the number stored in the array for that range.
//   Finally, it will print out a Histogram of the array information.
//***************************************************************************************
//Import statements
import java.util.*;

class Histogram{
   //---------------------------------------------------------------------------------
   //   CLASS CONSTANTS
   //---------------------------------------------------------------------------------
   
   //---------------------------------------------------------------------------------
   //   Instance Variables
   //---------------------------------------------------------------------------------
   
   //---------------------------------------------------------------------------------
   //   Main Method
   //---------------------------------------------------------------------------------
   public static void main(String [] args){
      //-----------------------------------------------------------------------------
      //   CONSTANTS
      //-----------------------------------------------------------------------------
      
      //-----------------------------------------------------------------------------
      //   Variables
      //-----------------------------------------------------------------------------
      int[] trackArray = new int[10];
      int num;
      int remaining;
      String userInput;
      
      Scanner scan = new Scanner(System.in);
      
      
      System.out.println("Enter some numbers between 1 and 100.");
      System.out.println("Signal the end by entering a number out of that range.");
      num = Integer.parseInt(scan.next());
      while(num > 0 && num < 101)
      {
         trackArray[(num - 1) / 10]++;            
         num = Integer.parseInt(scan.next());
      }//end of while loop
      
      System.out.println();
      for(int i = 0; i < trackArray.length; i++)
      {
         if(i == 0)
            System.out.print(" ");
         System.out.print((i * 10 + 1) + " - " + (i + 1) * 10);
         if(i < 9)
            System.out.print("  |");
         else
            System.out.print(" |");

         for(int j = 1; j <= trackArray[i]; j++)
         {
          System.out.print("*");
         }
         
         System.out.println();
      }

      System.out.println("          ---------------------------------------------------");
      System.out.println("                                 FREQUENCY                   ");
   }//end main method
}//end 
