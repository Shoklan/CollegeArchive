//*************************************************************************************************
//   Author: Collin Mitchell
//   Course: CSC 101
//   Instructor: John Alampi
//   Class: CMitc4.java
//   Due Date: 9th May 2011
//*************************************************************************************************
//    This is the service class for CMitc4Driver.java. This class will figure out whether a number
//    is deficient, perfect or abundant. A number is deficient if its factors are less than the
//    number when added, perfect if its factors equal the number when added, or abundant when its
//    factors are greater than the number.
//*************************************************************************************************
import java.util.*;

class CMitc4
{
    //---------------------------------------------------------------------------------------------
    //    CLASS CONSTANTS
    //---------------------------------------------------------------------------------------------
    private final int MIN = 1;

    //---------------------------------------------------------------------------------------------
    //    Instance Variables
    //---------------------------------------------------------------------------------------------
    private int inputNum;

    //---------------------------------------------------------------------------------------------
    //    Default Constructor
    //---------------------------------------------------------------------------------------------
    public CMitc4()
    {
        System.out.println("Project 4 - Deficient, Perfect or Abundant Number and Proper Factors\n");
    }//end of Default Constructor

    //---------------------------------------------------------------------------------------------
    //    Public methods
    //---------------------------------------------------------------------------------------------
    //    This is a public method. This class will invoke 6 private methods.
    //---------------------------------------------------------------------------------------------
    public void start()
    {
        describeProgram();
        getInput();
        checkForPerfect();
    }

    //---------------------------------------------------------------------------------------------
    //    Private methods
    //---------------------------------------------------------------------------------------------
    //    This is a private method. This method will output text describing the program.
    //---------------------------------------------------------------------------------------------
    private void describeProgram()
    {
        System.out.println("Enter a number greater than 1 and this program");
        System.out.println("will tell you whether the number is deficient, perfect,");
        System.out.println("or abundant. The program will also output all of its");
        System.out.println("proper factors. The program also checks for valid");
        System.out.println("input and will keep asking the user for a valid number");
        System.out.println("greater than 1 until they enter a valid number.");
        System.out.println("\n");
        System.out.println("The program will also ask if the user wants to enter another \nnumber.");
        System.out.println("\n");
    }//end of private describeProgram method

    //----------------------------------------------------------------------------------------------
    //    This is a private method. This method will get input from the user. If the number is less
    //    than MIN, then the method will keep asking for valid input.
    //----------------------------------------------------------------------------------------------
    private void getInput()
    {
        Scanner scan = new Scanner(System.in);
        String userInput;
        inputNum = 0;
        
        do
        {
            System.out.print("Enter a number greater than " + MIN + ".  ");
            userInput = scan.next();
            if(checkInput(userInput))
                inputNum = Integer.parseInt(userInput);
            else
                inputNum = -1;
        }while(inputNum <= MIN);
    }//end of private method getInput

    //-----------------------------------------------------------------------------------------------
    //    This is a private method. This method will check the user's input for invalid characters.
    //-----------------------------------------------------------------------------------------------
    private boolean checkInput(String s)
    {
        String digits = "1234567890";                   
        boolean flag = true;
        
        for(int i = 0; i < s.length(); i++)
        {
            if(digits.indexOf(s.charAt(i)) == -1)
            {
                flag = false;
                break;
            }
        }
        
        return flag;
    }//end of private checkInput method

    //-----------------------------------------------------------------------------------------------
    //    This is a private method. This method will add up all the divisors for a number
    //-----------------------------------------------------------------------------------------------
    private int divisorSum(int number)
    {
        int sum = 0;
        for(int i = 1; i < number; i++)
            if(number % i == 0)
                sum += i;
        
        return sum;
    }//end of private method divisorSum

    //------------------------------------------------------------------------------------------------
    //    This is a private method. It will then output whether the number is deficient, perfect, or
    //    abundant.
    //------------------------------------------------------------------------------------------------
    private void checkForPerfect()
    {
        if(divisorSum(inputNum) < inputNum)
            System.out.println(inputNum + " is deficient.");
        if(divisorSum(inputNum) == inputNum)
            System.out.println(inputNum + " is perfect");
        if(divisorSum(inputNum) > inputNum)
            System.out.println(inputNum + " is abundant");
        printFactors(inputNum);
    }//end of private method checkForPerfect

    //---------------------------------------------------------------------------------------------------
    //    This is a private Method. This method will print all the factors of the number with a space.
    //---------------------------------------------------------------------------------------------------
    private void printFactors(int number)
    {
        System.out.print("\n" + "Its proper factors are:");
        for(int i = 1; i < number; i++)
            if(number % i == 0)
                System.out.print(" " + i);
    }//end of private method printFactors
}//end of class CMitc4