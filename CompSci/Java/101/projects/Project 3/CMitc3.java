//***********************************************************************************************************************
//   Author: Collin Mitchell
//   Course: CSC 101
//   Instructor: John Alampi
//   Class: CMitc3.java
//   Due Date: April 7th, 2011
//***********************************************************************************************************************
//***********************************************************************************************************************
//    This class is the service class for CMitc3Driver. This class will
//    actually play the game, manage the comparisons, and keep a record of
//    wins, losses, and ties by the user.
//***********************************************************************************************************************
import java.util.*;
import java.text.*;

public class CMitc3
{
    //-------------------------------------------------------------------------------------------------------------------
    //    CLASS CONSTANTS
    //-------------------------------------------------------------------------------------------------------------------
    private final int ROCK = 1;
    private final int PAPER = 2;
    private final int SCISSORS = 3;
    private final int OPTIONS = 3;
    private final int COMPUTER = 1;
    private final int PLAYER = 2;
    private final int TIE = 3;
    
    //-------------------------------------------------------------------------------------------------------------------
    //    Instance Variables
    //-------------------------------------------------------------------------------------------------------------------
    private int playerChoice = 0; //user input
    private int computerChoice;   //compuers input
    private int winner = -1;      //hold the winner
    private int wins = 0;         //number of player wins
    private int losses = 0;       //number of player losses
    private int ties = 0;         //number of player ties
    private String again = "y";   //string for repetition
    
    //-------------------------------------------------------------------------------------------------------------------
    //    This is the default constructor.
    //-------------------------------------------------------------------------------------------------------------------
    public CMitc3()
    {
        System.out.println("Project 3 - Rock, Paper, Scissors Game\n");
    }//end of defualt constuctor

    //-------------------------------------------------------------------------------------------------------------------
    //    Public methods
    //-------------------------------------------------------------------------------------------------------------------
    //    This method is a public method. It will call all of the private
    //    methods from this one point.
    //-------------------------------------------------------------------------------------------------------------------
    public void start()
    {
        describeProgram();

        do{
            computerChoice = (int)(Math.random() * OPTIONS + ROCK);
            getInput();
            getWinner(playerChoice, computerChoice);
            displayWinner(winner);
            getAgain();
        }while(again.toUpperCase().equals("Y"));

        displayResults();
    }//end of public method start

    //-------------------------------------------------------------------------------------------------------------------
    //    Private methods
    //-------------------------------------------------------------------------------------------------------------------
    //    This is a private method. This method will output text describing
    //    the program to the user followed by two blank lines
    //-------------------------------------------------------------------------------------------------------------------
    private void describeProgram()
    {
        System.out.println("The program asks the user for an Integer Number from " + ROCK + " to " + OPTIONS + ". The");
        System.out.println("program will then generate the computers random number from " + ROCK + " to " + OPTIONS);
        System.out.println("inclusive. Using the user input the program will determine who won");
        System.out.println("based on the rules of the Rock, Paper, Scissors game. The program");
        System.out.println("keeps a running total of how many games the use won, lost or tied.");
        System.out.println("The program also checks to ensure that the data entered is correct.");
        System.out.println("\n");
    }//end of private method describeProgram

    //-------------------------------------------------------------------------------------------------------------------
    //    This is a private method. This method gets input from the user.
    //    It will also loop until valid input arrives from the user.
    //-------------------------------------------------------------------------------------------------------------------
    private void getInput()
    {
        Scanner scan = new Scanner(System.in);
        playerChoice = 0;  //playerChoice from last run is overwritten || unimportant first time running
        
        while(playerChoice < ROCK || playerChoice > OPTIONS){
            System.out.print("Enter your choice - (" + ROCK + " for Rock, " + PAPER + " for paper, and " + SCISSORS + " for Scissors)? ");
            String userInput = scan.next();
            if(checkInput(userInput) == true)
                playerChoice = Integer.parseInt(userInput);
            else
                playerChoice = 0;
        }//end of while loop
        
        System.out.println();
    }//end of private method getInput

    //-------------------------------------------------------------------------------------------------------------------
    //    This is a private method. This method will determine who wins.
    //-------------------------------------------------------------------------------------------------------------------
    private void getWinner(int p, int c)
    {
        switch(c){
            case ROCK: System.out.println("The computers choice was Rock");
                        if(p == ROCK)
                            winner = TIE;
                        else if(p == PAPER)
                            winner = PLAYER;
                        else
                            winner = COMPUTER;
                        break;
            case PAPER: System.out.println("The computers choice was Paper");
                        if(p == ROCK)
                            winner = COMPUTER;
                        else if(p == PAPER)
                            winner = TIE;
                        else
                            winner = PLAYER;
                        break;
            case SCISSORS: System.out.println("The computers choice was Scissors");
                        if(p == ROCK)
                            winner = PLAYER;
                        else if(p == PAPER)
                            winner = COMPUTER;
                        else
                            winner = TIE;
                        break;
        }//end of switch statement
    }//end of private method getWinner

    //-------------------------------------------------------------------------------------------------------------------
    //    This is a private method. This method will output who won and then
    //    increment wins, losses, or tied respectivley.
    //-------------------------------------------------------------------------------------------------------------------
    private void displayWinner(int w)
    {
        if(w == PLAYER){
            System.out.println("You win\n");
            wins++;
        }
        else if(w == COMPUTER){
            System.out.println("I win!\n");
            losses++;
        }
        else{
            System.out.println("We tied!\n");
            ties++;
        }
    }//end of private method displayWinner

    //-------------------------------------------------------------------------------------------------------------------
    //    This is a private method. This method will ask the user if they
    //    would like to play again.
    //-------------------------------------------------------------------------------------------------------------------
    private void getAgain()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Play again?  (Y for yes, or N for no)");
        again = scan.next().substring(0,1);
        System.out.println("\n");
    }//end of private method getAgain

    //-------------------------------------------------------------------------------------------------------------------
    //    This is a private method. It will display the overall results to
    //    the user.
    //-------------------------------------------------------------------------------------------------------------------
    private void displayResults()
    {
        DecimalFormat percent = new DecimalFormat("00.00%");
        double winPercent = (double)wins / (wins + losses + ties);
        System.out.println("You won " + wins + " times.");
        System.out.println("You lost " + losses + " times");
        System.out.println("We tied " + ties + " times.");
        System.out.println("Your winning percentage is " + percent.format(winPercent) + ".");
    }//end of private method displayResults
    
    //-------------------------------------------------------------------------------------------------------------------
    //    This is a private method. It will check to make sure all characters are valid. If an
    //    invalid character is found, it will flag the input as false and immediately break.
    //-------------------------------------------------------------------------------------------------------------------
    private boolean checkInput(String input)
    {
        String digits = "-123";                          //"-123" are the only valid characters
        boolean flag = false;
        
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == digits.charAt(0))      //character at i is -
                flag = true;
            else if(input.charAt(i) == digits.charAt(1)) //character at i is 1
                flag = true;
            else if(input.charAt(i) == digits.charAt(2)) //character at i is 2
                flag = true;
            else if(input.charAt(i) == digits.charAt(3)) //character at i is 3
                flag = true;
            else{
                flag = false;                           //character is something else
                break;                                  //break out of loop at false
            }
        }//end of for loop
        
        return flag;
    }//end of private method checkInput
}//end of class 