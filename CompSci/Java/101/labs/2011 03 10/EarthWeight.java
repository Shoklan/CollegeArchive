//*****************************************************************
//    Name: Collin Mitchell
//    Course: CSC 101
//    Instructor: John Alampi
//    Lab: EarthWeight.java
//    Due Date: March 10th, 2011
//*****************************************************************
//*****************************************************************
//   This program will take a double [weight] from the user and
//   it will will tehn caluclate the weight for four other planets
//   [Mecrury, Venus, Saturn, Jupiter]. It will then output those
//   values to the user.
//*****************************************************************
import java.util.*;
import java.text.*;

class EarthWeight{
    //-------------------------------------------------------------
    //    CONSTANTS
    //-------------------------------------------------------------
    
    //-------------------------------------------------------------
    //    Variables
    //-------------------------------------------------------------
    
    public static void main(String [] args){
        //-------------------------------------------------------------
        //    CONSTANTS
        //-------------------------------------------------------------
        final double EARTH_TO_MERCURY = .04;
        final double EARTH_TO_VENUS = .9;
        final double EARTH_TO_JUPITER = 2.5;
        final double EARTH_TO_SATURN = 1.1;
        
        //-------------------------------------------------------------
        //    Variables
        //-------------------------------------------------------------
        Scanner scan = new Scanner(System.in);
        DecimalFormat trailingFour = new DecimalFormat(",###.####");
        
        double weight;      //wight on Earth
        double mercWeight;  //weight on Mecrcury
        double venWeight;   //weight on Venus
        double jupWeight;   //weight on Jupiter
        double satWeight;   //weight on Saturn
        String userInput;
        
        //-------------------------------------------------------------
        //    Ask for the user's weight and store the value
        //-------------------------------------------------------------
        System.out.print("Enter you weight on Earth (in lbs. e.g. 165.9): ");
        weight = Double.parseDouble(scan.next());
        
        //-------------------------------------------------------------
        //    Calculate the weights for all the planets
        //--------------------------------------------------------------
        mercWeight = weight * EARTH_TO_MERCURY;
        venWeight = weight * EARTH_TO_VENUS;
        jupWeight = weight * EARTH_TO_JUPITER;
        satWeight = weight * EARTH_TO_SATURN;
        
        //--------------------------------------------------------------
        //    Output the results
        //--------------------------------------------------------------
        System.out.println("\n");
        System.out.println("Input -\n  Weight on Earth: " + weight + " lbs.\n");
        System.out.println("Output -");
        System.out.println("  Weight on Mercury: " + trailingFour.format(mercWeight) + " lbs.");
        System.out.println("  Weight on Venus: " + trailingFour.format(venWeight) + " lbs.");
        System.out.println("  Weight on Jupiter: " + trailingFour.format(jupWeight) + " lbs.");
        System.out.println("  Weight on Saturn: " + trailingFour.format(satWeight) + " lbs.");
    }//end of main method
}//end of class EarthWeight