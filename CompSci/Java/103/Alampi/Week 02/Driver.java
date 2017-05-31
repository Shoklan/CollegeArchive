//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Example
//           Due Date:  September 17, 2009
//
//************************************************

//****************************************************************
//Program to demonstrate the Static Modifier
//****************************************************************

import java.io.*;

public class Driver
{

      //--------------------------------------------------------
      //   Instance Variables  
      //--------------------------------------------------------

      //--------------------------------------------------------
      //   Constructor with No parameters  
      //--------------------------------------------------------
      public static void main(String[] args)
      {
        Illustrate illusObject1 = new Illustrate(3);
   //     Illustrate illusObject2 = new Illustrate(5);


	Illustrate.incrementCount();
	Illustrate.y++;
        System.out.println("y = " + Illustrate.y + "  Count = " + Illustrate.count);


	Illustrate.incrementCount();
	Illustrate.y++;
        System.out.println("y = " + Illustrate.y + "  Count = " + Illustrate.count);

	System.out.println(illusObject1.y);


//        illusObject1.print();

        


      } 

   
}
