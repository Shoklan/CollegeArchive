//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class IntElement
//           Due Date:  September 24, 2009
//
//************************************************
//****************************************************************
// The purpose of this program is to implement the class called
// IntElement.  
//****************************************************************


public class IntElement extends DataElement
{
   //-----------------------------------------
   //   CONSTANTS
   //-----------------------------------------


   //-----------------------------------------
   //   Instance Variables
   //-----------------------------------------
    protected int num;

      //default constructor
    public IntElement()
    {
        num = 0;
    }

      //constructor with a parameter
    public IntElement(int x)
    {
        num = x;
    }
      //copy constructor
    public IntElement(IntElement otherElement)
    {
        num = otherElement.num;
    }

      //Mutator Method to set the value of the instance variable num.
      //Postcondition: num = x;
    public void setNum(int x)
    {
        num = x;
    }

      //Accessor Method to return the value of the instance variable num.
      //Postcondition: The value of num is returned.
    public int getNum()
    {
        return num;
    }

    //Notice the casting of otherElement.
    public boolean equals(DataElement otherElement)
    {
        IntElement temp = (IntElement) otherElement;
        return (num == temp.num);
    }

    //Notice the casting of otherElement.
    public int compareTo(DataElement otherElement)
    {
        IntElement temp = (IntElement) otherElement;
        return (num - temp.num);
    }

    public void makeCopy(DataElement otherElement)
    {
        IntElement temp = (IntElement) otherElement;
        num = temp.num;
    }

    public DataElement getCopy()
    {
        IntElement temp = new IntElement(num);
        return temp;
    }

    public String toString()
    {
        return String.valueOf(num);
    }
}
