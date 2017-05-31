//****************************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class PostfixDriver.java
//           Due Date:  October 21, 2009
//
//****************************************************************
//****************************************************************
// The purpose of this program is run
// InfixToPostfix class.  
//****************************************************************

import java.io.*;
import java.util.*;

public class PostfixDriver
{
   public static void main(String[] args) throws IOException,
                                            FileNotFoundException
   {
       InfixToPostfix  infixExp;
       String infix;
       BufferedReader inData = new BufferedReader
                                   (new FileReader("InfixData.txt"));
       if(inData == null)
       {
           System.out.println("Cannot open input file. Program terminates!!!");
           return ;
       }

       infix = inData.readLine();

       while(infix != null)
       {
           infixExp = new InfixToPostfix(infix);
           infixExp.showInfix();
           infixExp.showPostfix();
           System.out.println();

           infix = inData.readLine();
       }
       inData.close();
   }
}

