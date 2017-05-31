//***********************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 103
//   Instructor: John Alampi
//   Class: WaitLine
//   Due: November 12th, 2009
//**************************************************************************
//   The purpose of this class is to simulate the normal proceedures of
//   a waiting line. 
//**************************************************************************
import java.util.*;

class WaitLine
{
   //--------------------------------------------------------------------
   //   Instance Variables
   //--------------------------------------------------------------------
   private LinkedQueueClass line;
   private int numberOfArrivals;
   private int numberServed;
   private double totalTimeWaited;
   private double timeWaited;
   private int serviceTime;
   private double serviceTimeLeft;
   
   //--------------------------------------------------------------------------
   //   Default Constructor
   //   Postcondition: Instantiates line then invokes a method called reset
   //--------------------------------------------------------------------------
   public WaitLine()
   {
      line = new LinkedQueueClass();
      reset();
   }//end of Default Constructor
   
   //---------------------------------------------------------------------------
   //   Task: Initializes the simulation.
   //   Postcondition: Invokes the initializeQueue method on line.
   //         Initializes  instance variables numberOfArrivals = 0;
   //         numberServed = 0;
   //         totalTimeWaited = 0;
   //---------------------------------------------------------------------------
   public final void reset()
   {
      line.initializeQueue();
      numberOfArrivals = 0;
      numberServed = 0;
      totalTimeWaited = 0;
   }//end of method reset

   //------------------------------------------------------------------------------
   //   Task: Simulates a waiting line with one serving agent.
   //   Parameter duration the number of simulated minutes.
   //   Parameter arrivalProbability a real number between 0 and 1 that is
   //      the probability of a customer arriving at a given time.
   //   Parameter maxServiceTime the longest service time for a customer
   //------------------------------------------------------------------------------
   public void simulate(int duration, double arrivalProbability, int maxServiceTime)
   {
      for(int clock = 0; clock < duration; clock++)
      {
         if(Math.random() < arrivalProbability)
         {
            numberOfArrivals++;
            serviceTime = (int)(Math.random() * maxServiceTime + 1);
            Customer nextArrival = new Customer(clock, serviceTime, numberOfArrivals);
            line.addQueue(nextArrival);
            System.out.println("Customer " + numberOfArrivals
               + " enters line at time " + clock
               + ". Service time is " + serviceTime);
         }//end of if block
         if(serviceTimeLeft > 0)
            serviceTimeLeft--;
         else if(!line.isEmptyQueue())
         {
            Customer nextCustomer = (Customer)line.front();
            line.deleteQueue();
            serviceTimeLeft = nextCustomer.getServiceTime() - 1;
            timeWaited = clock - nextCustomer.getArrivalTime();
            totalTimeWaited = totalTimeWaited + timeWaited;
            numberServed++;
            System.out.println("Customer " + nextCustomer.getCustomerNumber() +
			" begins service at time at " + clock + ". Time waited is " + nextCustomer.getServiceTime());
         }//end if else if
      }//end of for loop
   }//end of method simulate
   
   //-----------------------------------------------------------------
   //   Task: Displays summary results of the simulation.
   //-----------------------------------------------------------------
   public void displayResults()
   {
      System.out.println();
      System.out.println("Number served = " + numberServed);
      System.out.println("Total time waited = " + (int)totalTimeWaited);
      System.out.println("Average time waited = " + totalTimeWaited / (double)numberServed);
      System.out.println("Number left in line = " + (numberOfArrivals - numberServed));
   }//end of method displayResults
}//end of class WaitLine
