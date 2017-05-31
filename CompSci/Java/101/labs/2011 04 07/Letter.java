//********************************************************************
//    Author: Collin Mitchell
//    Course: Computer Science 101
//    Instructor: John Alampi
//    Lab: Letter.java
//    Due Date: 7th April 2011
//********************************************************************
//    This program will determine whether the userInput is a string or
//    letters.
//********************************************************************
import java.util.*;
class Letter
{
    //----------------------------------------------------------------
    //    CLASS CONSTANTS
    //----------------------------------------------------------------
    
    //----------------------------------------------------------------
    //    Instance Variables
    //----------------------------------------------------------------
    
    //----------------------------------------------------------------
    //    This is the main method
    //----------------------------------------------------------------
    public static void main(String [] args)
    {
        //------------------------------------------------------------
        //    CONSTANTS
        //------------------------------------------------------------
        
        //------------------------------------------------------------
        //    Variables
        //------------------------------------------------------------
        String STOP = "-1";
        String s = "abcdefghijklmnopqrstuvwxyz";
        String userInput;
        char c;
        int loc;
        boolean flag = true;
        
        Scanner scan = new Scanner(System.in);

        //------------------------------------------------------------------
        //    Get input from the user
        //------------------------------------------------------------------
        System.out.print("Press a key from the keyboard or -1 to quit:  ");
        userInput = scan.next();

        //------------------------------------------------------------------
        //    Check if the input is letters
        //------------------------------------------------------------------?
        while(userInput.equals(STOP) == false)
        {
        String lc = userInput.toLowerCase();
        for(int n = 0; n < userInput.length(); n++)
        {
            c = lc.charAt(n);
            loc = s.indexOf(c);
            if(loc == -1)
            {
                n = userInput.length() + 1006;
                flag = false;
            }
        }

        //----------------------------------------------------------------------------
        //    Print whether the input was determined to be letter or not
        //----------------------------------------------------------------------------
        if(flag == true)
            System.out.println("The key(s) entered " + userInput + " are letter(s).");
        else
            System.out.println("The keys entered " + userInput + " are not letter(s).");

        //-------------------------------------------------------------------------------
        //    Reprompt for userinput
        //-------------------------------------------------------------------------------
        System.out.println();
        System.out.println("Press a key from the keyboard or -1 to quit: ");
        userInput = scan.next();
        flag = true;
        }
    }//end of main method
}//end of class Letter