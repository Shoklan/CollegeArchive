//********************************************************************************************
//		Name: Collin Mitchell
//		Course:  CSC 103
//		Instructor:  John Alampi
//		Lab:  Class ArrayListClass
//		Due Date:  September 24, 2009
//********************************************************************************************
//********************************************************************************************
//		The purpose of this program is to create a class called
//		UnorderedArrayList. This class has three Constructors, no instance variables,
//		and three methods; all of which are Abstract as they are called from the
//		ArrayListClass when needed.
//********************************************************************************************

public class UnorderedArrayList extends ArrayListClass
{
	//-----------------------------------------------------------------------------------------
	//	Default Constructor
	//-----------------------------------------------------------------------------------------
	public UnorderedArrayList()
	{
		super();
	}//end of Default Constructor
	
	//-----------------------------------------------------------------------------------------
	//	Constructor with Parameters
	//-----------------------------------------------------------------------------------------
	public UnorderedArrayList(int size)
	{
		super(size);
	}//end of Constructor with Parameters
	
	//-----------------------------------------------------------------------------------------
	//	Copy Constructor
	//-----------------------------------------------------------------------------------------
	public UnorderedArrayList(UnorderedArrayList otherList)
	{
		super(otherList);
	}//end of Copy Constructor
	
	//-----------------------------------------------------------------------------------------
	//	Method to determine whether searchItem is in the list.
	//	Postcondition: If searchItem is found return the location in the array where
	//					searchItem is found; otherwise return -1
	//-----------------------------------------------------------------------------------------
	public int seqSearch(DataElement searchItem)
	{
        int loc;
        boolean found = false;
        for(loc = 0; loc < length; loc++)
        if(list[loc].equals(searchItem))
        {
            found = true;
            break;
        }
        if(found)
			return loc;
        else
			return -1;
	}//end of method seqSearch
	
	//-----------------------------------------------------------------------------------------
	//	Method to insert insertItem at the end of the list. However, first the list is
	//		searched to see whether the item to be inesrted is already in the list.
	//	Postcondition: list[length] = insertItem and length++;
	//			if insertItem is already in the list or the list is full an
	//			appropriate message is output.
	//-----------------------------------------------------------------------------------------
	public void insert(DataElement insertItem)
	{
		int loc;
		if(length == 0) //list is empty
			list[length++] = insertItem.getCopy(); //insert copy of item and
		else						//and increment the length.
		{
			if(length == maxSize)
				System.err.println("Cannot insert in a full String.");
			else
			{
				loc = seqSearch(insertItem);
				if(loc == -1) //The item to be inserted does not exist in the list
					list[length++] = insertItem.getCopy();
				else
					System.err.println("The item does to be inserted is" +
								" already in the list." +
								" No duplicates are allowed.");
			}
		}
	}//end method insert
	
	//-----------------------------------------------------------------------------------------
	//	Method to remove an item from the list.
	//		The parameter removeItem specifies the item to be removed.
	//	Postcondition: If removeItem is found in the list, it is removed from the list and
	//					length is decremented be one.
	//-----------------------------------------------------------------------------------------
	public void remove(DataElement removeItem)
	{
		int loc;
 
		if(length == 0)
		System.err.println("Cannot delete from an empty list.");
		else
		{
			loc = seqSearch(removeItem);
 
			if(loc != -1)
				removeAt(loc);
			else
				System.out.println("The item to be deleted is "
				+ "not in the list.");
		}
	} //end remove
}