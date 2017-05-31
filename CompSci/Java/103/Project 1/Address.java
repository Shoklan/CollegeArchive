//************************************************************************************
//      Name: Collin Mitchell
//      Course: Computer Science 103
//      Instructor: John Alampi
//      Assignment: Address.java
//      Due Date: September 30th, 2009
//************************************************************************************

//************************************************************************************
//      The purpose of this class is to create a class called Address. This class is 
//      comprised of four instance variables, two Constructors, and eight methods.
//      The class saves the Street Address, City, State, and Zip code.
//************************************************************************************

public class Address
{
   //--------------------------------------------------------------------------------
   //   Instance Varibales
   //--------------------------------------------------------------------------------
   private String streetAddress; //These variables are self documented
   private String city;
   private String state;
   private String zip;

   //--------------------------------------------------------------------------------
   //   Defualt Constructor
   //   Initailize streetAddress, city, state, and zip to empty Strings
   //   Postcondition: streetAddress = ""; city = ""; state = ""; zip = "";
   //--------------------------------------------------------------------------------
   public Address()
   {
      setAddress("", "", "", "");
   }//end of Default Constructor
   
   //--------------------------------------------------------------------------------
   //   Constructor with Parameters
   //   Initailize streetAddress, city, state, and zip according to parameters
   //   Postcondition: streetAddress = sAddress; city = c; state = s; zip = z;
   //--------------------------------------------------------------------------------
   public Address(String sAddress, String c, String s, String z)
   {
      setAddress(sAddress, c, s, z);
   }//end of Constructor with Parameters
   
   //--------------------------------------------------------------------------------
   //   Print Method
   //   Prints out the address
   //   PostCondition: Prints streetAddress on one line followed by city, state,
   //               and zip on the second line. The  second line is the following
   //               format: Notice the , followed by a space and the "-"
   //               before zip.
   //               Hilton Head, North Carolina - 68172
   //--------------------------------------------------------------------------------
   public void print()
   {
      System.out.println(toString());
   }//end of method print
   
   //--------------------------------------------------------------------------------
   //   toString Method
   //   Returns the streetAddres, city, state, and zip
   //   Postcondtition: Returns a String having the same streetAddress on one line
   //               followed by city, state, and zip on the second line. The
   //               second line is in the same format as in the print method
   //--------------------------------------------------------------------------------
   public String toString()
   {
      return(streetAddress + "\n" + city + ", " + state + " - " + zip);
   }//end of method toString
   
   //--------------------------------------------------------------------------------
   //   Method to set the address
   //   Data Members streetAddress, City, State, and zip are set
   //   according to the parameters
   //   Postcondition: streetAddress = sAddress; city = c; state = s; zip = z;
   //--------------------------------------------------------------------------------
   public void setAddress(String sAddress, String c, String s, String z)
   {
      streetAddress = sAddress;
      city = c;
      state = s;
      zip = z;
   }//end of method setAddress
   
   //--------------------------------------------------------------------------------
   //   Method to copy Address
   //   PostCondition: The instance variables of otherAddress are copied
   //               into the corresponding data members of this address
   //--------------------------------------------------------------------------------
   public void copyAddress(Address otherAddress)
   {
      streetAddress = otherAddress.streetAddress;
      city = otherAddress.city;
      state = otherAddress.state;
      zip = otherAddress.zip;
   }//end of method copyAddress
   
   //--------------------------------------------------------------------------------
   //   Method to get the value of Street Address
   //   PostCondition: The value of streetAddress is returned
   //--------------------------------------------------------------------------------
   public String getStreetAddress()
   {
      return streetAddress;
   }//end of method getStreetAddress
   
   //--------------------------------------------------------------------------------
   //   Method to get the value of City
   //   Postcondition: Return the value of city
   //--------------------------------------------------------------------------------
   public String getCity()
   {
      return city;
   }//end of method getCity
   
   //--------------------------------------------------------------------------------
   //   Method to get the value of State
   //   Postcondition: The value of state is returned
   //--------------------------------------------------------------------------------
   public String getState()
   {
      return state;
   }//end of method getState
   
   //--------------------------------------------------------------------------------
   //   Method to get the value of Zip Code
   //   Postcondition: Returns the value of zip
   //--------------------------------------------------------------------------------
   public String getZip()
   {
      return zip;
   }//end of method getZip
}