//********************************************************************************
//   Name: Collin Mitchell
//   Course: Computer Science 103
//   Instructor: John Alampi
//   Class: Customer.java
//   Due Date: October 29th, 2009
//*********************************************************************************
//*********************************************************************************
//   This class is designed to act as a Customer in a Queue simulation
//   and uses the variables arrivalTime, serviceTime, and customerNumber.
//   This class has four methods, two constructors, and three instance variables
//*********************************************************************************

class Customer extends DataElement

{

   //---------------------------------------------------------
   //   Instance Variables
   //---------------------------------------------------------
   private int arrivalTime;
   private int serviceTime;
   private int customerNumber;

   //-----------------------------------------------------------
   //   Constructor
   //   Postcondition: this.arrivalTime = arrivalTime;
   //         this.serviceTime = serviceTime;
   //         this.customerNumber = customerNumber;
   //-----------------------------------------------------------
   public Customer()
   {
      arrivalTime = 0;  
      serviceTime = 0;
      customerNumber = 0;
   }//end of Constructor with Parameters



   //-----------------------------------------------------------   
   //   Constructor with Parameters   
   //   Postcondition: this.arrivalTime = arrivalTime;   
   //         this.serviceTime = serviceTime;   
   //         this.customerNumber = customerNumber;
   //-----------------------------------------------------------
   public Customer(int arrivalTime, int serviceTime, int customerNumber) 
   {
      this.arrivalTime = arrivalTime;  
      this.serviceTime = serviceTime;
      this.customerNumber = customerNumber;
   }//end of Constructor with Parameters


   //----------------------------------------------------------------------------
   //   Method to determine if two objects contains the same customerNumber
   //   Postcondtition: Returns true if this object contains the same customer
   //         number as the object otherElement; otherwise it returns
   //                  false otherwise.
   //-----------------------------------------------------------------------------

   public boolean equals(DataElement otherElement)
   {
      Customer temp = (Customer) otherElement;  
      return(this.customerNumber == temp.customerNumber);
   }//end of method equals

 
   //------------------------------------------------------------------------
   //   Method to compare two objects.
   //   Postcondition: Returns a value <0 if this element s customerNumber is
   //         less than otherElements customerNumber;
   //         Returns 0 if this elements customerNumber is same as
   //         otherElements customerNumber;
   //         Returns a value >0 if this element s customerNumber is
   //         greater than otherElements customerNumber;
   //-------------------------------------------------------------------------
   public int compareTo(DataElement otherElement)
   { 
      Customer temp = (Customer) otherElement;  
      return(customerNumber - temp.customerNumber);
   }//end of method compareTo

   //-------------------------------------------------------------------------
   //   Method to copy otherElement into this element.
   //   Postcondition: Data of otherElement is copied into this object data
   //-------------------------------------------------------------------------
   public void makeCopy(DataElement otherElement)
   {
      Customer temp = (Customer) otherElement;  
      customerNumber = temp.customerNumber;
      arrivalTime = temp.arrivalTime;
      serviceTime = temp.serviceTime;
   }//end of method makeCopy
   
   

   //----------------------------------------------------------------------------
   //   Method to return a copy of this object
   //   Postcodition: A copy of this object is created and a referene is returned.
   //----------------------------------------------------------------------------
   public DataElement getCopy()
   {
      Customer temp = new Customer();  
      temp.customerNumber = customerNumber;
      temp.arrivalTime = arrivalTime;
      temp.serviceTime = serviceTime;
      return temp;
   }//end of getCopy

   
   //------------------------------------------------------------------------------
   
   //   Method to return the value of arrivalTime
   
   //------------------------------------------------------------------------------
   
   public int getArrivalTime()
   
   {
      
      return arrivalTime;
   
   }//end of method getArrivalTime
   
   
   //------------------------------------------------------------------------------
   
   //   Method to return the value of arrivalTime
   
   //------------------------------------------------------------------------------
   
   public int getServiceTime()
   
   {
      
      return serviceTime;
   
   }//end of method getServiceTime

   //------------------------------------------------------------------------------
   
   //   Method to return the value of arrivalTime
   
   //------------------------------------------------------------------------------
   
   public int getCustomerNumber()
   
   {
      
      return customerNumber;
   
   }//end of method getCustomerNumber

}//end of Customer class