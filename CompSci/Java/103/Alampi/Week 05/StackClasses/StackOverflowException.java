//****************************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class StackOverflowException.java
//           Due Date:  October 8, 2009
//
//****************************************************************
//****************************************************************
// The purpose of this program is create the
// StackOverflowException class.  
//****************************************************************


public class StackOverflowException extends StackException
{
    public StackOverflowException()
    {
         super("Stack Overflow");
    }

    public StackOverflowException(String msg)
    {
        super(msg);
    }
}

