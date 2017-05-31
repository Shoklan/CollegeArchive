//**************************************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 101
//   Instructor: John Alampi
//   Class: SnowOwl.java
//   Due Date: XXX
//***************************************************************************************
//
//***************************************************************************************
//Import statements
/**   SnowOwl.java provides a subclass of Owl that models the SnowOwl.
 *    It provides a constructor and a definition of getCall().
 */
 
 class SnowOwl extends Owl{
   public SnowOwl(){
      super("white");
   }
   
   public String getCall(){
      String call = "";
      int randomNumber = randomInt(4) + 1;
      
      for(int count = 1; count < randomNumber; count++)
         call += "Hoo";

      return call + "!";
   }
}