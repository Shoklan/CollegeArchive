//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class StackException.java
//           Due Date:  October 3, 2009
//
//************************************************
//****************************************************************
// The purpose of this program is create the
// StackException class.  
//****************************************************************


//****************************************************************
// Notice that the class StackException is derived from the class
// RuntimeException, and so the stack overflow and underflow
// exceptions as we have defined them are unchecked exceptions.
// Unchecked exceptions are not checked by the compiler.  Because
// the compiler does not check for unchecked exceptions, the 
// program does not need to declare them using a throws clause
// or to provide code within the program to deal with them.  The
// exceptions belonging to the RuntimeException class are
// unchecked exceptions.  
//****************************************************************

public class StackException extends RuntimeException
{
    public StackException()
    {
    }

    public StackException(String msg)
    {
        super(msg);
    }
}

