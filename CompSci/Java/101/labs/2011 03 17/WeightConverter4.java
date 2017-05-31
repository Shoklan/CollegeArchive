//*****************************************************************
//    Name: Collin Mitchell
//    Course: CSC 101
//    Instructor: John Alampi
//    Lab: SpaceWeight.java
//    Due Date: March 17th, 2011
//*****************************************************************
//*****************************************************************
//
//*****************************************************************

public class WeightConverter4{
	//-------------------------------------------------------------
	//    CLASS CONSTANTS
	//-------------------------------------------------------------

	//-------------------------------------------------------------
	//    Instance Variables
	//-------------------------------------------------------------
	private double conversionFactor;
	
	//-------------------------------------------------------------
	//	This is the constructor with parameters
	//-------------------------------------------------------------
	public WeightConverter4(double factor){
		System.out.println("Collin Mitchell - We have entered the Constructor");
		setFactor(factor);
	}
	
	//-------------------------------------------------------------
	//	Public Methods:
	//		double convert    ( double )
	//		double setFactor  ( double )
	//-------------------------------------------------------------
	public void setFactor(double factor){
		conversionFactor = factor;
	}
	
	//public double convert()
}