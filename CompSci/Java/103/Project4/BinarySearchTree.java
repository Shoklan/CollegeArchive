//**************************************************************************
//	Author: Collin Mitchell
//	Course: Computer Science 103
//	Instructor: John Alampi
//	Class: BinarySearchTree
//	Date: November 18th, 2009
//**************************************************************************

public class BinarySearchTree extends BinaryTree
{
	//----------------------------------------------------------------------------------------------------------------------------
	//	Default Constructor
	//	Postcondition: root = null;
	//----------------------------------------------------------------------------------------------------------------------------
	public BinarySearchTree()
	{
		root = null;
	}//End of Default Constructor
	
	//----------------------------------------------------------------------------------------------------------------------------
	//	Copy Constructor
	//----------------------------------------------------------------------------------------------------------------------------
	public BinarySearchTree(BinarySearchTree otherTree)
	{
		super(otherTree);
	}//End of Copy Constructor
	
	//--------------------------------------------------------------------------------------------
	//	Method to determine whether searchItem is in the binarySearchTree
	//	Postcondition: Returns true if searchItem is found in the binary
	//						search tree; otherwise, return false.
	//--------------------------------------------------------------------------------------------
	public boolean search(DataElement searchItem)
	{
	   BinaryTreeNode current;
	   boolean found = false;
	   	
	   if(isEmptyTree())
	      System.out.println("Cannot search an empty Tree");
	   else
	   {
	      current = root;
	   	   
	  	   while(current != null && !found)
	  	   {
		   System.out.println(current.info);
	   	   if(current.info.equals(searchItem))
	            found = true;
	  	      else if(current.info.compareTo(searchItem) > 0)
	  	         current = current.llink;
	  	      else
   	         current = current.rlink;
  	   	}//End of while
	   }//End of else  
	   return found; 
	}//End of method search
	
	//--------------------------------------------------------------------------------------------
	//	Method to insert insertItem in the binary search tree.
	//	Postcondition: If no node in the binary search tree has the same 
	//						info insertItem, a node with the info insertItem is
	//						created and inserted in the binary search tree.
	//--------------------------------------------------------------------------------------------
	public void insert(DataElement insertItem)
	{
	   BinaryTreeNode current;
	   BinaryTreeNode trailCurrent;
	   BinaryTreeNode newNode = new BinaryTreeNode();
	   
	   newNode.info = insertItem.getCopy();
	   newNode.llink = null;
	   newNode.rlink = null;
	   
	   
	   if(root == null)
	      root = newNode;
	   else
	   {
	      current = root;
	      trailCurrent = current;
	      while(current != null)
	      {
	         if(current.info.equals(insertItem))
	         {
	            System.err.println("The Item to be inserted is already in the list.");
	            System.err.println("Duplicates are not allowed.");
	            return;
	         }//End of if
	         else
	         {
	            if(current.info.compareTo(insertItem) > 0 )
	               current = current.llink;
	            else
	               current = current.rlink;
	         }//End of else
	       }//End of while
	         if(trailCurrent.info.compareTo(insertItem) > 0)
	            trailCurrent.llink = newNode;
	         else
	            trailCurrent.rlink = newNode;
	   }//End of else
	}//End of method insert
	
	//--------------------------------------------------------------------------------------------
	//	Method to delete deleteItem from the binary search tree
	//	Postcondition: If a node with the same info as deleteItem is found
	//						it is deleted from the binary search tree.
	//--------------------------------------------------------------------------------------------
	public void deleteNode(DataElement deleteItem)
	{
		BinaryTreeNode current, trailCurrent;
		boolean found = false;
		
		if(isEmptyTree())
		   System.err.println("Cannot delete from the empty Tree.");
		else
		{
		   current = root;
		   trailCurrent = root;
		   
		   while(current != null && !found)
		   {
		      if(current.info.equals(deleteItem))
		         found = true;
		      else
		      {
		         trailCurrent = current;
		         if(current.info.compareTo(deleteItem) > 0)
		            current = current.llink;
		         else
		            current = current.rlink;
		      }//End of else
		   }//End of While
		   
		   if(current == null)
		      System.err.println("The deleteitem is not in the Binary Tree.");
		   else
		   {
		      if(found)
		      {
		         if(current == root)
		            root = deleteFromTree(current);
		         else
		         {
		            if(trailCurrent.info.compareTo(deleteItem) > 0)
                     trailCurrent.llink = deleteFromTree(trailCurrent.llink);
                  else
                     trailCurrent.rlink = deleteFromTree(trailCurrent.rlink);
               }//end of Else
             }//End of If
          }//End of Else
		   }//End of Else
	}//End of method deleteNode
	
	//--------------------------------------------------------------------------------------------
	//	Method to delete the node, to which p points. from the binary
	//	search tree.
	//	Postcondition: The node to which p points is deleted from the
	//						binary search tree. The reference of the rooot node
	//						of the binary search tree after delete is returned.
	//--------------------------------------------------------------------------------------------
	private BinaryTreeNode deleteFromTree(BinaryTreeNode p)
	{
	   BinaryTreeNode current, trailCurrent;
	   if(p == null)
	      System.err.println("The node to be deleted is null");
	   else if(p.llink == null && p.rlink == null)
	      p = null;
	   else if(p.llink == null)
	      p = p.rlink;
	   else if(p.rlink == null)
	      p = p.llink;
	   else
	   {
	      current = p.llink;
	      trailCurrent = null;
	      while(current.rlink != null)
	      {
	         trailCurrent = current;
	         current = current.rlink;
	      }
	      
	      p.info = current.info;
	      if(trailCurrent == null) //Current did not move; adjust p. Why?
	         p.llink = current.llink;
	      else
	         trailCurrent.rlink = current.llink;
	   }
	   
	   return p;
	}//End of method deleteFrom Tree	
}//End of Class BinarySearcTree
