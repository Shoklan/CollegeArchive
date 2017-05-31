//***************************************************************************
//		Author: Collin Micthell
//		Course: CSC 103
//		Instructor: John Alampi
//		Lab: Towers.java
//		Due Date: October 8th, 2009
//***************************************************************************
//***************************************************************************
//		The purpose of this program is to implement the solution to the Towers
//		of Hanoi game.
//***************************************************************************

public class Towers
{
	
	//------------------------------------------------------------------------
	//	Class VAriables
	//------------------------------------------------------------------------
	
	static int nDisks = 4;
	
	public static void main(String[] args)
	{
		solveTowers(nDisks, '1', '2', '3');
	}
	
	public static void solveTowers(int numberOfDisks, char startPole, char tempPole, char endPole)
	{
		if(numberOfDisks == 1)
			System.out.println("Move disk 1 from pole " + startPole + " to pole " + endPole+ ".");
		else
			{
				solveTowers(numberOfDisks-1, startPole, endPole, tempPole);
				System.out.println("Move disk " + numberOfDisks + " from pole " + startPole + " to pole " + endPole + ".");
				solveTowers(numberOfDisks-1, tempPole, startPole, endPole);
			}
	}
}

//System.err.println("THERE IS NO WAFFLES HERE SINBAD!1!");