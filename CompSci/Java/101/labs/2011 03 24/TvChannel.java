//*************************************************************************
//   Author: Collin Mitchell
//   Course: CSC 101
//   Instructor: John Alampi
//   Class: TvChannel.java
//   Due Date: March 24th, 2011
//*************************************************************************
//    This program will take input from the user and output the channel
//    broadcast station associated with the channel number.
//*************************************************************************
import java.util.*;
class TvChannel
{
    //---------------------------------------------------------------------
    //    THis is the main method
    //---------------------------------------------------------------------
    public static void main(String [] args)
    {
        //------------------------------------------------------------------
        //    CONSTANTS
        //------------------------------------------------------------------
        
        //------------------------------------------------------------------
        //    Variable
        //------------------------------------------------------------------
        Scanner scan = new Scanner(System.in);
        int channel = 0;

        //------------------------------------------------------------------
        //    Get input from the user.
        //------------------------------------------------------------------
        System.out.print("Please enter a TV Channel number: ");
        channel = Integer.parseInt(scan.next());

        //------------------------------------------------------------------
        //    Select the channel from the user input and output the channel
        //    label.
        //------------------------------------------------------------------
        switch(channel)
        {
            case 2: System.out.println(channel + ": WCBS");
                    break;
            case 4: System.out.println(channel + ": SNBC");
                    break;
            case 5: System.out.println(channel + ": WNEW");
                    break;
            case 7: System.out.println(channel + ": WABC");
                    break;
            case 9: System.out.println(channel + ": WOR");
                    break;
            case 11: System.out.println(channel + ": WPIX");
                    break;
            case 13: System.out.println(channel + ": WNET");
                    break;
            default: System.out.println(channel + " Not Available");
        }//end of switch statement
    }//end of main method
}//end of class TvChannel