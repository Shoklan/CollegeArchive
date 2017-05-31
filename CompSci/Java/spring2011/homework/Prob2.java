//**************************************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 101
//   Instructor: John Alampi
//   Class: Prob1.java
//   Due Date: 6th May 2011
//***************************************************************************************
//   This class will take a file name from the command line. It will then store the data
//   into an array while comparing the values against a min and max from the data.
//   Finally, it will average all of the random numbers read in from the file.
//***************************************************************************************
//Import statements
import java.util.*;
import java.io.*;
import java.text.*;

public class Prob2{
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
      int count = 0;
      int max = (int)Double.NEGATIVE_INFINITY;
      int min = (int)Double.POSITIVE_INFINITY;
      double sum = 0;
      double average;
      String line;
      String file = args[0];

      DecimalFormat df = new DecimalFormat("##.00");
      FileReader fr = new FileReader(file);
      BufferedReader inFile = new BufferedReader(fr);

      //-----------------------------------------------------------------------------
      //   Declare the beginning of the loop to the user; Create the first token
      //   [Tokenizer While Loop]
      //-----------------------------------------------------------------------------
      System.out.println("The random numbers are: ");
      line = inFile.readLine();
      while(line != null){
         StringTokenizer tokenMaker = new StringTokenizer(line);

         //-----------------------------------------------------------------------------
         // Loop through the tokens until there are no more. Compare to max/min values
         // Insert numbers
         //-----------------------------------------------------------------------------
         while(tokenMaker.hasMoreTokens()){
            someNum = Integer.parseInt(tokenMaker.nextToken());
            if(someNum < min)
               min = someNum;
            if(someNum > max)
               max = someNum;

            System.out.println(someNum);
            count++;

            sum += someNum;
         }//end of hasTokens while

         line = inFile.readLine();
       }//end of tokenizer while

      inFile.close();
      
      average = sum / count;
      System.out.println();
      System.out.println("The smallest number generated was " + min);
      System.out.println("The largest number generated was " + max);
      System.out.println("\nAverage random number generated was: " + df.format(average));
   }//end main method
}//end class Prob1
