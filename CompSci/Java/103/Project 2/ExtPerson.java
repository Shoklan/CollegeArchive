//****************************************************************
//      Name: Collin Mitchell
//      Course: CSC 103
//      Instructor: John Alampi
//      Assignment: ExtPerson.java
//      Due Date: October 28th, 2009
//****************************************************************

//****************************************************************
//      This is a class designed to extend the functionality of
//      the Person class. It allows for the access of the Date
//      and Address classes. This class is capable of accessing,
//      manipulating, and copying of the main classes in a way
//      that assists the Person class.
//****************************************************************

public class ExtPerson extends Person
{
   //------------------------------------------------------------------------------------------------------
   //   Instance Variables
   //------------------------------------------------------------------------------------------------------
   private Address address;   //Hold the address information
   private Date dob;   //Holds the Date Of Birth information
   private String phoneNumber;   //Holds the phone number
   private String personStatus;   //Holds Family, Friend, of Business
   
   //------------------------------------------------------------------------------------------------------
   //   Default Constructor
   //   Initialize firstName, lastName, streetAddress, city, state, zip, phoneNumber
   //   and personStatus to empty Strings
   //------------------------------------------------------------------------------------------------------
   public ExtPerson()
   {
      super("","");
      dob = new Date();
      address = new Address();
      phoneNumber = "";
      personStatus = "";
   }//end of default constructor
   
   //------------------------------------------------------------------------------------------------------
   //   Constructor with Parameters
   //   Initialize firstName, lastName, streetAddress, city, state, zip, phoneNumber
   //   and personStatus to the appropriate parameters
   //------------------------------------------------------------------------------------------------------
   public ExtPerson(String fName, String lName, int month, int day, int year, String street, String c, 
      String s, String z, String phone, String pStatus)
   {
      super(fName, lName);
      dob = new Date(month, day, year);
      address = new Address(street, c, s, z);
      phoneNumber = phone;
      personStatus = pStatus;
   }//end of constructor with parameters

   //------------------------------------------------------------------------------------------------------
   //   Method to print the address information 
   //   Prints the firstName, a space, then the lastName on one line,
   //   Prints a blank line, then prints the address information
   //   Postcondition: Output in the appropriate form
   //------------------------------------------------------------------------------------------------------
   public void printAddress()
   {
      toString();
      System.out.println();
      System.out.println(address.toString());
   }//end of method printAddress
   
   //------------------------------------------------------------------------------------------------------
   //   Method to print all the information concerning a person
   //   Prints the firstName, a space, then a lastName on the next line
   //   prints dob on the next line, phoneNumber on the next line, personType on the next line and lastly 
   //   the address information.
   //   Postcondition: Output in the appropriate form
   //------------------------------------------------------------------------------------------------------
   public void printInfo()
   {
      System.out.println(toString());
      System.out.println("Date Of Birth: " + dob.toString());
      System.out.println("Phone Number: " + phoneNumber);
      System.out.println("Person Type: " + personStatus);
      System.out.println(address.toString());
   }//end of method printInfo

   //------------------------------------------------------------------------------------------------------
   //   Method to copy an ExtPerson object
   //   otherExtP is copied in this address
   //   Postcondition: otherExp.address information is copied into the "address" object by invoking the
   //   CopyAddress method of the object  "Address" passing it parameter otherExp.address. Set the
   //   phoneNumber to otherExtP.phoneNumber and personStatus to otherExtP.personStatus. The other ExtP dob
   //   information is also set to this objects dob.
   //------------------------------------------------------------------------------------------------------
   public void copyExtPerson(ExtPerson otherExtP)
   {
      address.copyAddress(otherExtP.address);
      phoneNumber = otherExtP.phoneNumber;
      personStatus = otherExtP.personStatus;
      dob.setDate(otherExtP.dob.getMonth(), otherExtP.dob.getDay(), otherExtP.dob.getYear());
   }//end of method copyExtPerson
   
   //------------------------------------------------------------------------------------------------------
   //   Method to compare the two lastNames
   //   Compare the last names of the current Object to the parameter lName
   //   PostCondition: Return true if lastName is equal to parameter lName; otherwise print false
   //------------------------------------------------------------------------------------------------------
   public boolean isLastName(String lName)
   {
      return(getLastName().equals(lName));
   }//end of method isLastName
   
   //------------------------------------------------------------------------------------------------------
   //   Method to return the personStatus
   //   Postcondition: Returns a value of personStatus
   //------------------------------------------------------------------------------------------------------
   public String getStatus()
   {
      return personStatus;
   }//end of method getPersonStatus
   
   //------------------------------------------------------------------------------------------------------
   //   Method to return phoneNumber
   //   Postcondition: Returns the value of phoneNumber
   //------------------------------------------------------------------------------------------------------
   public String getPhoneNumber()
   {
      return phoneNumber;
   }//end of method getPhoneNumber
   
