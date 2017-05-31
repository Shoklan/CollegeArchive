//***********************************************************************************
//      Author: Collin Mitchell
//      Course: Computer Science 103
//      Instructor: John Alampi
//      Assignment: AddressBook.java
//      Due Date: October 28th, 2009
//***********************************************************************************

//***********************************************************************************
//      The purpose of this class is to create an AddressBook class. This class has
//      three instance variables, one constructor, and seven methods. The class is
//      used by the Driver to store the Objects. 
//***********************************************************************************
import java.util.*;
import java.io.*;

public class AddressBook extends OrderedLinkedList
{
   //-------------------------------------------------------------------------------
   //   Instance Variables
   //-------------------------------------------------------------------------------
   
   
   //-------------------------------------------------------------------------------
   //   Default Constructor
   //   Invokes the Default Constructor of the parent class
   //-------------------------------------------------------------------------------
   public AddressBook()
   {
      super();
   }//end of default constructor
   
   //-------------------------------------------------------------------------------
   //   Print Method
   //-------------------------------------------------------------------------------
   public void print()
   {
      ExtPerson ep;
      LinkedListNode current;
      
      for(current = first; current != null; current = current.link)
      {
         ep = (ExtPerson)current.info;
         ep.printInfo();
      }
   }//end of method print
   
   //-------------------------------------------------------------------------------
   //   Method is used to print out all the names inbetween the two strings
   //   input by the user.
   //-------------------------------------------------------------------------------
   public void printNamesBetweenLastNames(String last1, String last2)
   {
      String lName;
      ExtPerson ep;
     LinkedListNode current;
      
      for(current = first; current != null; current = current.link)
      {
         ep = (ExtPerson)current.info;
         
         lName = ep.getLastName();
         if(last1.compareTo(lName) <= 0 && lName.compareTo(last2) <= 0)
            System.out.println(ep.getFirstName() + " " + ep.getLastName());
      }
     System.out.println();
   }//end of method printNamesBetweenLastNames
   
   //-----------------------------------------------------------------------------------
   //   Method that prints out names that have dob month the same as the parameter month
   //   This code will be invoked when the menu item 3 is selected.
   //   The code for this method is very similar to the code in the print method.
   //   After you set the reference variable ep, use the method within class ExtPerson
   //   to determine whether the current ep's month is the same as the parameters month
   //   When they are the same, print the firstName and lastName. Otherwise, go to the 
   //   next OrderedLinkedList element.
   //-----------------------------------------------------------------------------------
   public void printNameInTheMonth(int month)
   {
 
     ExtPerson ep;
     LinkedListNode current;
 
      for(current = first; current != null; current = current.link)
      {
         ep = (ExtPerson)current.info;
         if(ep.isMonth(month) == true)
            System.out.println(ep.getFirstName() + " " + ep.getLastName());
      }
   }//end of method printNameInTheMonth
   
   //------------------------------------------------------------------------------------------------
   //   Method will be used to print out all the information concerning one OrderedLinkedList object
   //   This code will be invoked when menu item 2 is selected.
   //   The code for this method is very similar to the code in the print method.
   //   Postcondition: Parameter i must be less than length. When it isn't put out the error
   //   message "No such person"
   //   When i is less than lenth, set the reference variable ep to the current info at position i
   //   Next use the appropriate method with ExtPerson to print out all this Persons information
   //-------------------------------------------------------------------------------------------------
   public void printAt(int i)
   {   
      if(i > length())
         System.err.println("No such Person.");
      else
      {
         ExtPerson ep;
         LinkedListNode current;
       
       current = first;
       count = 0;
       while(count != i)
      {
         count++;
         current = current.link;
      }
         ep = (ExtPerson)current.info;
         ep.printInfo();
      }
   }//end of method printAt

   //------------------------------------------------------------------------------------------------
   //   Method will search the OrderedLinkedList for the name the user input.
   //   This code will be invoked when menu options 1 or 2 is selected.
   //   Postcondition: If lName is found, returns the location.
   //               in the LinkedListClass where the lName is found; otherwise, returns -1.
   //------------------------------------------------------------------------------------------------
   public int search(String lName)
   {
      String lastName;
      ExtPerson ep;
     LinkedListNode current;
      
     int loc = 0;
      boolean found = false;
      for(current = first; current != null; current = current.link)
      {
         ep = (ExtPerson)current.info;
         if(ep.isLastName(lName))
         {
            found = true;
            break;
         }
       loc++;
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
   //   When they are the same, print the firstName and lastName. Otehrwise, go to the next
   //   LinkedListClass element.
   //------------------------------------------------------------------------------------------------
   public void printNamesWithStatus(String status)
   {
      ExtPerson ep;
     LinkedListNode current;
     
      for(current = first; current != null; current = current.link)
      {
         ep = (ExtPerson)current.info;
         if(ep.isStatus(status) == true)
            System.out.println(ep.getFirstName() + " " + ep.getLastName());
      }
     System.out.println();
   }//end of method printNamesWithStatus

   //------------------------------------------------------------------------------------------------
   //   Method that adds an element.
   //   This code will be invoked to load the AddressBook,
   //   The code for this method is very simple. Use the insertNode method of the OrderedLinkdList
   //   class using the parameters eP.
   //------------------------------------------------------------------------------------------------
   public void insert(ExtPerson eP)
   {
      //addressList.insertNode(eP);
     insertNode(eP);
      count++;
   }//end of method insert
   
   //-------------------------------------------------------------------------------------------------
   //   Method that prints information of a person with the lName parameter
   //-------------------------------------------------------------------------------------------------
   public void printInfoOf(String lName)
   {
     ExtPerson ep;
     int i = search(lName);
     
     if( i != -1)
      printAt(i);
     else
      System.out.println(lName + " is not in the address book.");
   }//end of method printInfoOf
   
   
   //-------------------------------------------------------------------------------------------------
   //   Method that saves all data from the OrderedLinkedList to an output file
   //-------------------------------------------------------------------------------------------------
   public void saveData(PrintWriter outFile)
   {
      ExtPerson ep;
      LinkedListNode current = first;
      
      String firstName;
      String lastName;
      String street;
      String city;
      String state;
      String zip;
      String phone;
      String pStatus;
      
      int month;
      int day;
      int year;
      
      for(current = first; current != null; current = current.link)
      {
         ep = (ExtPerson)current.info;
         
         firstName = ep.getFirstName();
         lastName = ep.getLastName();
         month = ep.getMonth();
         day = ep.getDay();
         year = ep.getYear();
         street = ep.getStreetAddress();
         city = ep.getCity();
         state = ep.getState();
         zip = ep.getZip();
         phone = ep.getPhoneNumber();
         pStatus = ep.getStatus();
         
         outFile.println(firstName + " " + lastName);
         outFile.println(day + " " + month + " " + year);
         outFile.println(street);
         outFile.println(city);
         outFile.println(state);
         outFile.println(zip);
         outFile.println(phone);
         outFile.println(pStatus);
		 
      }
	  outFile.close();
   }//end of method saveData
}//end of class AddressBook
   