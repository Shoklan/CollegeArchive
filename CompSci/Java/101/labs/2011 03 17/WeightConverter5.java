//*****************************************************************
//    Name: Collin Mitchell
//    Course: CSC 101
//    Instructor: John Alampi
//    Lab: WeightConverter5.java
//    Due Date: March 17th, 2011
//*****************************************************************
//*****************************************************************
//    This service class will is used in conjunction with the
//    SpaceWeight6.java class. It's job is to convert the user weight
//    from the conversion factor for a planet.
//*****************************************************************

public class WeightConverter5{
    //-------------------------------------------------------------
    //    CLASS CONSTANTS
    //-------------------------------------------------------------

    //-------------------------------------------------------------
    //    Instance Variables
    //-------------------------------------------------------------
    private double conversionFactor;
    
    //-------------------------------------------------------------
    //    This is the constructor with parameters
    //-------------------------------------------------------------
    public WeightConverter5(double factor){
        System.out.println("Collin Mitchell - We have entered the Constructor \n\n");
        setFactor(factor);
    }
    
    //-------------------------------------------------------------
    //    Public Methods:
    //        double convert    ( double )
    //        double setFactor  ( double )
    //-------------------------------------------------------------
    //-------------------------------------------------------------
    //    This public nmethod takes input [factor] and sets the
    //    conversionFactor variable to factor
    //-------------------------------------------------------------
    public void setFactor(double factor){
        conversionFactor = factor;
    }//end of method setFactor
    
    //-------------------------------------------------------------
    //    This public method takes input [earthWeight], mutiplies it
    //    by the stored conversionFactor, and then returns the result
    //-------------------------------------------------------------
    public double convert(double earthWeight){
        return earthWeight * conversionFactor;
    }//end of method convert
}//end of class weightConverter