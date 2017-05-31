//**************************************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 101
//   Instructor: John Alampi
//   Class: Ostrich.java
//   Due Date: XXX
//***************************************************************************************
//
//***************************************************************************************
//Import statements
/**   Ostrich.java provides a subclass of Walking bird that models a Ostrich.
 *    It provides a constructor and a definition of getCall().
 */
 
 class Ostrich extends WalkingBird{
   public Ostrich(){
      super("brown", "grass");
   }
   
   public String getCall(){
      return "Neek-neek!";
   }
}