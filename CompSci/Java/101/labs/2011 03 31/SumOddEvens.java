//********************************************************************************
//    Author: Collin Mitchell
//    Course: Computer Science 101
//    Instructor: John Alampi
//    Class: SumOddEvens.java
//    Due Date: 31st March 2011
//********************************************************************************
//    
//********************************************************************************
import java.util.*;

class SumOddEvens
{
//------------------------------------------------------------------------
    //    CLASS CONSTANTS
    //------------------------------------------------------------------------
    
    //------------------------------------------------------------------------
    //    Instance Variables
    //------------------------------------------------------------------------
    
    //------------------------------------------------------------------------
    //    This is the main method
    //------------------------------------------------------------------------
    public static void main(String [] args)
    {
        //------------------------------------------------------------------------
        //    CONSTANTS
        //------------------------------------------------------------------------

        //------------------------------------------------------------------------
        //    Variables
        //------------------------------------------------------------------------
        int zeroCount = 0;
        int oddCount = 0;
        int evenCount = 0;
        int digit = 0;
        int value = 0;

        Scanner scan = new Scanner(System.in);

        //-------------------------------------------------------------------------
        //    Get input from the user.
        //-------------------------------------------------------------------------
        System.out.print("Enter an interger: ");
        value = Integer.parseInt(scan.next());
        System.out.println("\n");
        System.out.println("The value entered: " + value);
        
        //-------------------------------------------------------------------------
        //    Determine the number of even and odd integers in a number. Take the
        //    absolute value of the number first. Take the remainder of digit / value
        //    to get a digit and then determine if it is even of odd.
        //    If digit is even, increment evenCount; if it is odd, increment oddCount
        //    If digit is zero, increment zeroCount.
        //-------------------------------------------------------------------------
        value = Math.abs(value);
        
        if(value == 0)
            zeroCount++;
        else
        {
            while(value > 0)
            {
                digit = value % 10;
                if(digit == 0)
                    zeroCount++;
                else if(digit % 2 == 0)
                        evenCount++;
                else
                        oddCount++;
                
                value = value / 10;
            }
        }

        //--------------------------------------------------------------------------
        //    Output the results
        //--------------------------------------------------------------------------
        System.out.println("Output: Zero digits: " + zeroCount);
        System.out.println("        Even digits: " + evenCount);
        System.out.println("        Odd digits:  " + oddCount);
    }
}