   //------------------------------------------------------------------------------------------------------
   //   Accessor method to return the month of the person's DOB
   //------------------------------------------------------------------------------------------------------
   public int getMonth()
   {
      return dob.getMonth();
   }//end of method getMonth
   
   //------------------------------------------------------------------------------------------------------
   //   Accessor method to return the day of the person's DOB
   //------------------------------------------------------------------------------------------------------
   public int getDay()
   {
      return dob.getDay();
   }//end of method getDay

   //------------------------------------------------------------------------------------------------------
   //   Accessor method to return the year of the person's DOB
   //------------------------------------------------------------------------------------------------------
   public int getYear()
   {
      return dob.getYear();
   }//end of method getYear

   //------------------------------------------------------------------------------------------------------
   //   Accessor method to return the streetAddress for the person's Address
   //------------------------------------------------------------------------------------------------------
   public String getStreetAddress()
   {
      return address.getStreetAddress();
   }//end of method getStreetAddress
   
   //------------------------------------------------------------------------------------------------------
   //   Accessor method to return the city for the person's City
   //------------------------------------------------------------------------------------------------------
   public String getCity()
   {
      return address.getCity();
   }//end of method getCity
   
   //------------------------------------------------------------------------------------------------------
   //   Accessor methdo to return the state for the person's State
   //------------------------------------------------------------------------------------------------------
   public String getState()
   {
      return address.getState();
   }//end of method getState
   
   //------------------------------------------------------------------------------------------------------
   //   Accessor to return the zip for the peron's Zip
   //------------------------------------------------------------------------------------------------------
   public String getZip()
   {
      return address.getZip();
   }//end of method getZip
   
   //------------------------------------------------------------------------------------------------------
   //   Method to copy otherElement into this element
   //   Postcondition: data of otehrElement is copied into this object
   //------------------------------------------------------------------------------------------------------
   public void makeCopy(DataElement otherElement)
   {
      ExtPerson temp = (ExtPerson) otherElement;
      setName(temp.getFirstName(), temp.getLastName());
      address.copyAddress(temp.address);
      
      dob.setDate(temp.dob.getMonth(), temp.dob.getDay(), temp.dob.getYear());
      
      phoneNumber = temp.phoneNumber;
      personStatus = temp.personStatus;
   }//end of method makeCopy
   
   //------------------------------------------------------------------------------------------------------
   //   Method to return a copy of this object.
   //   Postcondition: A copy of this object is created and a reference is returned
   //------------------------------------------------------------------------------------------------------
   public DataElement getCopy()
   {
      ExtPerson person = new ExtPerson();
      person.setName(this.getFirstName(), this.getLastName());
      person.address.copyAddress(this.address);
      
      person.dob.setDate(this.dob.getMonth(), this.dob.getDay(), this.dob.getYear());
      
      person.phoneNumber = this.phoneNumber;
      person.personStatus = this.personStatus;
      
      return person;
   }//end of method getCopy
   
   //------------------------------------------------------------------------------------------------------
   //   Method to comapare the two person Statuses
   //   Compare the status of the current object to the parameter status
   //   Postcondition: Returns true if this personStatus is equal to the parameter status; otherwise returns 
   //               false
   //------------------------------------------------------------------------------------------------------
   public boolean isStatus(String status)
   {
      return(personStatus.equals(status));
   }//end of method isStatus
   
   //------------------------------------------------------------------------------------------------------
   //   Method to compare the two Date of Births
   //   Compare the dob of the current object's month, day, and year to the parameters month, day, and year
   //   Postcondition: Returns true if the current dob's month, day, and year is equal to parameters month,
   //               day, and year; otherwise return false.
   //------------------------------------------------------------------------------------------------------
   public boolean isDOB(int month, int day, int year)
   {
      return(dob.getMonth() == month && dob.getDay() == day && dob.getYear() == year);
   }//end of method isDOB
   
   //------------------------------------------------------------------------------------------------------
   //   Method to compare the month
   //   Compare the month of the current object's month to the parameter month
   //   Postcondition: Return true if current dob's month is equal to parameter month; otherwise return
   //               false
   //------------------------------------------------------------------------------------------------------
   public boolean isMonth(int month)
   {
      return(dob.getMonth() == month);
   }//end of method isMonth
   
   //------------------------------------------------------------------------------------------------------
   //   setInfo Method
   //   Set firstName, lastName, streetAddress, city, state, zip, dMonth, dDay, dYear, phoneNumber, and
   //   personStatus to the appropriate parameters
   //------------------------------------------------------------------------------------------------------
   public void setInfo(String fName, String lName, int month, int day, int year, String street, String c, String s, String z, String phone, String pStatus)
   {
      setName(fName, lName);
      dob = new Date(month, day, year);
      address = new Address(street, c, s, z);
      phoneNumber = phone;
      personStatus = pStatus;
   }//end of method setInfo
}//end of class ExtPerson
   