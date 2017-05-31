//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class FloatElement
//           Due Date:  September 24, 2009
//
//************************************************
//****************************************************************
// The purpose of this program is to implement the class called
// FloatElement.  
//****************************************************************

public class FloatElement extends DataElement 
{     
   //-----------------------------------------
   //   CONSTANTS
   //-----------------------------------------


   //-----------------------------------------
   //   Instance Variables
   //-----------------------------------------
    protected float num; 
    
    //default constructor     
    public FloatElement()
    {
        num = 0;
    }

    //constructor with a parameter
    public FloatElement(float x)
    {
        num = x;
    }

    //copy constructor
    public FloatElement(FloatElement otherElement)
    {
        num = otherElement.num;
    }

    //Method to set the value of the instance variable num.
    //Postcondition: num = x.
    public void setNum(float x)
    {
        num = x;
    }

    //Method to return the value of the instance variable num.
    //Postcondition: The value of num is returned.
    public float getNum()
    {
        return num;
    }

    public boolean equals(DataElement otherElement)
    {
        FloatElement temp = (FloatElement) otherElement;

        return (num == temp.num);
    }

    public int compareTo(DataElement otherElement)
    {
        FloatElement temp = (FloatElement) otherElement;

        if(num < temp.num)
           return -1;
        else
           if(num == temp.num)
              return 0;
           else
              return 1;
    }

    public void makeCopy(DataElement otherElement)
    {
        FloatElement temp = (FloatElement) otherElement;

        num = temp.num;
    }

    public DataElement getCopy()
    {
        FloatElement temp = new FloatElement(num);
        return temp;
    }

    public String toString()
    {
        return String.valueOf(num);
    }
}
