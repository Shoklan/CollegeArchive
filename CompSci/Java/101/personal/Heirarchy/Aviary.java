//**************************************************************************************
//   Author: Collin Mitchell
//   Course: Computer Science 101
//   Instructor: John Alampi
//   Class: Aviary.java
//   Due Date: 
//***************************************************************************************
// Aviary.java simulates a bird park.
// Output: A welcome message followed by the birds seen and heard
// on a simulated walk through the aviary.
//***************************************************************************************
//Import statements
import ann.util.Controller;
import java.util.Random;

class  Aviary extends Object{
   public static void main(String [] args){
      String [] parrotPhrases = {"Polly wanna cracker!",
                                 "Pieces of either! Pieces of eight!",
                                 "You're a pretty boy!",
                                 "I wonder if this thing can talk?"};
      Bird [] birdArray = {new Ostrich(),
                           new Goose(),
                           new Parrot("green"),
                           new TalkingParrot("red", parrotPhrases),
                           new ScreechOwl(),
                           new SnowOwl()
                           };
      Random aRandom = new Random();
      int randomIndex, randomTime;
      Bird aBird = null;
      System.out.println("Welcome to the Aviary!\n (type Ctrl-c to quit).");
      for(;;){
         randomTime = aRandom.nextInt(10) + 1;              //pause from
         Controller.pause(randomTime);                      //1..10 secs
         
         randomIndex = aRandom.nextInt(birdARray.length);   //select a random bird
         aBird = birdArray[randomIndex];
         
         System.out.println("\nThere's " + aBird);          //display it
      }
   }
}