//*********************************************************************************************************
//      Name: Collin Mitchell
//      Course:  CSC 103
//      Instructor:  John Alampi
//      Lab:  Class ArrayListClass
//      Due Date:  September 24, 2009
//*********************************************************************************************************
//*********************************************************************************************************
//      The purpose of this program is to create a class called
//      ArrayListClass. The class has three instance variables, three Constructors, and 16 methods;
//      three of which are Abstract methods. This class allows access to the different types of
//      Array Data Types that can exist and uses some Abstract methods to account for
//      the limitations of creating a speficic type of array.
//*********************************************************************************************************

public abstract class ArrayListClass
{
   //-----------------------------------------------------------------------------------------------
   //   CONSTANTS
   //-----------------------------------------------------------------------------------------------
   //   No Constants were used in this program.

   //-----------------------------------------------------------------------------------------------
   //   Instance Variables
   //-----------------------------------------------------------------------------------------------
   protected int length;  //to store the length of the list
   protected int maxSize; //to store th maximum size of the list
   protected DataElement[] list;  //array to hold the list entries
   
   //-----------------------------------------------------------------------------------------------
   //   Default Constructor
   //   Creates an array of size 100.
   //   Postcondition: List points to the array, length = 0, and maxSize = size;
   //-----------------------------------------------------------------------------------------------
   public ArrayListClass()
   {
      maxSize = 100;
      length = 0;
      list = new DataElement[maxSize];
   }
   
   //-----------------------------------------------------------------------------------------------
   //   Constructor with Parameters
   //   Creates an array of size specified by the parameter size.
   //   Precondtion: The array size must be a positive integer;
   //            When it is not set the array size to 100;
   //   Postcondition: List points to the array, length = 0, and maxSize = size;
   //-----------------------------------------------------------------------------------------------
   public ArrayListClass(int size)
   {
      if(size < 0)
      {
         System.err.println("The size entered must be a positive number.");
         size = 100;
      }
      maxSize = size;
      length = 0;
      list = new DataElement[maxSize];
   }//end of Constructor with Parameters
   
   //-----------------------------------------------------------------------------------------------
   //   Copy Constructor
   //-----------------------------------------------------------------------------------------------
   public ArrayListClass(ArrayListClass otherList)
   {
      for(int j = 0; j < length; j++)
      {
         list[j] = otherList.list[j];
      }
   }//end of Copy Constructor
   
   //-----------------------------------------------------------------------------------------------
   //   Method to determine whether the list is empty.
   //   Return Condition: Returns true if the list is empty;
   //               otherwise, returns false.
   //-----------------------------------------------------------------------------------------------
   public boolean isEmpty()
   {
      return (length == 0);
   }//end of method isEmpty
   
   //-----------------------------------------------------------------------------------------------
   //   Method to determine whether the list is full.
   //   Return Condition: Returns true if the list is full;
   //               otherwise, returns false.
   //-----------------------------------------------------------------------------------------------
   public boolean isFull()
   {
      return (length == maxSize);
   }//end of method isFull
   
   //-----------------------------------------------------------------------------------------------
   //   Method to return the number of elements in the list.
   //   Return Condition: Returns the value of the length.
   //-----------------------------------------------------------------------------------------------
   public int listSize()
   {
      return length;
   }//end of method listSize
   
   
   //-----------------------------------------------------------------------------------------------
   //   Method to return the maximum size of the list.
   //   Return Condition: Returns the value of maxSize.
   //-----------------------------------------------------------------------------------------------
   public int maxListSize()
   {
      return maxSize;
   }//end of method maxListSize
   
   //-----------------------------------------------------------------------------------------------
   //   Method to output the elements of the list.
   //   Postcondition: Elements of the list are outpir on the standard output
   //               device.
   //-----------------------------------------------------------------------------------------------
   public void print()
   {
      for(int i=0;i < length;i++)
      {
         System.out.print(list[i] + " ");
      }
   }//end of method print
   
   //-----------------------------------------------------------------------------------------------
   //   Method to determine whether item is the same as the item in the list
   //   at the position specified  by the location.
   //   Return Condition: Returns true if list[location] is same as location;
   //               otherwise, returns false.
   //-----------------------------------------------------------------------------------------------
   public boolean isItemAtEqual(int location, DataElement item)
   {
      return( list[location].equals(item) );
   }//end of method isItemAtEqual
   
   //-----------------------------------------------------------------------------------------------
   //   Method to insert an item at the postion specified by location.
   //   Postconition: Starting at location, the elements of the list are shifted
   //               to make room for the new item, 
   //               list[location] = insertItem;
   //               length++;
   //               If the list is full or out of range, an appropriate
   //               message is displayed.
   //-----------------------------------------------------------------------------------------------
   public void insertAt(int location, DataElement insertItem)
   {
      if(location < 0 || location >= maxSize || location > length)
         System.err.println("The postion of the item is out of range.");
      else if(isFull() == true)
         System.err.println("Cannot insert in a full list.");
      else
      {   
         for(int i = length; i > location; i--)
         {
            list[i] = list[i-1]; // move the elements down
            list[location] = insertItem.getCopy(); //insert item at specific location.
            length++;
         }
      }
   }//end of method insertAt
   
