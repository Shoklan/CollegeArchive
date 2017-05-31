//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class Clock
//           Due Date:  September 17, 2009
//
//************************************************
//****************************************************************
// The purpose of this class is to create a class called
// Clock.  This class has 11 methods and three instance
// variables
//****************************************************************


public class Clock
{
   //-----------------------------------------
   //   CONSTANTS
   //-----------------------------------------


   //-----------------------------------------
   //   Instance Variables
   //-----------------------------------------

    private int hr;  //store hours
    private int min; //store minutes
    private int sec; //store seconds


    //------------------------------------------------------------------------------- 
    //Constructor with parameters, to set the time
    //The time is set according to the parameters
    //Postcondition: hr = hours; min = minutes; sec = seconds
    //--------------------------------------------------------------------------------
   public Clock(int hours, int minutes, int seconds)
   {
      setTime(hours, minutes, seconds);
   }



    //------------------------------------------------------------ 
    //Default constructor
    //Postcondition: hr = 0; min = 0; sec = 0
    //------------------------------------------------------------ 
    public Clock()
    {
      setTime(0, 0, 0);
    }





   //------------------------------------------------------------------------------- 
   //Method to set the time
   //The time is set according to the parameters
   // Parameters:  hours – the hour of time from 0 to 24, 
   //                     minutes – the minutes from 0 to 60
   //                     seconds – the seconds from 0 to 60
   //
   //Postcondition: hr = hours; min = minutes; sec = seconds
   //------------------------------------------------------------------------------- 
   public void setTime(int hours, int minutes, int seconds)
   {
     if(0 <= hours && hours < 24)
        hr = hours;
     else
       hr = 0;
     
    if(0 <= minutes && minutes < 60)
       min = minutes;
    else
      min = 0;

    if(0 <= seconds && seconds < 60)
      sec = seconds;
    else
      sec = 0;
   }











}//end of class Clock

