//****************************************************************************************
//	Author: Collin Mitchell
//	Course: Computer Science 103
//	Class: BinaryTree.java
//	Instructor: John Alampi
//	Date: November 18th, 2009
//*****************************************************************************************
//	This class is written to create a Binary Tree. This
//	"tree" is a Data Struture that uses a root node and
//	has two connections from the root to other nodes.
//*****************************************************************************************
public class BinaryTree
{
	//Definition of the node
	protected class BinaryTreeNode
	{
		DataElement info;
		BinaryTreeNode llink;
		BinaryTreeNode rlink;
	}//End of class BinaryTreeNode
	//--------------------------------------------------
	//	Instance Variables
	//--------------------------------------------------
	//To store the roots reference address
	protected BinaryTreeNode root;
	//--------------------------------------------------
	//	Default Constructor
	//	Postcondition: root = null;
	//--------------------------------------------------
	public BinaryTree()
	{
		root = null;
	}//End of Default Constructor
	//--------------------------------------------------
	//	Copy Constructor
	//--------------------------------------------------
	public BinaryTree(BinaryTree otherTree)
	{
		if(otherTree == null)
			root = null;
		else
			root = copy(otherTree.root);
	}//End of Copy Constructor	
	//--------------------------------------------------------------------------
	//	Method to determine whether the binary tree is empty.
	//	Postcondition: Returns true if binary tree is empty;
	//						otherwise, returns false.
	//-------------------------------------------------------------------------
	public boolean isEmptyTree()
	{
		return(root == null);
	}//End of method isEmptyTree
	//-----------------------------------------------------------------------------
	//	Method to do an inorder traversal of the binary tree.
	//	Postcondition: The nodes of the binary tree are
	//						output in the inorder sequence.
	//-----------------------------------------------------------------------------
	public void inorderTraversal()
	{
		inorder(root);
	}//End of method inorderTraversal
	//--------------------------------------------------------------------------------
	//	Method to do a preorder traversal of the binary tree.
	//	Postcondition: The nodes of the binary tree are
	//						output in the preorder sequence.
	//--------------------------------------------------------------------------------
	public void preorderTraversal()
	{
		preorder(root);
	}//End of method preorderTraversal
	//--------------------------------------------------------------------------------
	//	Method to do a postorder traversal of the binary tree.
	//	Postcondition: The nodes of the binary tree are output
	//						in the postorder sequence.
	//--------------------------------------------------------------------------------
	public void postorderTraversal()
	{
		postorder(root);
	}//End of method postorderTraversal
	//-------------------------------------------------------------------------------
	//	Method to determine the height of the binary tree .
	//	Postcondition: The height of the binary tree is returned.
	//------------------------------------------------------------------------------
	public int treeHeight()
	{
		return height(root);
	}//End of method treeHeight
	//-------------------------------------------------------------------------------
	//	Method to determine the number of nodes in the binary tree.
	//	Postcondition: The number of nodes in the binary tree is
	//						returned.
	//------------------------------------------------------------------------------
	public int treeNodeCount()
	{
		return nodeCount(root);
	}//End of method treeNodeCount
	//-----------------------------------------------------------------------------
	//	Method to determine the number of leaves in the binary tree.
	//	Postcondition: The number of leaves in the tree are returned
	//-----------------------------------------------------------------------------
	public int treeLeavesCount()
	{
		return leavesCount(root);
	}//End of method treeLeavesCount
	//-------------------------------------------------------------
	//	Method to destroy the binary tree.
	//	Postcondition: root = null;
	//-------------------------------------------------------------
	public void destroyTree()
	{
		root = null;
	}//End of method destroyTree
	//-------------------------------------------------------------
	//	Method to make a copy of the binary tree specified by
	//	otherTree points
	//-------------------------------------------------------------
	public void copyTree(BinaryTree otherTree)
	{
		if(this != otherTree)
			root = null;
		if(otherTree.root != null)
			root = copy(otherTree.root);
	}//End of method copyTree
	//--------------------------------------------------------------------------------------------
	//	Method to make a copy of the binary tree to which
	//	otherTreeRoot points.
	//	Postcondition: A copy of the binary tree to which
	//						otherTreeRoot is created and the references
	//						of the root node of the copied binary tree is
	//						returned.
	//--------------------------------------------------------------------------------------------
	private BinaryTreeNode copy(BinaryTreeNode otherTreeRoot)
	{
		BinaryTreeNode temp = new BinaryTreeNode();
		if(otherTreeRoot == null)
			temp = null;
		else
		{
			temp.info = otherTreeRoot.info.getCopy();
			temp.llink = copy(otherTreeRoot.llink);
			temp.rlink = copy(otherTreeRoot.rlink);
		}
			return temp;
	}//End of method copy
	
