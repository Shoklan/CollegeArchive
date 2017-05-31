//****************************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class StackUnderflowException.java
//           Due Date:  October 8, 2009
//
//****************************************************************
//****************************************************************
// The purpose of this program is create the
// StackUnderflowException class.  
//****************************************************************

public class StackUnderflowException extends StackException
{
    public StackUnderflowException()
    {
         super("Stack Underflow");
    }

    public StackUnderflowException(String msg)
    {
        super(msg);
    }
} 