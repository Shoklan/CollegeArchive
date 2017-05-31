//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class Clock
//           Due Date:  September 17, 2009
//
//************************************************

//****************************************************************
//Program to demonstrate the Static Modifier
//****************************************************************

import java.io.*;

public class Illustrate
{

      //--------------------------------------------------------
      //   Instance Variables  
      //--------------------------------------------------------

       private int x;                                        
       public static int y;                                      
       public static int count;                                                                

      //--------------------------------------------------------
      //   Constructor with No parameters  
      //--------------------------------------------------------
      public Illustrate()
      {
        x=0;
      } 


      //--------------------------------------------------------
      //   Constructor with parameters  
      //--------------------------------------------------------
      public Illustrate(int a)
      {
        x=a;
      } 

      //--------------------------------------------------------
      //   Print Method  
      //--------------------------------------------------------
      public void print()
      {
        System.out.println("x = " + x
			+ ", y = " + y
			+ ", count = " + count);            
      } 

      //--------------------------------------------------------
      //   Increment Count Method  
      //--------------------------------------------------------
      public static void incrementCount()
      {
         count++;            
      } 
   
}
