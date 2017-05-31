//*************************************************************************************************
//   Author: Collin Mitchell
//   Course: CSC 101
//   Instructor: John Alampi
//   Class: ConvertToAddress.java
//   Due Date: 14th May 2011
//*************************************************************************************************
//    This is the service class for the program CallConvert. It will take an address string from the
//    user and output the string in an address format.
//*************************************************************************************************
import java.util.*;

class ConvertToAddress
{
    //---------------------------------------------------------------------------------------------
    //    CLASS CONSTANTS
    //---------------------------------------------------------------------------------------------
    
    //---------------------------------------------------------------------------------------------
    //    Instance Variables
    //---------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------
        //    This is a public method. It will output all the tokens.
        //--------------------------------------------------------------------
        public void convert(String s)
        {
            int tokenNum = 0;
            String lineSeparator = ":";
            StringTokenizer words = new StringTokenizer(s, lineSeparator);
            
            while(words.hasMoreTokens()){
                if(tokenNum < 2)
                    System.out.println(words.nextToken());
                if(tokenNum == 2)
                    System.out.print(words.nextToken() + ", ");
                if(tokenNum == 3)
                    System.out.print(words.nextToken() + ", ");
                if(tokenNum == 4)
                    System.out.println(words.nextToken());
                tokenNum++;
            }
        }//end of public method convert
}