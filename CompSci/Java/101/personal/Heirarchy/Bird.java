//**************************************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 101
//   Instructor: John Alampi
//   Class: Birds.java
//   Due Date: XXX
//***************************************************************************************
//
//***************************************************************************************
//Import statements
import java.util.Random;
abstract class Bird extends Object{  //Definition of an abstract class
   /** Bird constructor
    *  Receive:         Strings color, food, and movement
    *  Postcondition:   A Bird object is constructed with myColor == color
    *                      && myFood == food && myMovement == movement
    *
    */
    //--- Attribute variables ---
    private String myColor, myFood, myMovement;
    private static Random myRandom = new Random();
    
    public Bird(String color, String food, String movement){
      myColor = color;
      myFood = food;
      myMovement = movement;
   }
   
   //--- Accessors ---
   /**   Color Accessor
    *    Return: myColor */
    public String getColor(){
      return myColor;
   }
   
   /**   Food Accessor
    *    Return: myFood */
   public String getFood(){
      return myFood;
   }
   
   /**   Movement Accessor
    *    Return: myMovement */
   public String getMovement(){
      return myMovement;
   }
   
   /**   (Abstract) Call Accessor
    *    Return: myMovement
    *    Definition supplied by subclasses */
    abstract String getCall();
    
    //---   Output Method  ---
    /**  toString converter
     *   Return: a String representation of a Bird's attributes */

   public String toString(){              //Output my attributes:
      return "a " + getColor()            // color
         + " " + getClass().getName()     // name
         + " " + getMovement()            // movement
         + " by hunting " + getFood()     // food
         + ", \n calling " + getCall();   // call
   }
   
   //--- Random number generator ---
   /**   Static random integer generator
    *    Recieve: int upperBound
    *    Return: a random int from the range 0..upperBound - 1 */
   protected static int randomInt(int upperBound){
      return myRandom.nextInt(upperBound);
   }
}//end 
