//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class Clock
//           Due Date:  September 17, 2009
//
//************************************************

//****************************************************************
//Class to test the various operations of the class Clock
//****************************************************************

import java.io.*;

public class TestProgClock
{

   
    public static void main(String[] args) throws IOException
    {
      //-----------------------------------------------------------------
      //  The following code sets up a text input stream from standard
      //  input
      //-----------------------------------------------------------------
 
      BufferedReader stdin = new BufferedReader
	(new InputStreamReader(System.in));
    



      //--------------------------------------------------------
      //   Object Declarations  
      //--------------------------------------------------------
       Clock myClock = new Clock(5,4,30);                //Line 1
       Clock yourClock = new Clock();            	 //Line 2

      //--------------------------------------------------------
      //   Variables  
      //--------------------------------------------------------

       int hours;                                        //Line 3
       int minutes;                                      //Line 4
       int seconds;                                      //Line 5

       System.out.print("Line 6: myClock: ");		        //Line 6
       myClock.printTime();                                     //Line 7
       System.out.println();		                        //Line 8

       System.out.print("Line 9: yourClock: ");	        //Line 9
       yourClock.printTime();	                       //Line 10
       System.out.println();	                       //Line 11
 
       yourClock.setTime(5,45,16);		       //Line 12

       System.out.print("Line 13: After setting - "
                           + "yourClock: ");	                  //Line 13
       yourClock.printTime();		                          //Line 14
       System.out.println();	                                  //Line 15

      if(myClock.equals(yourClock))                               //Line 16
        System.out.println("Line 17: Both times "
                            + "are equal.");                      //Line 17
     else				                          //Line 18
	System.out.println("Line 19: The two times "
                            + "are not equal");	                  //Line 19

        System.out.print("Line 20: Enter hours: ");	          //Line 20
        System.out.flush();                                       //Line 21
        hours = Integer.parseInt(stdin.readLine());               //Line 22
        System.out.println();                                     //Line 23

        System.out.print("Line 24: Enter minutes: ");	          //Line 24
        System.out.flush();                           	          //Line 25
        minutes = Integer.parseInt(stdin.readLine());             //Line 26
        System.out.println();                                     //Line 27

        System.out.print("Line 28: Enter seconds: ");	          //Line 28
        System.out.flush();                                       //Line 29
	seconds = Integer.parseInt(stdin.readLine());             //Line 30
        System.out.println();                                     //Line 31

        myClock.setTime(hours,minutes,seconds);		          //Line 32

        System.out.print("Line 33: New myClock: ");	          //Line 33
        myClock.printTime();                                      //Line 34
        System.out.println();	                                  //Line 35

        myClock.incrementSeconds();		                  //Line 36

        System.out.print("Line 37: After incrementing "
                         + "the clock by one second, "
                         + "myClock: ");                          //Line 37
        myClock.printTime();		                          //Line 38
        System.out.println();		                          //Line 39

        yourClock.makeCopy(myClock);                              //Line 40
        System.out.print("Line 41: After copying "
                       + "myClock: into yourClock; "
                       + "yourClock: ");	                  //Line 41
        yourClock.printTime();				          //Line 42
        System.out.println();				          //Line 43
    }//end main
}
