//****************************************************************
//      Name: Collin Mitchell
//      Course: CSC 103
//      Instructor: John Alampi
//      Assignment: Customer.java
//      Due Date: December 17th, 2009
//****************************************************************

//****************************************************************
//      |Description|
//      The purpose of this class is to create a class called Person.
//      The class has two instance variables, two constructors, and 
//      four methods. This class keeps the first name
//      and the last name of a person.
//
//****************************************************************

public class Customer extends Person
{
   
   //-------------------------------------------------------------------
   //   Constant Names
   //-------------------------------------------------------------------
   //No constants were used in this class
   
   //-------------------------------------------------------------------
   //   Instance Variable Names
   //-------------------------------------------------------------------
   private String first;
   private String last;
   private int custAccNo;      //Store acount number
   private VideoBinaryTree rentedVideoList;
   
   //-------------------------------------------------------------------
   //   Default Constuctor.
   //   Instance variables are initialized to the default values.
   //	Postcondition: first = ""; last = ""; custAcctNo = 0;
   //					rentedVideoList = new VideobinaryTree;
   //-------------------------------------------------------------------
   public Person()
   {
      setCustInfo("", "", 0);
   }//end of Default Constructor
   
   //-------------------------------------------------------------------
   //   Constructor with Parameters.
   //	Instance variables are set acccording to the parameters.
   //	Postcondition: first instance variable = first;
   //					last instance variable = last;
   //     				custAcctNo = 0;
   //					rentedVideoList = new VideobinaryTree;
   //-------------------------------------------------------------------
   public Person(String firstName, String lastName, int acctNo)
   {
      setCustInfo(firstName, lastName, 0);
   }//end of Constructor with Parameters
   
   //-------------------------------------------------------------------
   //   Method to set to set the details of a Customer.
   //	Instance variables are set according to the parameters.
   //	Postcondition: first instance variable = first;
   //					last instance variable = last;
   //     				custAcctNo = 0;
   //					rentedVideoList = new VideobinaryTree;
   //-------------------------------------------------------------------
   public void setCustInfo(String firstName, String lastName, int acctNo)
   {
      firstName = first;
      lastName = last;
	  custAcctNo = acctNo;
	  rentedVideoList = new VideoBinaryTree;
   }//end of method setCustInfo
   
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
   //	Method to search for a video.
   //	It is used to determine if a video is already checked out or
   //	when we want to return a rented video.
   //-------------------------------------------------------------------
   public boolean searchForVideo(String title)
   {
	  return(rentedVideoList.isVideoAvailable(title));
   }//End of method searchForVideo
   
   //-------------------------------------------------------------------
   //	Method to rent a video.
   //-------------------------------------------------------------------
   public void rentVideo(String title)
   {
   
		//Stub
   
	  if(searchForVideo(title))
	  {
		
		VideoElement newVideo = new VideoElement();
		newVideo.setVideoInfo(
   }//End of method rentVideo
   
   //-------------------------------------------------------------------
   //	Method to return a video.
   //-------------------------------------------------------------------
   public void returnVideo(String Title)
   {
     //Stub
   }//End of method returnVideo
   
   //-------------------------------------------------------------------
   //	Method to return the number of videos rented
   //-------------------------------------------------------------------
   public int getNoOfRentals()
   {
	  
   }//End of method getNoOfRentals
   
   //-------------------------------------------------------------------
   //	Returns the account number of the Customer.
   //	Postcondtition: The value of the instance variable custAcctNo is
   //					returned.
   //-------------------------------------------------------------------
   public int getAcctNo()
   {
     return custAcctNo;
   }//End of method getAcctNo
   
   //-------------------------------------------------------------------
   //	Method to print the title of the video that was rented.
   //-------------------------------------------------------------------
   public void printRentedVideo()
   {
     //Stub
   }//End of method printRentedVideo
    
   //-------------------------------------------------------------------
   //	To String Method.
   //	Returns a String in the following format: custAcctNo, a blank,
   //	firstname, a blank, lastname, a blank, and the number of videos
   //	this customer has rented.
   //-------------------------------------------------------------------
   public String toString()
   {
      return(getAcctNo() + " " + getFirstName() + " " + getLastName() /*Stub*/ );
   }//end of method toString
   
   //-------------------------------------------------------------------
   //	To String Method.
   //	Returns a String in the following format: custAcctNo, a blank,
   //	firstname, a blank, lastname, a blank, and the number of videos
   //	this customer has rented.
   //-------------------------------------------------------------------
   public void print()
   {
     System.out.println(getAcctNo() + " " + getFirstName() + " " + getLastName() /*Stub*/ );
   }//End of method print
   
   
  //---------------------------------------------------------------------
   //	Method to determine if two account numbers are the same.
   //	Postcondition: Returns the value true if custAcctNo is the same
   //					as the custAcctNo of the Customer; false otherwise
   //---------------------------------------------------------------------
   public boolean equals(DataElement other)
   {
     Video Element temp = (VideoElement)other;
     return( other.getAcctNo() == custAcctNo);
   }//End of method equals
   
   //-------------------------------------------------------------------
   //	Method to compare two account numbers.
   //	Postcondition: Returns the value less than zero if custAcctNo is
   //					less than the custAcctNo of the Customer; zero
   //					if the are the same and a value greater than
   //					zero is custAcctNo is greater than the custAcctNo
   //					of the Customer
   //-------------------------------------------------------------------
   public int compareTo(DataElement other)
   {
     VideoElement temp = (VideoElement)other;
	 return(temp.getAcctNo() - custAcctNo);
   }//End if method compareTo
   
   //--------------------------------------------------------------------
   //   Method to copy otherElement into this element
   //   Postcondtion: data of otherElement is copied into this object
   //--------------------------------------------------------------------
   public void makeCopy(DataElement otherElement)
   {
      VideoElement temp = (VideoElement) otherElement;
      firstName = temp.firstName;
	  lastName = temp.lastName;
	  custAcctno = temp.custAcctNo;
	  //Stub

   }//end of makeCopy method
   
   //--------------------------------------------------------------------
   //   Method to return a copy of this object
   //   Postcondition: A copy of this method is created and a reference
   //               of the copy is returned
   //--------------------------------------------------------------------
   public DataElement getCopy()
   {
      VideoElement temp = new Video Element;
      temp.firstName = firstName;
	  temp.lastName = lastName;
	  temp.custAcctNo = custAcctNo;
	  //Stub
      return temp;
   }//end of getCopy method
   
}//end of Class Person   