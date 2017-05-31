//**************************************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 101
//   Instructor: John Alampi
//   Class: FlyingBird.java
//   Due Date: XXX
//***************************************************************************************
//
//***************************************************************************************
//Import statements
/**   FlyingBird.java provides a subclass (abstract) of Bird to model
 *    flying birds. It's only method is a constructor. */
 
abstract class FlyingBird extends Bird{
   public FlyingBird(String color, String food){
      super(color, food, "flying");
   }
}
   