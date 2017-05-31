//************************************************************************************
//      Name: Collin Mitchell
//      Course: Computer Science 103
//      Instructor: John Alampi
//      Assignment: StackClass.java
//      Due Date: October 15th, 2009
//************************************************************************************

//************************************************************************************
//
//************************************************************************************

class StackClass
{
	
	private int maxStackSize;
	private int stackTop;
	private DataElement[] list;
	
	public StackClass()
	{
		stackTop = 0;
		maxStackSize = 100;
		list = new DataElement[maxStackSize];
	}
	
	public StackClass(int stackSize)
	{
		if(stackSize <= 0)
		{
			System.err.println("The size of the array to implement "
			+ "the stack must be positive.");
			System.err.println("Creating an array of size 100");
			maxStackSize = 100;
		}
		else
		{
			maxStackSize = stackSize;
			stackTop = 0;
			list = new DataElement[maxStackSize];
		}
	}
	
	public StackClass(StackClass otherStack)
	{
		copy(otherStack);
	}
	
	public void initializeStack()
	{
		for(int i = 0; i < stackTop; i++)
			list[i] = null;
		stackTop = 0;
	}
	
	public boolean isEmptyStack()
	{
		return( stackTop == 0);
	}
	
	public boolean isFullStack()
	{
		return(stackTop == maxStackSize);
	}
	
	public void push(DataElement newItem) throws StackOverflowException
	{
		if(isFullStack())
			throw new StackOverflowException();
		list[stackTop] = newItem.getCopy();
		stackTop++;
	}
	
	public DataElement peek() throws StackUnderflowException
	{
		if(isEmptyStack())
			throw new StackUnderflowException();
		DataElement temp = list[stackTop-1].getCopy();
		return temp;
	}
	
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
	
	private void copy(StackClass otherStack)
	{
		list = null;
		System.gc();
		
		maxStackSize = otherStack.maxStackSize;
		stackTop = otherStack.stackTop;
		list = new DataElement[maxStackSize];
		for( int i = 0; i < stackTop; i++)
			list[i] = otherStack.list[i];
	}
	
	public void copyStack(StackClass otherStack)
	{
		if( this != otherStack)
			copy(otherStack);
	}
}
	
	
	
	