//************************************************
//           Name: John Alampi
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Homework:  Class BooleanElement
//           Due Date:  September 24, 2009
//
//************************************************
//****************************************************************
// The purpose of this program is to implement the class called
// BooleanElement.  
//****************************************************************
public class BooleanElement extends DataElement
{
   //-----------------------------------------
   //   CONSTANTS
   //-----------------------------------------


   //-----------------------------------------
   //   Instance Variables
   //-----------------------------------------
   private boolean flag;

    public BooleanElement()
    {
        flag = false;
    }

    public BooleanElement(boolean f)
    {
        flag = f;
    }

    public boolean get()
    {
        return flag;
    }

    public void set(boolean f)
    {
        flag = f;
    }
    
    public boolean equals(DataElement otherElement)
    {
        BooleanElement temp = (BooleanElement) otherElement;

        return (flag == temp.flag);
    }

    public int compareTo(DataElement otherElement)
    {
        BooleanElement temp = (BooleanElement) otherElement;

        if(flag == temp.flag)
            return 0;
        else
          if(flag == true)
             return -1;
          else
             return 1;
    }

    public void makeCopy(DataElement otherElement)
    {
          BooleanElement temp = (BooleanElement) otherElement;

          flag = temp.flag;
    }

    public DataElement getCopy()
    {
        BooleanElement temp = new BooleanElement(flag);
        
        return temp;
    }

    public String toString()
    {
        return (String.valueOf(flag));
    }
}
