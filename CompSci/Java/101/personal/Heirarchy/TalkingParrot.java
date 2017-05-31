//**************************************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 101
//   Instructor: John Alampi
//   Class: TalkingParrot.java
//   Due Date: XXX
//***************************************************************************************
//
//***************************************************************************************
//Import statements
/**   TalkingParrot.java provides a subclass of Parrot that models a talking parrot.
 *    It attributes variable is an array that stores the phrases it can speak. It
 *    provides a constructor and a a definition of getCall().
 */
 
 class TalkingParrot extends Parrot{
 
   private String [] myPhrases;

   public TalkingParrot(String color, String[] phrases){
      super(color);
      myPhrases = phrases;
   }
   
   public String getCall(){
      int randomIndex = randomInt(myPhrases.length);
      return myPhrases[randomIndex];
   }
}