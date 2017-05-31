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
//  The class has three instance variables, two constructors, and 
//	ten methods. This class keeps the first name, middle name,
//	and the last name for customers.
//
//****************************************************************

public class Person2
{
	
	//-------------------------------------------------------------------
	//				|Constant Names|
	//-------------------------------------------------------------------
	//No constants were used in this class
	
	//-------------------------------------------------------------------
	//				|Instance Variable Names|
	//-------------------------------------------------------------------
	private String lastName;
	private String middleName;
	private String firstName;
	
	//-------------------------------------------------------------------
	//  Default Constuctor.
	//	Initialize firestName and lastName to empty strings.
	//  Precondition: Input cannot be a number of any kind.
	//  Postcondition: firstName = ""; lastName = "";
	//-------------------------------------------------------------------
	public Person2()
	{
		setName("", "", "");
	}
	
	//-------------------------------------------------------------------
	//  Constructor with Parameters.
	//	Set firstName and lastName according to the parameters.
	//	Precondition: The input entered must be a String.
	//	Postcondition: firstName = first; lastName = last;
	//-------------------------------------------------------------------
	public Person2( String first, String middle, String last)
	{
		setName(first, middle, last);
	}
	//-------------------------------------------------------------------
	//	Method to set firstName and lastName according to the parameters.
	//	Precondition: The input entered must be a legitimate string.
	//	Postcondition: firstName = first; lastName = last;
	//-------------------------------------------------------------------
	public void setName(String first, String middle, String last)
	{
		firstName = first;
		middleName = middle;
		lastName = last;
	}
	
	//-------------------------------------------------------------------
	//	Method to set the middleName according to the parameters.
	//	Precondition: The input entered must be a legitimate string.
	//	Postcondition: middleName = middle;
	//-------------------------------------------------------------------
	public void setMiddleName(String middle)
	{
		middleName = middle;
	}
	
	//-------------------------------------------------------------------
	//	Method to set the firstName according to the parameters.
	//	Precondition: The input entered must be a legitimate string.
	//	Postcondition: firstName = first;
	//-------------------------------------------------------------------
	public void setFirstName(String first)
	{
		firstName = first;
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
	//	Method to return the middle name.
	//	Postcondition: The value of middleName is returned.
	//-------------------------------------------------------------------
	public String getMiddleName()
	{
		return middleName;
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
	//	Method to output the first name, middle name, and last name in
	//	the form firstNAme middleName lastName.
	//-------------------------------------------------------------------
	public String toString()
	{
		return firstName + " " + middleName + " " + lastName;
	}
	
	//-------------------------------------------------------------------
	//	Method to compare the two lastNames.
	//	Postcondition: Returns true if objects last names are equal;
	//	otherwise returns false.
	//-------------------------------------------------------------------
	public boolean isLastName(String last)
	{
		return (lastName.equalsIgnoreCase(last));
	}
	
	//-------------------------------------------------------------------
	//	Method to compare the two firstNames.
	//	Postcondition: Returns true if objects last names are equal;
	//	otherwise returns false.
	//-------------------------------------------------------------------
	public boolean isFirstName(String first)
	{
		return (firstName.equalsIgnoreCase(first));
	}
	
	//-------------------------------------------------------------------
	//	Method to set the lastName according to the parameters.
	//	Precondition: The input entered must be a legitimate string.
	//	Postcondition: lastName = last;
	//-------------------------------------------------------------------
	public void setLastName(String last)
	{
		lastName = last;
	}
}