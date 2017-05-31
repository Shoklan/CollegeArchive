//************************************************
//           Name: Collin Mitchell
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class ArrayListClass
//           Due Date:  September 24, 2009
//
//************************************************
//****************************************************************
// The purpose of this program is to create a class called
// ArrayListClass.
//****************************************************************
public abstract class ArrayListClass
{
	//-----------------------------------------
    //   CONSTANTS
    //-----------------------------------------


    //-----------------------------------------
    //   Instance Variables
    //-----------------------------------------
    protected int length;  //to store the length of the list
    protected int maxSize; //to store th maximum size of the list
    protected DataElement[] list;  //array to hold the list entries
    //Method to determine whether the list is empty
    public boolean isEmpty()
	{
		return (length == 0);
	}//end of method isEmpty
	
	public boolean isFull()
	{
		return (length == max);
	}//end of method isFull
	
	public int listSize()
	{
		return length;
	)
	
	public void print()
	{
		for(in i=0;i < length;i++)
		{
			System.out.print(list[i] + " ");
			System.out.println();
		}
	}
	//------------------------------------------------------------
	public boolean isItemAtEqual(int location, DataElement item)
	{
		return( list[location].equals(item) );
	}
} 