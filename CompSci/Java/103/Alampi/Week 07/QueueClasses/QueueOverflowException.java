//***************************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class QueueOverflowException.java
//           Due Date:  October 21, 20079
//
//***************************************************************
//****************************************************************
// The purpose of this program is create the
// QueueOverflowException class.  
//****************************************************************

public class QueueOverflowException extends QueueException
{
    public QueueOverflowException()
    {
         super("Queue Overflow");
    }

    public QueueOverflowException(String msg)
    {
        super(msg);
    }
}


