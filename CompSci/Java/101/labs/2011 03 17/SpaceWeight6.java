//*****************************************************************
//    Name: Collin Mitchell
//    Course: CSC 101
//    Instructor: John Alampi
//    Lab: SpaceWeight6.java
//    Due Date: March 17th, 2011
//*****************************************************************
//*****************************************************************
//   This driver class will take the users weight on earth and
//   converts that weight to four other planets [Mercury, Venus,
//   Jupiter, Saturn]. It will then output the results to the user
//*****************************************************************
import java.util.*;
import java.text.*;

class SpaceWeight6{
    //-------------------------------------------------------------
    //    CLASS CONSTANTS
    //-------------------------------------------------------------

    //-------------------------------------------------------------
    //    Class Variables
    //-------------------------------------------------------------
    
    public static void main(String [] args){
        //-------------------------------------------------------------
        //    CONSTANTS
        //-------------------------------------------------------------
        final double EARTH_TO_MERCURY = .4;
        final double EARTH_TO_VENUS = .9;
        final double EARTH_TO_JUPITER = 2.5;
        final double EARTH_TO_SATURN = 1.1;

        //-------------------------------------------------------------
        //    Variables
        //-------------------------------------------------------------
        double weightOnEarth;    //user weight on Earth
        double weightOnMercury;  //user weight on Mercury
        double weightOnVenus;    //user weight on Venus
        double weightOnJupiter;  //user weight on Jupiter
        double weightOnSaturn;   //user weight on Saturn
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat fourDec = new DecimalFormat(",###.0000");
        
        System.out.println("Main method of the Planet Weight Converter\n\n");
        WeightConverter5 converter = new WeightConverter5(0.0);
        
        //----------------------------------------------------------------
        //    Get the user's weight on Earth
        //----------------------------------------------------------------
        System.out.println("Enter your weight on Earth (in lbs. E.g. 165.9): ");
        weightOnEarth = Double.parseDouble(scan.next());
        System.out.println("\n");
        
        //----------------------------------------------------------------
        //    Convert the user's weight to other planets
        //----------------------------------------------------------------
        converter.setFactor(EARTH_TO_MERCURY);
        weightOnMercury = converter.convert(weightOnEarth);
        
        converter.setFactor(EARTH_TO_VENUS);
        weightOnVenus = converter.convert(weightOnEarth);
        
        converter.setFactor(EARTH_TO_JUPITER);
        weightOnJupiter = converter.convert(weightOnEarth);
        
        converter.setFactor(EARTH_TO_SATURN);
        weightOnSaturn = converter.convert(weightOnEarth);
        
        
        //----------------------------------------------------------------
        //    Output the results
        //----------------------------------------------------------------
        System.out.println("Input - \n      Weight on Earth: " + weightOnEarth + " lbs. \n\n");
        System.out.println("Output - \n      Weight on Mercury:  " + fourDec.format(weightOnMercury) + " lbs. \n" +
                                       "      Weight on Venus:   " + fourDec.format(weightOnVenus) + " lbs. \n" +
                                       "      Weight on Jupiter: " + fourDec.format(weightOnJupiter) + " lbs. \n" +
                                       "      Weight on Saturn:  " + fourDec.format(weightOnSaturn) + " lbs. ");
    }//end of main method
}//end of class SpaceWeight6