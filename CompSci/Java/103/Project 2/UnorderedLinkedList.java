//************************************************************************************
//      Name: Collin Mitchell
//      Course: Computer Science 103
//      Instructor: John Alampi
//      Assignment: UnorderedLinkedListClass.java
//      Due Date: October 1st, 2009
//************************************************************************************

//************************************************************************************
//      The purpose of this class is to create an UnorderedLinkedList class. This
//      class extends the functionality of LinkedListClass by dealing with the case
//      that the linked list nodes will not be sorted. This class has no instance
//      variables, two constructors, and two methods.
//************************************************************************************

class UnorderedLinkedList extends LinkedListClass
{
   //-----------------------------------------------------------------------------------------------
   //   Instance Variables
   //-----------------------------------------------------------------------------------------------
   //There are no instance variables
   
   //-----------------------------------------------------------------------------------------------
   //   Default Constructor
   //   Invoke the constructor of the parent class sending it no parameters
   //-----------------------------------------------------------------------------------------------
   public UnorderedLinkedList()
   {
      super();
   }
   
   //-----------------------------------------------------------------------------------------------
   //   Copy constructor
   //   Invokes the copy constructor of the parent class sending it parameters otherList
   //-----------------------------------------------------------------------------------------------
   public UnorderedLinkedList(LinkedListClass otherList)
   {
      copyList(otherList);
   }
   
   //-----------------------------------------------------------------------------------------------
   //   Method to determine whether searchItem is in the list.
   //   Postcondition: Returns true if searchItem is in the list; false otehrwise
   //-----------------------------------------------------------------------------------------------
   public boolean search(DataElement searchItem)
   {
      LinkedListNode current;
      boolean found = false;
      current = first;
      while(current != null && found == false)
      {
         if( current.info.equals(searchItem))
            found = true;
         else
            current = current.link;
      }
	  return found;
   }
   
   //-----------------------------------------------------------------------------------------------
   //   Method to delete deleteItem from the list
   //   Postcondition: If found, the node containing deleteitem is deleted from the list.
   //               Also, first points to the first node, last points to the last node of the
   //               updated list, and count is decremented by 1.
   //-----------------------------------------------------------------------------------------------
   public void deleteNode(DataElement deleteItem)
   {
      LinkedListNode current;
      LinkedListNode trailCurrent;
      boolean found = false;
      if(isEmptyList() == true)                                          //Case 1
         System.err.println("Cannot delete from an empty List.");
      else
         {
            if(first.info.equals(deleteItem))                          //Case 2
            {
               first = first.link;
               if(first == null)
               {
                  last = null;
                  count--;
               }
            }
            else
            {
               trailCurrent = first;
               current = first.link;
               while(current != null && found == false)
               {
                  if(current.info.equals(deleteItem))
                     found = true;
                  else
                  {
                     trailCurrent = current;
                     current = current.link;
                  }
               }
            if(found = true)                                 //Case 3
            {
               count--;
               trailCurrent.link = current.link;
               if(current == last)
                  last = trailCurrent;
            }
            else
            {
               System.err.println("Item to be deleted does not exist."); //Case 4
            }
            }
         }
   }
}