//**************************************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 101
//   Instructor: John Alampi
//   Class: Goose.java
//   Due Date: XXX
//***************************************************************************************
//
//***************************************************************************************
//Import statements
/**   Goose.java provides a subclass of Walking bird that models a goose.
 *    It provides a constructor and a definition of getCall().
 */
 
 class Goose extends WalkingBird{
   public Goose(){
      super("grey", "bugs");
   }
   
   public String getCall(){
      return "Honk!";
   }
}