//***************************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class QueueUnderflowException.java
//           Due Date:  October 19, 2009
//
//***************************************************************
//****************************************************************
// The purpose of this program is create the
// QueueUnderflowException class.  
//****************************************************************

public class QueueUnderflowException extends QueueException
{
    public QueueUnderflowException()
    {
         super("Queue Underflow");
    }

    public QueueUnderflowException(String msg)
    {
        super(msg);
    }
}
