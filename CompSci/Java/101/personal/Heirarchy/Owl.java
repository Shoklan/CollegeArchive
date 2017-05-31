//**************************************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 101
//   Instructor: John Alampi
//   Class: Owl.java
//   Due Date: XXX
//***************************************************************************************
//
//***************************************************************************************
//Import statements
/**   Owl.java provides a subclass of FlyingBird that models the owls.
 *    It's only method is a constructor constructor..
 */
 
 abstract class Owl extends FlyingBird{
   public Owl(String color){
      super(color, "mice");
   }
}