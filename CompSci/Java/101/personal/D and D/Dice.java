/******************************************************************
|	Collin Mitchell
|	Dice.java
|	[################]
|	[ 14th April 2011]
|	| Completed      |
|	[################]
**/
import java.util.Random;

public class Dice{
	//|Instance Variables|
	private static final int MIN = 1;
	private int max = 0;
	
	//|Classes|
	private Random random = new Random();
	public Dice(){
		max = 6;
	}//end of Default Constructor
	
	public Dice(int max){
		this.max = max;
	}//end of Constructor with max
	
	public int roll(){
		return (random.nextInt(max - MIN + 1) + MIN);
	}//end of method roll
}//end of class Dice