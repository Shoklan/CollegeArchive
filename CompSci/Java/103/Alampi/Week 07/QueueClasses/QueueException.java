//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class QueueException.java
//           Due Date:  October21, 2009
//
//************************************************
//****************************************************************
// The purpose of this program is create the
// QueueException class.  
//****************************************************************


//****************************************************************
// Notice that the class QueueException is derived from the class
// RuntimeException, and so the queue overflow and underflow
// exceptions as we have defined them are unchecked exceptions.
// Unchecked exceptions are not checked by the compiler.  Because
// the compiler does not check for unchecked exceptions, the 
// program does not need to declare them using a throws clause
// or to provide code within the program to deal with them.  The
// exceptions belonging to the RuntimeException class are
// unchecked exceptions.  
//****************************************************************




public class QueueException extends RuntimeException
{
    public QueueException()
    {
    }

    public QueueException(String msg)
    {
        super(msg);
    }
}


