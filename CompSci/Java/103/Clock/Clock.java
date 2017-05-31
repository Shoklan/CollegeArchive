//*****************************************************
//           Name: Collin Mitchell
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Assignment:  Class Clock
//           Due Date:  September 15, 2009
//
//*****************************************************

//*****************************************************
//					|Description|
//  The propose of this class is to create a class 
//  called Clock.  This class has 11 methods and
//  three instance variables. This class preserves
//  the time in the defined object. The clock is set
//  to use military time. The class allows a
//  user or another program to interact with the object
//  using the methods provided.
//*****************************************************
import java.lang.System.*;

public class Clock
{
  
   //------------------------------------------------------------------
   //               CONSTANT NAMES
   //------------------------------------------------------------------
   //No constants were used in this program.

   //------------------------------------------------------------------
   //               VARIABLE NAMES
   //------------------------------------------------------------------
   private int hr;  //store hours
   private int min;  //store monutes
   private int sec;  //store seconds

   //------------------------------------------------------------------
   // Default Constructor.
   // Precondition: Input cannot be negative.
   //				-Hours cannot be greater than 23.
   //				-Minutes cannot be greater than 59.
   //				-Seconds cannot be greater than 59.
   // Postcondition:  hr=0; min=0; sec=0. 
   //------------------------------------------------------------------
	public Clock()
	{
		setTime(0,0,0);
	}//end of the Default Constructor

   //------------------------------------------------------------------
   // Constructor with parameters, to set the time.
   // The time is set according to the parameters.
   // Parameters:  hours – the hour of time from 0 to 24, 
   //                      minutes – the minutes from 0 to 60
   //                     seconds – the seconds from 0 to 60
   // Precondition: Input must be an integer and must not be negative.
   // Postcondition: hr = hours; min = minutes; sec = seconds. 
   //------------------------------------------------------------------
    public Clock(int hours, int minutes, int seconds)
	{
		setTime(hours, minutes, seconds);
	}//end of Constructor with parameters

   //---------------------------------------------------------------------
   // Method to set the time. The time is set according to the parameters
   // Parameters:  hours – the hour of time from 0 to 24, 
   //                      minutes – the minutes from 0 to 60
   //                      seconds – the seconds from 0 to 60
   // Precondition: Input must be an integer.
   //				-Input cannot exceed the expected range.
   //				-Input cannot be negative.
   // Postcondition: hr = hours; min = minutes; sec = seconds
   //---------------------------------------------------------------------
  
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
    }//end of method setTime
	
	//---------------------------------------------------------------------
	// Method to return the Hours.
	// Returns Condition: the value of hr is returned.
	//---------------------------------------------------------------------
   
	public int getHours(int hr)
	{
		return hr;
	}//end of method getHours
	
	//---------------------------------------------------------------------
	// Method to return the Minutes.
	// Returns Condition: the value of min is returned.
	//---------------------------------------------------------------------
	public int getMinutes(int min)
	{
		return min;
	}//end of method getMinutes
	
	//---------------------------------------------------------------------
	// Method to return the Seconds.
	// Returns Condition: the value of sec is returned.
	//---------------------------------------------------------------------
	public int getSeconds(int sec)
	{
		return sec;
	}//end of method getSeconds
	
	//---------------------------------------------------------------------
	// Method to print the time.
	// Postcondition: Time is printed in the form of hh:mm:ss
	//---------------------------------------------------------------------
	public void printTime()
	{
		if(hr < 10)	
			System.out.print("0");
		System.out.print(hr + ":");
		
		if(min < 10)
			System.out.print("0");
		System.out.print(min + ":");
		
		if(sec < 10)
			System.out.print("0");
		System.out.print(sec);
		
	}//end of method printTime
	
	//---------------------------------------------------------------------
	// Method to incrememnt the time by one second.
	// Postcondition: The time in incremented by one second
	//				  If before the before-incrememnt time is 23:59:59,
	//				  the time is reset to 00:00:00.
	//---------------------------------------------------------------------
	public void incrementSeconds()
	{
		sec++;
		if (sec > 59 )
		{
				sec = 0;
				incrementMinutes();
		}
	}//end of method incrementSeconds
	
	//---------------------------------------------------------------------
	// Method to incrememnt the time by one minute.
	// Postcondition: The time in incremented by one minute
	//				  If before the before-incrememnt time is 23:59:53,
	//				  the time is reset to 00:00:53.
	//---------------------------------------------------------------------
	public void incrementMinutes()
	{
		min++;
		if (min > 59)
		{
			min = 0;
			incrementHours();
		}
	}//end of method incrementMinutes
	
	//---------------------------------------------------------------------
	// Method to incrememnt the time by one hour.
	// Postcondition: The time in incremented by one hour
	//				 If before the before-incrememnt time is 03:45:53,
	//				 the time is reset to 04:45:53.
	//---------------------------------------------------------------------
	public void incrementHours()
	{
		hr++;
		if (hr > 23)
		{
			hr = 0;
		}
	}//end of method incrementHours
	
	//---------------------------------------------------------------------
	// Method to compare the two times.
	// Parameters: otherClock - an instance of the Clock Class. Used to
	//			  compare against the current instance of clock.
	// Precondition: Must pass a Clock object to the method.
	// Postcondition: Returns true if this time is equal to otherTime;
	//				 otherwise returns false.
	//---------------------------------------------------------------------
	
	public boolean equals( Clock otherClock )
	{
		return (hr == otherClock.hr && min == otherClock.min && sec == otherClock.sec);
	}//end of method equals
	
	//---------------------------------------------------------------------
	// Method to copy time.
	// Parameters: otherClock - an instance of the Clock Class. Used to 
	//			   compare against the current instance of clock.
	// Precondition: Must pass a Clock object to the method.
	// Postcondition: The instance variables of otherTime are copied into 
	//			    the corresponding data members of this time.
	//			hr = otherTime.hr; min = otherTime.min; sec = otherTime.sec
	//---------------------------------------------------------------------
	public void makeCopy(Clock otherClock)
	{
		hr = otherClock.hr;
		min = otherClock.min;
		sec = otherClock.sec;
	}//end of method makeCopy
	
	//---------------------------------------------------------------------
	// Method to return a copy of time.
	// Return Condition: A copy of the object is created and a reference of 
	//					the copy is returned.
	//---------------------------------------------------------------------
	public Clock getCopy()
	{
		Clock temp = new Clock();
		temp.hr = hr;
		temp.min = min;
		temp.sec = sec;
		return temp;
	}//end of method getCopy

}//end of class Clock