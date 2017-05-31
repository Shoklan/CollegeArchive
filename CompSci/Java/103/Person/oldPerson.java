//****************************************************************
//				Name: Collin Mitchell
//				Course: CSC 103
//				Instructor: John Alampi
//				Assignment: Person Class
//				Due Date: September 17, 2009
//****************************************************************

//****************************************************************
//				|Description|
//  The purpose of this class is to create a class called Person.
//  The class has two instance variables, two constructors, and 
//	four methods. This class keeps the first name and the last
//	name for customers.
//
//****************************************************************

public class Person
{
	
	//-------------------------------------------------------------------
	//				|Constant Names|
	//-------------------------------------------------------------------
	//No constants were used in this class
	
	//-------------------------------------------------------------------
	//				|Instance Variable Names|
	//-------------------------------------------------------------------
	private String lastName;
	private String firstName;
	
	//-------------------------------------------------------------------
	//  Default Constuctor.
	//	Initialize firestName and lastName to empty strings.
	//  Precondition: Input cannot be a number of any kind.
	//  Postcondition: firstName = ""; lastName = "";
	//-------------------------------------------------------------------
	public Person()
	{
		setName("", "");
	}
	
	//-------------------------------------------------------------------
	//  Constructor with Parameters.
	//	Set firstName and lastName according to the parameters.
	//	Precondition: The input entered must be a String.
	//	Postcondition: firstName = first; lastName = last;
	//-------------------------------------------------------------------
	public Person( String first, String last)
	{
		setName(first, last);
	}
	//-------------------------------------------------------------------
	//	Method to set firstName and lastName according to the parameters.
	//	Precondition: The input entered must be a legitimate string.
	//	Postcondition: firstName = first; lastName = last;
	//-------------------------------------------------------------------
	public void setName(String first, String last)
	{
		firstName = first;
		lastName = last;
	}
	
	//-------------------------------------------------------------------
	//	Method to return the first name.
	//	Postcondition: The value of firstName is returned.
	//-------------------------------------------------------------------
	public String getFirstName()
	{
		return firstName;
	}
	
	//-------------------------------------------------------------------
	//	Method to return the last name.
	//	Postcondition: The Value of the lastName is returned.
	//-------------------------------------------------------------------
	public String getLastName()
	{
		return lastName;
	}
	
	//-------------------------------------------------------------------
	//	Method to output the first name and last name in the form
	//	firstNAme lastName.
	//-------------------------------------------------------------------
	public String toString()
	{
		return firstName + " " + lastName;
	}
}
	