	//-------------------------------------------------------------------------------------------
	//	Method to do an inorder traversal of the binary tree to
	//	which p points.
	//	Postcondition: The nodes of the binary tree to which p
	//						points are output in the inorder sequence.
	//-------------------------------------------------------------------------------------------
	private void inorder(BinaryTreeNode p)
	{
		if(p != null)
		{
			inorder(p.llink);
			//System.out.print(p + " ");
			System.out.print(p.info + " " );
			inorder(p.rlink);
		}
	}//End of method inorder
	//-------------------------------------------------------------------------------------------
	//	Method to do a preorder traversal of the binary tree to
	//	which p points.
	//	Postcondition: The nodes of the binary tree to which p
	//						points are output in the preorder sequence
	//-------------------------------------------------------------------------------------------
	private void preorder(BinaryTreeNode p)
	{
		if(p != null)
		{
			//System.out.print(p + " ");
			System.out.print(p.info + " ");
			preorder(p.llink);
			preorder(p.rlink);
		}
	}//End of method preorder
	//---------------------------------------------------------------------------------------
	//      Method to do a postorder traversal of the binary tree to which
    //      tree which p points.
    //      Postcondition: The nodes of the binary tree to which p points
    //                                              are ouput in the postorder sequence
	//---------------------------------------------------------------------------------------
	private void postorder(BinaryTreeNode p)
	{
		if(p != null)
		{
			postorder(p.llink);
			postorder(p.rlink);
			//System.out.print(p + " ");
			System.out.print(p.info + " " );
		}
	}//End of method postorder	
	//----------------------------------------------------------
	//	Method to determine the height of the binary tree to
	//	which p points
	//----------------------------------------------------------
	private int height(BinaryTreeNode p)
	{
		if(p == null)
			return 0;
		else
			return (1 + max(height(p.llink), height(p.rlink)));
	}//End of method treeHeight
	//----------------------------------------------------------
	//	Method to determine the larger of x and y.
	//	Postcondition: The larger of x and y is returned.
	//----------------------------------------------------------
	private int max(int left, int right)
	{
		int ans;
		if(left > right)
			ans = left;
		else
			ans = right;			
		return ans;
	}//End of method max
	//-----------------------------------------------------------------------
	//	Method to determine the number of leaves in the binary
	//	tree to which p points.
	//	Postcondition: The number of leaves in the binary tree to
	//	which p points is returned.
	//----------------------------------------------------------------------
	private int leavesCount(BinaryTreeNode p)
	{
   		if(p == null)
			return 0;
		else
		{
			if(p.llink == null && p.rlink == null)
				return 1;
			else
				return leavesCount(p.llink) + leavesCount(p.rlink);
		}
	}//End of method leavesCount
	//--------------------------------------------------------------------------
	//	Method to determine the number of nodes in the binary tree
	//	to which p points.
	//	Postcondition: The number of nodes in the binary tree to
	//						which p points is returned.
	//--------------------------------------------------------------------------
	private int nodeCount(BinaryTreeNode p)
	{
		if(p != null)
		{
			return nodeCount(p.llink) + 1 + nodeCount(p.rlink);
		}
		else
			return 0;
	}//End of method nodeCount
}//End of Class BinaryTree