//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class DoubleElement
//           Due Date:  September 24, 2009
//
//************************************************
//****************************************************************
// The purpose of this program is to implement the class called
// DoubleElement.  
//****************************************************************

public class DoubleElement extends DataElement
{
   //-----------------------------------------
   //   CONSTANTS
   //-----------------------------------------


   //-----------------------------------------
   //   Instance Variables
   //-----------------------------------------
    protected double num;

    public DoubleElement()
    {
        setNum (0.0);
    }

    public DoubleElement(double x)
    {
        setNum(x);
    }

    public DoubleElement(DoubleElement other)
    {
        num = other.num;
    }
    
    
    public boolean equals(DataElement otherElement)
    {
        DoubleElement temp = (DoubleElement) otherElement;

        return (num == temp.num);
    }

    public int compareTo(DataElement otherElement)
    {
        DoubleElement temp = (DoubleElement) otherElement;

        if(num < temp.num)
          return -1;
        else
           if(num > temp.num)
              return 1;
           else
              return 0;
    }
    
    public void setNum(double x)
    {
        num = x;
    }

    public double getNum()
    {
        return num;
    }

    public void makeCopy(DataElement otherElement)
    {
          DoubleElement temp = (DoubleElement) otherElement;

          num = temp.num;
    }

    public DataElement getCopy()
    {
        DoubleElement temp = new DoubleElement(num);
        return temp;
    }

    public String toString()
    {
        return String.valueOf(num);
    }
}

