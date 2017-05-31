//**************************************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 101
//   Instructor: John Alampi
//   Class: Prob1.java
//   Due Date: 6th May 2011
//***************************************************************************************
//   This class will take a file name from the command line. It will then ask the user
//   how many numbers should be output to the file. It will then put numbers in the file
//   and insert a new line after 10 numbers inserted.
//***************************************************************************************
//Import statements
import java.util.*;
import java.io.*;

public class Prob1{
   //---------------------------------------------------------------------------------
   //   ClASS CONSTANTS
   //---------------------------------------------------------------------------------
   
   //---------------------------------------------------------------------------------
   //   Instance Variables
   //---------------------------------------------------------------------------------
   
   //---------------------------------------------------------------------------------
   //   Main Method
   //---------------------------------------------------------------------------------
   public static void main(String [] args) throws IOException{
      //-----------------------------------------------------------------------------
      //   CONSTANTS
      //-----------------------------------------------------------------------------
      
      //-----------------------------------------------------------------------------
      //   Variables
      //-----------------------------------------------------------------------------
      int someNum;
      int maxNumOutput;
      String file = args[0];

      
      FileWriter rw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(rw);
      PrintWriter outFile = new PrintWriter(bw);
      Scanner scan = new Scanner(System.in);

      System.out.print("How many random numbers should be placed in the file?: ");
      maxNumOutput = Integer.parseInt(scan.next());
      //-------------------------------------------------------------------------------
      //   Insert random numbers [0 - 999] into the file until maxNumOutput is reached.
      //-------------------------------------------------------------------------------
      for(int i = 0; i < maxNumOutput; i++){
         if((i != 0) && (i % 10 == 0))
            outFile.println();
         someNum = (int)(Math.random() * 1000);
         outFile.print(someNum + " ");
      }//end of writeLoop

      outFile.close();
   }//end main method
}//end class Prob1
