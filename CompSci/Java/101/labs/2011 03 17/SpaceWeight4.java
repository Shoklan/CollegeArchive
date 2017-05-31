//*****************************************************************
//    Name: Collin Mitchell
//    Course: CSC 101
//    Instructor: John Alampi
//    Lab: SpaceWeight4.java
//    Due Date: March 17th, 2011
//*****************************************************************
//*****************************************************************
//   
//*****************************************************************
import java.util.*;

class SpaceWeight4{
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
		final double EARTH_TO_MERCURY = .04;
		final double EARTH_TO_VENUS = .9;
		final double EARTH_TO_JUPITER = 2.5;
		final double EARTH_TO_SATURN = 1.1;

		//-------------------------------------------------------------
		//    Variables
		//-------------------------------------------------------------
		double weightOnEarth;    //user weight on Earth
		double weightOnMecuray;  //user weight on Mercury
		double weightOnVenus;    //user weight on Venus
		double weightOnJupiter;  //user weight on Jupiter
		double weightOnSaturn;   //user weight on Saturn
		
		Scanner scan = new Scanner("System.in");
		
		System.out.println("Main method of the Planet Weight Converter\n");
		WeightConverter3 wConvert = new WeightConverter3(0.0);
	}
}