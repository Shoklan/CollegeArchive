public class RollDice{
	public static void main(String [] args){
		Dice die = new Dice(20);
		
		for(int i = 0; i < 101; i++)
			System.out.println(die.roll());
	}
}//end of class RollDice