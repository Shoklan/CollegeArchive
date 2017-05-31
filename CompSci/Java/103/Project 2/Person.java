//****************************************************************
//      Name: Collin Mitchell
//      Course: CSC 103
//      Instructor: John Alampi
//      Assignment: Person.java
//      Due Date: October 28th, 2009
//****************************************************************

//****************************************************************
//      |Description|
//      The purpose of this class is to create a class called Person.
//      The class has two instance variables, two constructors, and 
//      four methods. This class keeps the first name
//      and the last name of a person.
//
//****************************************************************

public class Person extends DataElement
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
   
   //-------------------------------------------------------------------
   //   Method to determine if two objects contain the same data.
   //   Postcondition: Returns true if this object contains the data
   //                  of the object otherElement; otherwise it returns
   //                  false.
   //-------------------------------------------------------------------
   public boolean equals(DataElement otherElement)
   {
      Person temp = (Person) otherElement;
     return(firstName.equals(temp.firstName) && lastName.equals(temp.lastName));
   }//end of equals method
   
   //-------------------------------------------------------------------
   //   Method to compare two objects
   //   Postcondition: Returns a value < 0 is this element is less than
   //      otherElement;
   //      Returns 0 if this element is same as otherElement;
   //      Returns a value > 0 if this element is greater than otherElement
   //-------------------------------------------------------------------
   public int compareTo(DataElement otherElement)
   {
      Person temp = (Person) otherElement;
      if(lastName.compareTo(temp.lastName) == 0)
         return firstName.compareTo(temp.firstName);
      return lastName.compareTo(temp.lastName);
   }//end of compareTo method
   
   //--------------------------------------------------------------------
   //   Method to copy otherElement into this element
   //   Postcondtion: data of otherElement is copied into this object
   //--------------------------------------------------------------------
   public void makeCopy(DataElement otherElement)
   {
      Person temp = (Person) otherElement;
      lastName = temp.lastName;
      firstName = temp.firstName;
   }//end of makeCopy method
   
   //--------------------------------------------------------------------
   //   Method to return a copy of this object
   //   Postcondition: A copy of this method is created and a reference
   //               of the copy is returned
   //--------------------------------------------------------------------
   public DataElement getCopy()
   {
      Person person = new Person();
      person.lastName = lastName;
      person.firstName = firstName;
      return person;
   }//end of getCopy method
   
}//end of Class Person   