//************************************************************************************
//      Name: Collin Mitchell
//      Course: Computer Science 103
//      Instructor: John Alampi
//      Assignment: Date.java
//      Due Date: September 30th, 2009
//************************************************************************************

//************************************************************************************
//      The purpose of this class is to create a class callled Date.
//      The class has three instance variables, two constructors, and five methods. 
//      This class keeps the month, day, and year.
//************************************************************************************

public class Date
{
   //--------------------------------------------------------------------------------
   //   Instance Varibales
   //--------------------------------------------------------------------------------
   private int dMonth; //Variable to store the Month
   private int dDay;   //Variable to store the Day
   private int dYear;   //Variable to store the Year
   
   //--------------------------------------------------------------------------------
   //   Default Constructor
   //   Data Members dMonth, dDAy, dYear are  set to the default values
   //   Postcondition: dMonth = 1; dDay = 1; dYear = 1900;
   //--------------------------------------------------------------------------------
   public Date()
   {
      setDate(1, 1, 1990);
   }//end of Default Constructor
   
   //--------------------------------------------------------------------------------
   //   Constructor to set the Date
   //   Data members dMonth, dDay, and dYear are set according to the parameters.
   //   Postcondition: dMonth = month; dDay = day; dYear = year;
   //--------------------------------------------------------------------------------
   public Date(int month, int day, int year)
   {
      setDate(month, day, year);
   }//end of Constructor with parameters
   
   //--------------------------------------------------------------------------------
   //   Method to set the Date
   //   Data memebers dMonth, dDay, and dYear are set according to the parameters.
   //   Postcondition: dMonth = month; dDay = day; dYear = year;
   //--------------------------------------------------------------------------------
   public void setDate(int month, int day, int year)
   {
      dMonth = month;
      dDay = day;
      dYear = year;
   }//end of method setDate
   
   //--------------------------------------------------------------------------------
   //   Method to return the Donth
   //   Postcondition: The value of dMonth is returned.
   //--------------------------------------------------------------------------------
   public int getMonth()
   {
      return dMonth;
   }//end of method getMonth
   
   //--------------------------------------------------------------------------------
   //   Method to return the Day
   //   Postconditiom: The value of dDay is returned
   //--------------------------------------------------------------------------------
   public int getDay()
   {
      return dDay;
   }//end of method getDay
   
   //--------------------------------------------------------------------------------
   //   Method to return the Year
   //   Postcondition: The value of dYear is returned
   //--------------------------------------------------------------------------------
   public int getYear()
   {
      return dYear;
   }//end of method getYear
   
   //--------------------------------------------------------------------------------
   //   Method to return the Month, Day, and Year as a String
   //   Postcondition: All of the instance variables are returned and in the
   //               format "mm-dd-yyyy".
   //--------------------------------------------------------------------------------
   public String toString()
   {
      return(dMonth + "-" + dDay + "-" + dYear);
   }//end of method toString
}//end of Class Date