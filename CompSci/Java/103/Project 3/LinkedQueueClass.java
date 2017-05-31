//************************************************
//           Name: Collin Mitchell
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  LinkedQueueClass.java
//           Due Date:  November 12th, 2009
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
        queueFront = null;
        queueRear = null;
    }

    //copy constructor
    public LinkedQueueClass(LinkedQueueClass otherQueue)
    {
        QueueNode newNode; //reference variable to create a node
        QueueNode current; //reference variable to traverse the list.

        if(otherQueue.queueFront == null) //otherQueue is empty
        {
            queueFront = null;  
            queueRear = null;
        }
        else
        {
            current = otherQueue.queueFront;    //current points to the
                                            //queue to be copied

                    //copy the first element
            queueFront = new QueueNode();       //create the node
            queueFront.info = current.info.getCopy();   //copy the info
            queueFront.link = null;             //set the link field of
                                                //the node to null
            queueRear = queueFront;     
            current = current.link;     

                  //copy the remaining queue element
            while(current != null)
            {
                newNode = new QueueNode();
                newNode.info = current.info.getCopy();
                newNode.link = null;
                queueRear.link = newNode;
                queueRear = newNode;
                current = current.link;
             }//end while
        }
    }//end copy constructor

    //Method to initialize the queue to an empty state.
    //Postcondition: queueFront = null; queueRear = null
     public void initializeQueue()
     {
          queueFront = null;
          queueRear = null;
     }

    //Method to determine whether the queue is empty.
    //Postcondition: Returns true if the queue is empty;
    //               otherwise, returns false.
     public boolean isEmptyQueue()
     {
          return (queueFront == null);
     }


    //Method to determine whether the queue is full.
    //Postcondition: Returns true if the queue is full;
    //               otherwise, returns false.
     public boolean isFullQueue()
     {
          return false;
     }

    //Method to return the first element of the queue.
    //Precondition: The queue exists and is not empty.
    //Postcondition: If the queue is empty, the method throws
    //               QueueUnderflowException; otherwise, a
    //               reference to a copy of the first element
    //               of the queue is returned.
     public DataElement front() throws QueueUnderflowException
     {
          if(isEmptyQueue())
             throw new QueueUnderflowException();

          DataElement temp = queueFront.info.getCopy();
          return temp;
     }

    //Method to return the last element of the queue.
    //Precondition: The queue exists and is not empty.
    //Postcondition: If the queue is empty, the method throws
    //               QueueUnderflowException; otherwise, a
    //               reference to a copy of the last element
    //               of the queue is returned.
     public DataElement back() throws QueueUnderflowException
     {
          if(isEmptyQueue())
             throw new QueueUnderflowException();

          DataElement temp = queueRear.info.getCopy();
          return temp;
     }


    //Method to add queueElement to the queue.
    //Precondition: The queue exists.
    //Postcondition: The queue is changed and queueElement
    //               is added to the queue.
     public void addQueue(DataElement newElement)
     {
          QueueNode newNode;

          newNode = new QueueNode();  //create the node

          newNode.info = newElement.getCopy();  //store the info
          newNode.link = null;   //initialize the link field to null

          if(queueFront == null) //if initially the queue is empty
          {
             queueFront = newNode;
             queueRear = newNode;
          }
          else   //add newNode at the end
          {
             queueRear.link = newNode;
             queueRear = queueRear.link;
          }
     }//end addQueue


    //Method to remove the first element of the queue.
    //Precondition: The queue exists and is not empty.
    //Postcondition: The queue is changed and the first
    //               element is removed from the queue.
     public void deleteQueue() throws QueueUnderflowException
     {
          if(isEmptyQueue())
             throw new QueueUnderflowException();

          queueFront = queueFront.link; //advance queueFront

          if(queueFront == null)  //if after deletion the queue is
             queueRear = null;  //empty, set queueRear to null
     } //end deleteQueue


    //Method to make a copy of otherQueue.
    //Postcondition: A copy of otherQueue is created and
    //               assigned to this queue.
    public void copyQueue(LinkedQueueClass otherQueue)
    {
        QueueNode newNode; //reference variable to create a node
        QueueNode current; //reference variable to traverse the list.

        queueFront = null;  //if queue is nonempty, make it empty
        queueRear = null;

        if(otherQueue.queueFront != null) //otherQueue is nonempty
        {
            current = otherQueue.queueFront;    //current points to the
                                            //queue to be copied

                    //copy the first element
            queueFront = new QueueNode();       //create the node
            queueFront.info = current.info.getCopy();   //copy the info
            queueFront.link = null;             //set the link field of
                                                //the node to null
            queueRear = queueFront;     
            current = current.link;     

                  //copy the remaining queue element
            while(current != null)
            {
                newNode = new QueueNode();
                newNode.info = current.info.getCopy();
                newNode.link = null;
                queueRear.link = newNode;
                queueRear = newNode;
                current = current.link;
             }//end while
        }
    }//end copyQueue
}