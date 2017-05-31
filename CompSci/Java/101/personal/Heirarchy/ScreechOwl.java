//**************************************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 101
//   Instructor: John Alampi
//   Class: ScreechOwl.java
//   Due Date: XXX
//***************************************************************************************
//
//***************************************************************************************
//Import statements
/**   ScreechOwl.java provides a subclass of Owl that models the ScreechOwl.
 *    It provides a constructor and a definition of getCall().
 */
 
 class ScreechOwl extends Owl{
   public ScreechOwl(){
      super("brown");
   }
   
   public String getCall(){
      return "Screeeeeeeeech!";
   }
}