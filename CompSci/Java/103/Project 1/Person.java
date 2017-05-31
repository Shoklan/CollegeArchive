//****************************************************************
//      Name: Collin Mitchell
//      Course: CSC 103
//      Instructor: John Alampi
//      Assignment: Person Class
//      Due Date: September 30, 2009
//****************************************************************

//****************************************************************
//      |Description|
//      The purpose of this class is to create a class called Person.
//      The class has two instance variables, two constructors, and 
//      four methods. This class keeps the first name
//      and the last name of a person.
//
//****************************************************************

public class Person
{
   
   //-------------------------------------------------------------------
   //   Constant Names
   //-------------------------------------------------------------------
   //No constants were used in this class
   
   //-------------------------------------------------------------------
   //   Instance Variable Names
   //-------------------------------------------------------------------
   private String lastName;
   private String firstName;
   
   //-------------------------------------------------------------------
   //   Default Constuctor.
   //   Initialize firstName, middleName, and lastName to empty strings.
   //   Precondition: Input must be a String.
   //   Postcondition: firstName = "";              
   //                  lastName = "";
   //-------------------------------------------------------------------
   public Person()
   {
      setName("", "");
   }//end of Default Constructor
   
   //-------------------------------------------------------------------
   //   Constructor with Parameters.
   //   Set firstName and lastName according to the 
   //      parameters.
   //   Parameters: firstName - The first name of the Person
   //               lastName - The last name of the Person.
   //   Precondition: The input entered must be a String.
   //   Postcondition: firstName = first;
   //                  lastName = last;
   //-------------------------------------------------------------------
   public Person( String first, String last)
   {
      setName(first, last);
   }//end of Constructor with Parameters
   
   //-------------------------------------------------------------------
   //   Method to set firstName and lastName according
   //      to the parameters.
   //   Parameters: firstName - The first name of the Person
   //            lastName - The last name of the Person.
   //   Precondition: The input entered must be a string.
   //   Postcondition: firstName = first;
   //                  lastName = last;
   //-------------------------------------------------------------------
   public void setName(String first, String last)
   {
      firstName = first;
      lastName = last;
   }//end of method setName
   
   //-------------------------------------------------------------------
   //   Method to return the first name.
   //   Return Condition: The value of firstName is returned.
   //-------------------------------------------------------------------
   public String getFirstName()
   {
      return firstName;
   }//end of method getFirstName
   
   //-------------------------------------------------------------------
   //   Method to return the last name.
   //   Return Condition: The value of lastName is returned.
   //-------------------------------------------------------------------
   public String getLastName()
   {
      return lastName;
   }//end of method getLastName
   
   //-------------------------------------------------------------------
   //   Method to output the first name, middle name, and last name in
   //   the form firstNAme middleName lastName.
   //   Return Condition: The full name of the Person as a String.
   //-------------------------------------------------------------------
   public String toString()
   {
      return (firstName + " " + lastName);
   }//end of method toString
}//end of Class Person
