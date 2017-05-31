//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class DataElement
//           Due Date:  November 5, 2009
//
//************************************************
//****************************************************************
// The purpose of this program is to implement the class called
// OrderedArrayList.  
//****************************************************************


public class OrderedArrayList extends ArrayListClass
{
    //default constructor 
    public OrderedArrayList()
    {
        super();
    }

    //constructor with a parameter
    public OrderedArrayList(int size)
    {
        super(size);
    }

    //copy constructor    
    public OrderedArrayList(OrderedArrayList otherList)
    {
        super(otherList);
    }

    //Method to determine whether searchItem is in the list.
    //Postcondition: If searchItem is found, returns the location
    //               in the array where searchItem is found;
    //               otherwise, returns -1.
    public int seqSearch(DataElement searchItem)
    {
        System.out.println("We will code this for Lab9. ");
        return -1;
    } //end seqSearch


    //Method to insert insertItem in the list at the proper
    //place. However, first the list is searched to
    //see if the item to be inserted is already in the list.
    //Postcondition: insertItem is inserted and length++
    //           If insertItem is already in the list or the list
    //           is full, an appropriate message is output.
    public void insert(DataElement insertItem)
    {
        int first = 0;
        int last = length - 1;
        int mid = 0;

        boolean found = false;

        if(length == 0)   //list is empty
        {
            list[0] = insertItem.getCopy();
            length++;
        }
        else
            if(length == maxSize)
                System.err.println("Cannot insert into a full list.");
            else
            {
                while(first <= last && !found)
                {
                    mid = (first + last) / 2;

                    if(list[mid].equals(insertItem))
                        found = true;
                    else
                        if(list[mid].compareTo(insertItem) > 0)
                            last = mid - 1;
                        else
                            first = mid + 1;
                }//end while

                if(found)
                    System.err.println("The insert item is already in the list. "
                                     + "Duplicates are not allowed.");
                else
                {
                    if(list[mid].compareTo(insertItem) < 0)
                        mid++;

                    insertAt(mid, insertItem);
                }
            }
    }//end insert


    public int binarySearch(DataElement item)
    {
        int first = 0;
        int last = length - 1;
        int mid = -1;

        boolean found = false;

        while(first <= last && !found)
        {
            mid = (first + last) / 2;

            if(list[mid].equals(item))
               found = true;
            else
               if(list[mid].compareTo(item) > 0)
                  last = mid - 1;
               else
                  first = mid + 1;
        }

        if(found)
           return mid;
        else
            return -1;
    }//end binarySearch

    //Method to remove an item from the list.
    //The parameter removeItem specifies the
    //item to be removed.
    //Postcondition: If removeItem is found in the list, it is
    //               removed from the list and length is
    //               decremented by one.
    public void remove(DataElement removeItem)
    {
        System.out.println("See Programming Exercise 6.");
    }//end remove
	
	private void swap(int first, int last)
	{
		DataElement temp;
		
		temp = list[first];
		list[first] = list[last];
		list[last] = temp;
		
	}//End of method swap
	
	public void selectionSort()
	{
		int index;
		int min;
		for(index = 0; index < length; index++)
		{
			min = minLocation(index, length-1);
			swap(index, min);
		}
	}//End of method SelectionSort
	//------------------------------------------------------------------------------------
	//	MinLocation
	//------------------------------------------------------------------------------------
	private int minLocation(int first, int last)
	{
		int minIndex, loc;
		minIndex = first;
		
		for(loc = first+1; loc <= last; loc++)
		{
			if(list[loc].compareTo(list[minIndex]) < 0)
				minIndex = loc;
		}
		return minIndex;
	}//End of method minLocation
	
	//-------------------------------------------------------------------------------------
	//	InsertionSort()
	//-------------------------------------------------------------------------------------
	public void insertionSort()
	{
		int loc;
		int firstOutOfOrder;
		DataElement temp;
		
		for(firstOutOfOrder = 1; firstOutOfOrder < length; firstOutOfOrder++)
		{
			if(list[firstOutOfOrder].compareTo(list[firstOutOfOrder-1]) < 0);
			{
				temp = list[firstOutOfOrder];
				loc = firstOutOfOrder;
				do
				{
					list[loc] = list[loc-1];
					location--;
				}
				while(location > 0 && list[location-1].compareTo(temp) < 0);
			}//End of If
		}//End of For loop
	}//End of method insertionSort
	
}