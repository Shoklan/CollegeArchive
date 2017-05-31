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
//	twelve methods. This class keeps the first name, middle name,
//	and the last name of a person.
//
//****************************************************************

public class Person3
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
	//	Initialize firstName, middleName, and lastName to empty strings.
	//  Precondition: Input must be a String
	//	Postcondition: firstName = first;
	//					middleName = middle;
	//					lastName = last;
	//-------------------------------------------------------------------
	public Person3()
	{
		setName("", "", "");
	}
	
	//-------------------------------------------------------------------
	//  Constructor with Parameters.
	//	Set firstName, middleName, and lastName according to the 
	//		parameters.
	//	Parameters: firstName - The first name of the Person
	//				middleName - The middle name of the Person.
	//				lastName - The last name of the Person.
	//	Precondition: The input entered must be a String.
	//	Postcondition: firstName = first;
	//					middleName = middle;
	//					lastName = last;
	//-------------------------------------------------------------------
	public Person3( String first, String middle, String last)
	{
		setName(first, middle, last);
	}
	
	//-------------------------------------------------------------------
	//	Method to set firstName, middleName, and lastName according
	//		to the parameters.
	//	Parameters: firstName - The first name of the Person
	//				middleName - The middle name of the Person.
	//				lastName - The last name of the Person.
	//	Precondition: The input entered must be a string.
	//	Postcondition: firstName = first;
	//				   middleName = middle;
	//				   lastName = last;
	//-------------------------------------------------------------------
	public void setName(String first, String middle, String last)
	{
		firstName = first;
		middleName = middle;
		lastName = last;
	}
	
	//-------------------------------------------------------------------
	//	Method to set the lastName according to the parameters.
	//	Parameters: last - The last name of the Person.
	//	Precondition: The input entered must be a legitimate string.
	//	Postcondition: lastName = last;
	//-------------------------------------------------------------------
	public void setLastName(String last)
	{
		lastName = last;
	}
	
	//-------------------------------------------------------------------
	//	Method to set the middleName according to the parameters.
	//	Parameters: middle - The middle name of the Person.
	//	Precondition: The input entered must be a legitimate string.
	//	Postcondition: middleName = middle;
	//-------------------------------------------------------------------
	public void setMiddleName(String middle)
	{
		middleName = middle;
	}
	
	//-------------------------------------------------------------------
	//	Method to set the firstName according to the parameters.
	//	Parameters: first - The first name of the Person.
	//	Precondition: The input entered must be a legitimate string.
	//	Postcondition: firstName = first;
	//-------------------------------------------------------------------
	public void setFirstName(String first)
	{
		firstName = first;
	}
	
	//-------------------------------------------------------------------
	//	Method to return the last name.
	//	Return Condition: The value of lastName is returned.
	//-------------------------------------------------------------------
	public String getLastName()
	{
		return lastName;
	}
	
	//-------------------------------------------------------------------
	//	Method to return the middle name.
	//	REturn Condition: The value of middleName is returned.
	//-------------------------------------------------------------------
	public String getMiddleName()
	{
		return middleName;
	}
	
	//-------------------------------------------------------------------
	//	Method to return the first name.
	//	Return Condition: The value of firstName is returned.
	//-------------------------------------------------------------------
	public String getFirstName()
	{
		return firstName;
	}
	
	//-------------------------------------------------------------------
	//	Method to output the first name, middle name, and last name in
	//	the form firstNAme middleName lastName.
	//	Return Condition: The full name of the Person as a String.
	//-------------------------------------------------------------------
	public String toString()
	{
		return firstName + " " + middleName + " " + lastName;
	}
	
	//-------------------------------------------------------------------
	//	Method to compare the two lastNames.
	//	Parameters: last - the Last name you wish to test.
	//	Precondition: The input must be a legitimate String.
	//	Return Condition: Returns true if objects last names are equal;
	//	otherwise returns false.
	//-------------------------------------------------------------------
	public boolean isLastName(String last)
	{
		return (lastName.equalsIgnoreCase(last));
	}
	
	//-------------------------------------------------------------------
	//	Method to compare the two firstNames.
	//	Parameters: first - The First name you wish to test.
	//	Precondition: Input must be a String.
	//	Return Condition: Returns true if objects last names are equal;
	//	otherwise returns false.
	//-------------------------------------------------------------------
	public boolean isFirstName(String first)
	{
		return (firstName.equalsIgnoreCase(first));
	}
	
	//-------------------------------------------------------------------
	//	Method to compare two Person3 objects.
	//	Parameters: anotherPerson - an instance of the Person3 class.
	//				Used to compare against the current instance.
	//	Precondition: Must pass a Person3 object to the method.
	//	Return Condition: Returns true if Person is equal to
	//					  anotherPerson.
	//-------------------------------------------------------------------
	public boolean equals(Person3 anotherPerson)
	{
		return (lastName.equalsIgnoreCase(anotherPerson.lastName) && firstName.equalsIgnoreCase(anotherPerson.firstName) && middleName.equalsIgnoreCase(anotherPerson.middleName));
	}
	
	//---------------------------------------------------------------------
	// Method to copy a Person object.
	// Parameters: anotherPerson - an instance of the Person3 Class. Used to 
	//			   compare against the current instance of clock.
	// Precondition: Must pass a Person3 object to the method.
	// Postcondition: The instance variables of anotherPerson are copied into 
	//			    the corresponding data members of this Person3.
	//				lastName = anotherPerson.lastName;
	//				middleName = anotherPerson.middleName;
	//				firstName = anotherPerson.firstName;
	//---------------------------------------------------------------------
	public void makeCopy(Person3 anotherPerson)
	{
		lastName = anotherPerson.lastName;
		middleName = anotherPerson.middleName;
		firstName = anotherPerson.firstName;
	}
	
	//---------------------------------------------------------------------
	// Method to return a copy of Person3.
	// Return Condition: A copy of the object is created and a reference of 
	//					the copy is returned.
	//---------------------------------------------------------------------
	public Person3 getCopy()
	{
		Person3 temp = new Person3();
		temp.lastName = lastName;
		temp.middleName = middleName;
		temp.firstName = firstName;
		return temp;
	}
	
	public Person3(Person3 anotherPerson)
	{
		makeCopy(anotherPerson);
	}
}