   //-----------------------------------------------------------------------------------------------
   //   Method to insert an item at the end of the list.
   //   PostCondition: List[length] = insertItem;
   //               and length++;
   //               If the list is full, an appropriate message is displayed.
   //-----------------------------------------------------------------------------------------------
   public void insertEnd(DataElement insertItem)
   {
      if(isFull() == true)
         System.err.println("Cannot insert in a full list.");   
      list[length] = insertItem;
      length++;
   }//end of method insertEnd
   
   //-----------------------------------------------------------------------------------------------
   //   Method to remove the item from the list at the position specified by location.
   //   Postcondition: The list element at list[location] is removed and the length is
   //         decremented by 1.
   //         If the location is out of range an appropriate message is displayed.
   //-----------------------------------------------------------------------------------------------
   public void removeAt(int location)
    {
        if(location < 0 || location >= maxSize || location > length)
          System.err.println("The postion of the item to be removed is out of range.");
        else
        {
        for(int i = location; i < length; i++)
        {
            list[i] = list[i+1];
        }

        list[length - 1] = null;
        length--;
        }
   }//end of method removeAt
   
   //-----------------------------------------------------------------------------------------------
   //   Method to retrieve the element from the list at the position specified by location.
   //   Postcondition: A copy of the element at the postion specified by location is
   //         returned. If the location is out of range, an appropriate message
   //         is printed and null is returned.
   //-----------------------------------------------------------------------------------------------
   public DataElement retrieveAt(int location)
   {
      if(location < 0 || location >= maxSize || location > length)
      {   
         System.err.println("The position of the item to be retrieved is out of range");
         return null; //experiment
      }
      return list[location].getCopy();
   }//end of method retrieveAt
   
   //-----------------------------------------------------------------------------------------------
   //   Method to replace the element in the list at the postion specified by the location
   //      with repItem.
   //   Postcondition: List[location] = repItem
   //   If the location is out of range an appropriate message is printed.
   //-----------------------------------------------------------------------------------------------
   public void replaceAt(int location, DataElement repItem)
   {
      if(location < 0 || location >= maxSize || location > length)
         System.err.println("The position of the item to be retrieved is out of range");
      else list[location].makeCopy(repItem);
   }//end of the method replaceAt
   
   //-----------------------------------------------------------------------------------------------
   //   Method to remove all of the elements from the list.
   //   Postcondition: length = 0;
   //-----------------------------------------------------------------------------------------------
   public void clearList()
   {
      for(int i = 0; i < length; i++)
      {
         list[i] = null;
      }
      
      length = 0;
      System.gc();
   }//end of method clearList
   
   //-----------------------------------------------------------------------------------------------
   //   Method to determine whether searchItem is in the list.
   //   Postcondition: If searchItem is found, returns the location in the array where
   //               searchItem is found;
   //               otherwise returns -1;
   //-----------------------------------------------------------------------------------------------
   public abstract int seqSearch(DataElement searchItem);
   
   //-----------------------------------------------------------------------------------------------
   //   Method to insert insertItem in the list.
   //      However, first the list is searched to see whether the item to be inserted is
   //      already in the list.
   //   Postcondition: insertItem is inserted and length++
   //            If insertItem is already in the list or the list is full an
   //            appropriate message is output.
   //-----------------------------------------------------------------------------------------------
   public abstract void insert(DataElement insertItem);
   
   //-----------------------------------------------------------------------------------------------
   //   Method to remove an item from the list.
   //   The parameter removeItem specifies the item to be removed.
   //   Postcondition: If removeItem is found in the list it is removed from the list and
   //               length is decremented by one.
   //-----------------------------------------------------------------------------------------------
   public abstract void remove(DataElement removeItem);
   
   //-----------------------------------------------------------------------------------------------
   //   Method to make a copy of the other list.
   //   Postcondition: This list is destroyed and a copy of otherList is assigned to this list.
   //-----------------------------------------------------------------------------------------------
   public void copyList(ArrayListClass otherList)
   {
      if(this != otherList)//avoid self assignment
      {
         for(int j = 0; j < length; j++) //destroy this list
            list[j] = null;
         System.gc();
         
         maxSize = otherList.maxSize;
         length = otherList.length;
         list = new DataElement[maxSize]; //create the array
         
         for(int j = 0; j < length; j++)
            list[j] = otherList.list[j];
      }
   }
}//end of class ArrayListClass