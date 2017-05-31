//**************************************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 101
//   Instructor: John Alampi
//   Class: WalkingBird.java
//   Due Date: XXX
//***************************************************************************************
//
//***************************************************************************************
//Import statements
/**   Walking Bird.java provides a subclass (abstract) of Bird to model
 *    walking birds. It's only method is a constructor. */
 
abstract class WalkingBird extends Bird{
   public WalkingBird(String color, String food){
      super(color, food, "walking");
   }
}
   