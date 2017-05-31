//--------------------------------------------------------------------------------------------------
//	Author: Collin Mitchell
//	Name: TestTree.java
//--------------------------------------------------------------------------------------------------
//	This class will be used to test out my non functional BinarySearchTree.
//--------------------------------------------------------------------------------------------------

public class TestTree
{	
	public static void main(String[] args)
	{
		BinarySearchTree tree = new BinarySearchTree();
		DataElement number = new IntElement(3);
		DataElement number2 = new IntElement(10);
		DataElement number3 = new IntElement(2);
		DataElement number4 = new IntElement(7);
		
		if(tree.isEmptyTree())
			System.err.println("The Tree is empty.");
		
		tree.insert(number);
		tree.insert(number2);
		if(tree.isEmptyTree())
			System.err.println("The tree is empty");
			
		if(tree.search(number))
			System.out.println("The number 5 was found.");
		if(tree.search(number2))
			System.out.println("The number 10 was found.");
		if(tree.search(number3))
			System.out.println("The number 2 was found.");
			
		tree.insert(number3);
		if(tree.isEmptyTree())
			System.err.println("The tree is empty.");
		
		if(tree.search(number))
			System.out.println("The number 5 was found.");
		if(tree.search(number2))
			System.out.println("The number 10 was found.");
		if(tree.search(number3))
			System.out.println("The number 2 was found.");
			
		tree.insert(number4);
		if(tree.search(number4))
			System.out.println("The number 7 was found");
			
		tree.inorderTraversal();
		System.out.println();
		
		tree.postorderTraversal();
		System.out.println();
		
		tree.preorderTraversal();
		System.out.println();
		
		System.out.println(tree.treeHeight());
		System.out.println(tree.treeLeavesCount());
		tree.treeNodeCount();
	}//End of main class
}//End of TestTree class
		
		