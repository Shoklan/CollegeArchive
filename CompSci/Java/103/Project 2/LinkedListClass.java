//************************************************************************************
//      Name: Collin Mitchell
//      Course: Computer Science 103
//      Instructor: John Alampi
//      Assignment: LinkedListClass.java
//      Due Date: October 28th, 2009
//************************************************************************************

//************************************************************************************
//      The purpose of this class is to create a LinkedListClass. The class is used
//      to link nodes together to create a chain of nodes containing information that
//      can be accessed during runtime. The class contains three instance variables,
//      two constructors, ten methods, and three abstract methods. 
//************************************************************************************

public abstract class LinkedListClass
{
      //Definition of the node
   protected class LinkedListNode
   {
      DataElement info;
      LinkedListNode link;
   }
   //-----------------------------------------------------------------------------------------------
   //   CONSTANT GO HERE
   //-----------------------------------------------------------------------------------------------
   
   //-----------------------------------------------------------------------------------------------
   //   INSTANCE VARIABLES
   //-----------------------------------------------------------------------------------------------
   protected LinkedListNode first;      //variable to point to the first node
   protected LinkedListNode last;       //variable to point to the last node
   protected int count;                 //variable to store the number of nodes in the list

   //-----------------------------------------------------------------------------------------------
   //   Default constructor
   //   Initializes the list to an empty state
   //   Postcondition: first = null,  last = null,
   //                 and count = 0
   //-----------------------------------------------------------------------------------------------
   public LinkedListClass()
   {
      initializeList();
   }

   //-----------------------------------------------------------------------------------------------
   //   Copy Constructor
   //-----------------------------------------------------------------------------------------------
   public LinkedListClass(LinkedListClass otherList)
   {
      first = otherList.first;
      last = otherList.last;
      count = otherList.count;
   }
   
   //-----------------------------------------------------------------------------------------------
   //   Method to initialize the list to an empty state.
   //   Postcondition: first = null,  last = null,
   //                 and count = 0
   //-----------------------------------------------------------------------------------------------
   public void  initializeList()
   {
      first = null;
      last = null;
      count = 0;
   }
   
   
   //-----------------------------------------------------------------------------------------------
   //   Method to determine whether the list is empty.
   //   Postcondition: Returns true if the list is empty, 
   //                 otherwise, returns false.
   //-----------------------------------------------------------------------------------------------
   public boolean isEmptyList()
   {
      return (first == null);
   }
   
   //-----------------------------------------------------------------------------------------------
   //   Method to output the data contained in each node.
   //-----------------------------------------------------------------------------------------------
   public void print()
   {
      LinkedListNode current;

      current = first;
      while(current != null)
      {
         System.out.print(current.info + " ");
         current = current.link;
      }
   }
   
   //-----------------------------------------------------------------------------------------------
   //   Method to return the number of nodes in the list.
   //   Postcondition: The value of count is returned. 
   //-----------------------------------------------------------------------------------------------
   public int length()
   {
      return count;
   }

   //-----------------------------------------------------------------------------------------------
   //   Method to return the reference of the object containing
   //   the data of the first node of the list
   //   Precondition: The list must exist and must not be empty.
   //   Postcondition: Returns the reference to the object that
   //                 contains the info of the first node is returned
   //-----------------------------------------------------------------------------------------------
   public DataElement front()
   {
      DataElement temp = null;

      if (isEmptyList() == true)
      {
         System.out.println("The list is empty, returning null reference.");
      }
      else
      {
        temp = first.info.getCopy();
      } 
      return temp;
   }
   
   //-----------------------------------------------------------------------------------------------
   //   Method to return the reference of the object containing
   //   the data of the last node of the list
   //   Precondition: The list must exist and must not be empty.
   //   Postcondition: Returns the reference to the object that
   //                 contains the info of the last node is returned
   //-----------------------------------------------------------------------------------------------
   public DataElement back()
   {
      DataElement temp = null;

      if (isEmptyList() == true)
      {
         System.out.println("The list is empty, returning null reference.");
      }
      else
      {
         temp = last.info.getCopy();
      } 
      return temp;
   }
   
   //-----------------------------------------------------------------------------------------------
   //   Method to determine whether searchList is in the list.
   //   Postcondtition: Returns true if searchItem is found in the list; false otherwise.
   //-----------------------------------------------------------------------------------------------
   public abstract boolean search(DataElement searchItem);
   
   //-----------------------------------------------------------------------------------------------
   //   Method to insert newItem at the beginning of the list.
   //   Postcondtition: first points to the new list
   //               and newItem is inserted at the beginning of the list.
   //               Also, last points to the last node and count is incremented by 1.
   //-----------------------------------------------------------------------------------------------
   public void insertFirst(DataElement newItem)
   {
      LinkedListNode newNode = new LinkedListNode();
      newNode.info = newItem.getCopy();
      newNode.link = first;
      first = newNode;
      if(last == null)
         last = newNode;
      count++;
   }
   
   //-----------------------------------------------------------------------------------------------
   //   Method to insert newItem at the end of the list.
   //   Postcondtition: last points to the new list
   //               and newItem is inserted at the end of the list.
   //               Also, last points to the last node and count is incremented by 1.
   //-----------------------------------------------------------------------------------------------
   public void insertLast(DataElement newItem)
   {
      LinkedListNode newNode = new LinkedListNode();
      newNode.info = newItem.getCopy();
      newNode.link = last;
      last = newNode;
      if(last == null)
         last = newNode;
      count++;
   }
   
   //-----------------------------------------------------------------------------------------------
   //   Method to delete deleteItem from the list.
   //   Postcondition: If found, the node containing deleteItem is deleted from the list
   //               Also, first points to the ffirst node, last points to the last node of the
   //               updated last, and count is decremented by 1;
   //-----------------------------------------------------------------------------------------------
   public abstract void deleteNode(DataElement deleteItem);
   
   //-----------------------------------------------------------------------------------------------
   //   Method to make a copy of the other list
   //-----------------------------------------------------------------------------------------------
   private void copy(LinkedListClass otherList)
   {
      /*current = head;
      while(current != null)
      {
         LinkedListNode newNode = new LinkListNode();
         newNode.info = otherList.info;
      }
     */
     LinkedListNode newNode = new LinkedListNode(); 
     LinkedListNode current = new LinkedListNode();
     first = null;
     if(otherList.isEmptyList() == true)
      initializeList();
     else
     {
       current = otherList.first;
      count = otherList.count;
      newNode = new LinkedListNode();
      newNode.info = current.info.getCopy();
      newNode.link = null;
      first = newNode;
      last = newNode;
      current = current.link;
      
      while(current != null)
      {
         newNode = new LinkedListNode();
         newNode.info = current.info.getCopy();
         newNode.link = null;
         last.link = newNode;
         last = newNode;
         current = current.link;
      }
      }
   }
   
   //-----------------------------------------------------------------------------------------------\
   //   Method to return a reference of the copy of otherList.
   //-----------------------------------------------------------------------------------------------
   public void copyList(LinkedListClass otherList)
   {
      copy(otherList);
   }
}
