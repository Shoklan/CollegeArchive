//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class DataElement
//           Due Date:  October 26, 2009
//
//************************************************
//****************************************************************
// The purpose of this program is to implement the class called
// LinkedQueueClass.  
//****************************************************************


public class LinkedQueueClass
{
    //Definition of the node
    protected class QueueNode
    {
        DataElement info;
        QueueNode link;
    }

   //-----------------------------------------
   //   Instance Variables
   //-----------------------------------------
    private QueueNode queueFront; //reference variable to the
                                  //first element of the queue
    private QueueNode queueRear;  //reference variable to the
                                  //last element of the queue
    //default constructor
    public LinkedQueueClass()
    {
    }

    //copy constructor
    public LinkedQueueClass(LinkedQueueClass otherQueue)
    {
    }//end copy constructor

    //Method to initialize the queue to an empty state.
    //Postcondition: queueFront = null; queueRear = null
     public void initializeQueue()
     {
     }



}//End of LinkedQueueClass