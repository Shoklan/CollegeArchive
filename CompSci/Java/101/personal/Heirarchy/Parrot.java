//**************************************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 101
//   Instructor: John Alampi
//   Class: Parrot.java
//   Due Date: XXX
//***************************************************************************************
//
//***************************************************************************************
//Import statements
/**   Parrot.java provides a subclass of Flying bird that models a Parrot.
 *    It provides a constructor and a definition of getCall().
 */
 
 class Parrot extends FlyingBird{
   public Parrot(String color){
      super(color, "fruit");
   }
   
   public String getCall(){
      return "Squawk!";
   }
}