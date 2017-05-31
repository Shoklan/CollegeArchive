//***********************************************************************************
//      Author: Collin Mitchell
//      Course: Computer Science 103
//      Instructor: John Alampi
//      Assignment: AddressBook
//      Date: October 7th, 2009
//***********************************************************************************
//***********************************************************************************
//      The purpose of this class is to create an AddressBook class. This class has
//      three instance variables, one constructor, and seven methods. The class is
//      used by the Driver to store the Objects. 
//***********************************************************************************
import java.util.*;

public class AddressBook
{
   //-------------------------------------------------------------------------------
   //   Instance Variables
   //-------------------------------------------------------------------------------
   private Vector<Object> addressList;  //Creates a Vector of type Object to store the Addresses
   ExtPerson[] list;                    //Holds an array of ExtPersons references;
   private int length;                  //The number of ExtPerson References
   
   //-------------------------------------------------------------------------------
   //   Default Constructor
   //   Creates an instance of the Vector Object reference variable addressList
   //   and sets length to 0
   //-------------------------------------------------------------------------------
   public AddressBook()
   {
      addressList = new Vector(0);
   }//end of default constructor
   
   //-------------------------------------------------------------------------------
   //   Method is used to print all the elements in the Vector
   //-------------------------------------------------------------------------------
   public void print()
   {
      ExtPerson ep;
      
      for(int i = 0; i < length; i++)
      {
         ep = (ExtPerson)(addressList.elementAt(i));
         ep.printInfo();
      }
   }//end of method print
   
   //-------------------------------------------------------------------------------
   //   Method is used to print out all the names inbetween the two strings
   //   input by the user.
   //-------------------------------------------------------------------------------
   public void printNamesBetweenLastNames(String last1, String last2)
   {
      String lName;        //Used to hold current lastName
      ExtPerson ep;
      
      for(int i = 0; i < length; i++)
      {
         ep = (ExtPerson)(addressList.elementAt(i));
         
         lName = ep.getLastName();
         if(last1.compareTo(lName) <= 0 && lName.compareTo(last2) <= 0)
            System.out.println(ep.getFirstName() + " " + ep.getLastName());
      }
   }//end of method printNamesBetweenLastNames

   //-----------------------------------------------------------------------------------
   //   Method that prints out names that have dob month the same as the parameter month
   //   This code will be invoked when the menu item 3 is selected.
   //   The code for this method is very similar to the code in the print method.
   //   After you set the reference variable ep, use the method within class ExtPerson
   //   to determine whether the current ep's month is the same as the parameters month
   //   When they are the same, print the firstName and lastName. Otherwise, go to the 
   //   next vector element.
   //-----------------------------------------------------------------------------------
   public void printNameInTheMonth(int month)
   {
 
      ExtPerson ep;
 
      for(int i = 0; i < length; i++)
      {
         ep = (ExtPerson)(addressList.elementAt(i));
         if(ep.isMonth(month) == true)
            System.out.println(ep.getFirstName() + " " + ep.getLastName());
      }
   }//end of method printNameInTheMonth
   
   //------------------------------------------------------------------------------------------------
   //   Method will be used to print out all the information concerning one Vector object
   //   This code will be invoked when menu item 2 is selected.
   //   The code for this method is very similar to the code in the print method.
   //   Postcondition: Parameter i must be less than length. When it isn't put out the error
   //   message "No such person"
   //   When i is less than lenth, set the reference variable ep to the addressList at position i
   //   Next use the appropriate method with ExtPerson to print out all this Persons information
   //-------------------------------------------------------------------------------------------------
   public void printAt(int i)
   {   
      if(i > length)
         System.err.println("No such Person.");
      else
      {
         ExtPerson ep;   
         ep = (ExtPerson)(addressList.elementAt(i));
         ep.printInfo();
      }
   }//end of method printAt
   
   //------------------------------------------------------------------------------------------------
   //   Method will search the Vector for the name the user input.
   //   This code will be invoked when menu options 1 or 2 is selected.
   //   Postcondition: If lName is found, returns the location.
   //               in the Vector where the lName is found; otherwise, returns -1.
   //------------------------------------------------------------------------------------------------
   public int search(String lName)
   {
      String lastName;
      ExtPerson ep;
 
      int loc;
      boolean found = false;
      for(loc = 0; loc < length; loc++)
      {
         ep = (ExtPerson)(addressList.elementAt(loc));
         if(ep.isLastName(lName))
         {
            found = true;
            break;
         }
      }
         if(found)
            return loc;
         else
            return -1;
    }//end of method search
   
   //------------------------------------------------------------------------------------------------
   //   Method that prints out names that have the personStatus the same as the parameter status
   //   This code will be invoked when menu option 5 is selected.
   //   The code for this method is very similar to the code in the print NameInTheMonth.
   //   After you set the reference variable ep, use the method within class ExtPerson to determine
   //   whether the current ep's personStatus is the same as the parameters status
   //   When they are the same, print the firstName and lastName. Otehrwise, go to the next Vector
   //   element.
   //------------------------------------------------------------------------------------------------
   public void printNamesWithStatus(String status)
   {
      ExtPerson ep;
      for(int i = 0; i < length; i++)
      {
         ep = (ExtPerson)(addressList.elementAt(i));
         if(ep.isStatus(status) == true)
            System.out.println(ep.getFirstName() + " " + ep.getLastName());
      }
   }//end of method printNamesWithStatus
   
   //------------------------------------------------------------------------------------------------
   //   Method that adds an element.
   //   This code will be invoked to load the AddressBook,
   //   The code for this method is very simple. Use the addElement method of the Vector class
   //   using the parameters eP and then increment the length by 1.
   //------------------------------------------------------------------------------------------------
   public void insert(ExtPerson eP)
   {
      addressList.addElement(eP);
      length++;   
   }//end of method insert
}//end of class AddressBook