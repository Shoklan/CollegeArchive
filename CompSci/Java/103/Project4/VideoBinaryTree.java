//*******************************************************************************************************************************
//	Author: Collin Mitchell
//	Course: Computer Science 103
//	Instructor: John Alampi
//	Class: VideoBinaryTree.java
//	Due Date: December 10th, 2009
//*******************************************************************************************************************************
//The videoBinaryTree class is used to store the movies for the rental program.
//*******************************************************************************************************************************

public class VideoBinaryTree extends BinarySearchTree
{
	//----------------------------------------------------------------------------------------------------------------------------
	//	Instance Variables
	//----------------------------------------------------------------------------------------------------------------------------
	
	//----------------------------------------------------------------------------------------------------------------------------
	//	Default Constructor
	//	Postcondition: root = null;
	//----------------------------------------------------------------------------------------------------------------------------
	public VideoBinaryTree()
	{
		super();
	}//End of Default Constructor
	
	//----------------------------------------------------------------------------------------------------------------------------
	//	Copy Constructor
	//----------------------------------------------------------------------------------------------------------------------------
	public VideoBinaryTree(VideoBinaryTree otherList)
	{
		super(otherList);
	}//End of Copy Constructor
	
	//----------------------------------------------------------------------------------------------------------------------------
	//	Method to search the video list for a particular video, specified by the parameter title.
	//	Postcondtition: If the video is found, a reference to the node containing the video is returned;
	//					otherwise, the value null is returned.
	//----------------------------------------------------------------------------------------------------------------------------
	private BinaryTreeNode searchVideoList(String title)
	{
		boolean found = false;
		BinaryTreeNode current = null;
		VideoElement temp = new VideoElement();
		
		temp.setVideoInfo(title, "", "", "", "", "", 0);
		
		if(root == null) //The Tree is empty
			System.out.println("Cannot search an empty list.");
		else
		{
			current = root; //Set Current point to the root node of the binaryTree
			found = false; //Set found to false
			
			while( current != null && !found)
			{
				if(current.info.equals(temp))
					found = true;
				else
				{
					if(current.info.compareTo(temp) > 0)
						current = current.llink;
					else
						current = current.rlink;
				}
			}
		}
		
		return current;
	}//End of method searchVideoList
	
	//----------------------------------------------------------------------------------------------------------------------------
	//	Method to searhc the list to see if a particular title, specified by the parameter, is in the store.
	//	Postcondition: Returns true if the title is found; false otherwise.
	//----------------------------------------------------------------------------------------------------------------------------
	public boolean videoSearch(String title)
	{
		BinaryTreeNode location = new BinaryTreeNode();
		location = searchVideoList(title);
		
		return(location != null);
	}//End of method videoSearch
	
	//----------------------------------------------------------------------------------------------------------------------------
	//	Method to determine if the video specified by the parameter if available.
	//	Postcondtition: Returns true if at least one copy of the video is available; false otherwise.
	//----------------------------------------------------------------------------------------------------------------------------
	public boolean isVideoAvailable(String title)
	{
		BinaryTreeNode location = new BinaryTreeNode();
		VideoElement temp;
		
		location = searchVideoList(title);
		
		if(location != null)
		{
			temp = (VideoElement)location.info;
			return(temp.getNoOfCopiesInStock() > 0);
		}
		else
			return false;
	}//End of method isVideoAvailable
	
	//---------------------------------------------------------------------------------------------------------------------------------
	//	Method to check out the video, that is, rent the video.
	//	The parameter title specifies tha video to be checked out.
	//	Postcondition: If a video is available, its copiesinStock is decremented by one; otherwise, an appropriate message is printed.
	//----------------------------------------------------------------------------------------------------------------------------------
	public void videoCheckOut(String title)
	{
		BinaryTreeNode location = new BinaryTreeNode();
		VideoElement temp;
		
		location = searchVideoList(title);  //seach the list
		
		if(location != null)
		{
			temp = (VideoElement)location.info;
			temp.checkOut();
		}
		else
			System.out.println("The Store does not carry this video.");
	}//End of method videoCheckOut
	
	//----------------------------------------------------------------------------------------------------------------------------
	//	Method to check in a video returned by a customer.
	//	The parameter title specifies the video to be checked in.
	//	Postcondition: If the video returned is from the store, its copiesInStock is incremented by one; otherwise, the message
	//					"The store does not carry this video." is printed.
	//----------------------------------------------------------------------------------------------------------------------------
	public void videoCheckIn(String title)
	{
		BinaryTreeNode location = new BinaryTreeNode();
		VideoElement temp;
		
		location = searchVideoList(title);  //seach the list
		
		if(location != null)
		{
			temp = (VideoElement)location.info;
			temp.checkIn();
		}
		else
			System.out.println("The Store does not carry this video.");
	}//End of method videoCheckOut
		
	//----------------------------------------------------------------------------------------------------------------------------
	//	Method to determine if the video specified by the parameter title is in the store.
	//	Postcondition: Returns true if the video is in the store; false otherwise.
	//----------------------------------------------------------------------------------------------------------------------------
	public boolean videoCheckTitle(String title)
	{
		BinaryTreeNode location = new BinaryTreeNode();
		location = searchVideoList(title);
		
		return(location != null);
	}//End of method videoCheckTitle
	
	//----------------------------------------------------------------------------------------------------------------------------
	//	Method to update the number of copies of a video by adding the value of the parameter num. The parameter title specifies
	//	the name of the video for which the number of copies is to be updated.
	//	Postcondition: If video is found; then call updateInStock passing it num; otherwise, the message
	//					"The Store does not carry this video." is printed.
	//----------------------------------------------------------------------------------------------------------------------------
	public void videoUpdateInStock(String title, int num)
	{
		BinaryTreeNode location = new BinaryTreeNode();
		VideoElement temp;
		
		location = searchVideoList(title);
		if(location == null)
			System.err.println("The Store does not carry this video.");
		else
		{
			temp = (VideoElement)location.info;
			temp.updateInStock(num);
		}
	}//End of method isVideoAvailable
		
	//----------------------------------------------------------------------------------------------------------------------------
	//	videoSetCopiesInStock 
	//----------------------------------------------------------------------------------------------------------------------------
	public void videoSetCopiesInStock(String title, int num)
	{
		BinaryTreeNode location = new BinaryTreeNode();
		VideoElement temp;
		
		location = searchVideoList(title);
		if(location == null)
			System.err.println("The Store does not carry this video.");
		else
		{
			temp = (VideoElement)location.info;
			temp.setCopiesInStock(num);
		}
	}//End of method videoSetCopiesInStock
	
	//----------------------------------------------------------------------------------------------------------------------------
	//	inOrder title
	//----------------------------------------------------------------------------------------------------------------------------
	public void inorderTitle(BinaryTreeNode p)
	{
		VideoElement temp;
		
		if(p != null)
		{
			inorderTitle(p.llink);
			temp = (VideoElement)p.info;
			temp.printTitle();
			inorderTitle(p.llink);
		}
	}//End of method inorderTitle
	
	//----------------------------------------------------------------------------------------------------------------------------
	//	videoprintTitle
	//----------------------------------------------------------------------------------------------------------------------------
	public void videoPrintTitle()
	{
		inorderTitle(root);
		System.out.println();
	}//End of method videoPrintTitle
}//End of class VideoBinaryTree