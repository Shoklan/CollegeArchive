//************************************************
//           Name: Cody Boker
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Work: StackClass
//           Due Date:  October 15th, 2009
//
//************************************************

//************************************************
//
//  Creates a StackClass in which uses FILO
// ordering. This one implements arrays and uses
// the DataElement class in the array.
//
//************************************************

public class StackClass 
{

	//---------------------------------------------------------
	//   CONSTANT GO HERE
	//---------------------------------------------------------
	
	//----------------------
	//   INSTANCE VARIABLES
	//----------------------
	private int maxStackSize;
	private int stackTop;
	private DataElement[] list;
	
	//---------------------------------------------------------
	//default constructor
	//Create an array of size stackSize to emplement the stack
	//Postcondition: The variable list contains the base
	//			address of the array, stackTop = 0, and
	//			maxStackSize = 100
	//---------------------------------------------------------
	public StackClass()
	{
		stackTop = 0;
		maxStackSize = 100;
		list = new DataElement[maxStackSize];
	}	
	
	//---------------------------------------------------------
	//default constructor
	//Create an array of size stackSize to emplement the stack
	//Postcondition: The variable list contains the base
	//			address of the array, stackTop = 0, and
	//			maxStackSize = 100
	//---------------------------------------------------------
	public StackClass(int stackSize)
	{
		if(stackSize <= 0)
		{
			System.err.println("The size of the array to implement"
					+ "the stack must be positive.");
			System.err.println("Creating an array of size 100.");
			
			maxStackSize = 100;
		}
		else
			maxStackSize = stackSize;
		
		stackTop = 0;
		list = new DataElement[maxStackSize];
	}	
	
	//---------------------------------------------------------
	//Method to initialize the list to an empty state.
	//Postcondition: first = null,  last = null,
	//                        and count = 0
	//---------------------------------------------------------
	public void  initializeList()
	{
		for(int i = 0; i < stackTop; i++)
			list[i] = null;
		stackTop = 0;
	} 

	//copy constructor
	public StackClass(StackClass otherStack)
	{
		copy(otherStack);
	}

	//---------------------------------------------------------
	//Method to determine whether the stack is empty.
	//Postcondition: Returns true if the stack is empty;
	//                        otherwise, returns false.
	//---------------------------------------------------------
	public boolean isEmptyStack()
	{
		return (stackTop == 0);
	}
	
	//---------------------------------------------------------
	//Method to determine whether the stack is full.
	//Postcondition: Returns true if the stack is full;
	//                        otherwise, returns false.
	//---------------------------------------------------------
	public boolean isFullStack()
	{
		return (stackTop == maxStackSize);
	}

	
	//-----------------------------------------------------------------
	//Method to return the top element of the stack.
	//Precondition: The stack exists and is not empty.
	//Postcondition: If the stack is empty, the method throws
	//	                        StackUnderflowException; otherwise, a
	//	                        reference to a copy of the top element
	//	                        of the stack is returned.
	//-----------------------------------------------------------------
	public DataElement peek() throws StackUnderflowException
	{
		if(isEmptyStack())
			throw new StackUnderflowException();
		DataElement temp = list[stackTop-1].getCopy();
		return temp;
	}

	//---------------------------------------------------------
	//Method to add newElement to the stack.
	//Precondition: The stack exists.
	//Postcondition: The stack is changed and newElement
	//			is added to the top of stack.
	//---------------------------------------------------------
	public void push(DataElement newItem) throws StackOverflowException
	{
		if(isFullStack())
			throw new StackOverflowException();
		list[stackTop] = newItem.getCopy();
		stackTop++;
	}


	//-----------------------------------------------------------------
	//Method to remove the top element of the stack.
	//Precondition: The stack exists and is not empty.
	//Postcondition: The stack is changed and the top
	//                        element is removed from the stack.
	//                        If the stack is empty, the method throws
	//                        StackUnderflowException
	//-----------------------------------------------------------------
	public void pop() throws StackUnderflowException
	{
		if(isEmptyStack())
			throw new StackUnderflowException();
		else
		{
			stackTop--;
			list[stackTop] = null;
		}
	}



	//---------------------------------------------------------
	//Method to make a copy of otherStack.
	//Postcondition: A copy of otherStack is created and
	//                       assigned to this stack.
	//---------------------------------------------------------
	public void copyStack(StackClass otherStack)
	{
		if(this != otherStack)
			copy(otherStack);
	}

	//---------------------------------------------------------
	//Method to make a copy of otherStack.
	//This method is used only to implement the methods
	//copyStack and copy constructor
	//Postcondition: A copy of otherStack is created and
	//                        assigned to this stack.
	//---------------------------------------------------------
	private void copy(StackClass otherStack)
	{
		list = null;
		System.gc();
		maxStackSize = otherStack.maxStackSize;
		stackTop = otherStack.stackTop;
		list = new DataElement[maxStackSize];
		for(int i = 0; i < stackTop; i++)
			list[i] = otherStack.list[i];
	}
}

