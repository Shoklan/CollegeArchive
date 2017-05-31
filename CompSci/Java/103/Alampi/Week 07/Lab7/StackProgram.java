//****************************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class StackUnderflowException.java
//           Due Date:  October 5, 2009
//
//****************************************************************
//****************************************************************
// The purpose of this program is to
// test various operations of a stack
//****************************************************************


public class StackProgram
{
    public static void main(String[] args)
    {
        StackClass intStack = new StackClass(50);
        StackClass tempStack = new StackClass();

        try
        {
            intStack.push(new IntElement(23));
            intStack.push(new IntElement(45));
            intStack.push(new IntElement(38));
        }
        catch(StackOverflowException sofe)
        {
            System.out.println(sofe.toString());
            System.exit(0);
        }

        tempStack.copyStack(intStack);  //copy intStack 
                                        //into tempStack

        System.out.print("tempStack elements: ");

        while(!tempStack.isEmptyStack())  //print tempStack
        {
            System.out.print(tempStack.peek() + " ");
            tempStack.pop();
        }

        System.out.println();

        System.out.println("The top element of intStack: "
                        + intStack.peek());
    }
}
