//***********************************************************************
//	Author: Collin Mitchell
//	Course: Computer Science 101
//	Instructor: John Alampi
//	Class: Cmitc22Doo.java
//	Due Date: March 17th, 2011
//***********************************************************************
//***********************************************************************
//	This program is the working portion of project 2. This class will
//	contain a constructor, three methods, two constants, and three
//	variables.
//***********************************************************************

public class Cmitc26Doo{
	//-------------------------------------------------------------------
	//	CONSTANTS
	//-------------------------------------------------------------------
	final double PRICE_PER_LB = 4.76;
	final double SALES_TAX = .0825;
	
	//-------------------------------------------------------------------
	//	Variables
	//-------------------------------------------------------------------
	double unitWeight;          //The wieght of the Dooflings in pounds
	double totalPrice;          //The total price of the Dooflings; without tax
	double totalPriceWithTax;   //The total price of the Dooflings; with tax
	int numberOfUnits;          //Number of Dooflings ordered
	
	//--------------------------------------------------------------------
	//	Default Constructor
	//--------------------------------------------------------------------
	public Cmitc26Doo(){
		System.out.println("Collin Mitchell - Project 2");
	}
	
	//--------------------------------------------------------------------
	//	Public Methods
	//--------------------------------------------------------------------
	public void start(){
		describeProgram();
	}
	
	//--------------------------------------------------------------------
	//	This method is called from the public method start() and it
	//	outputs the purpose of the program along with the formulas it uses
	//	to come up with its numbers.
	//--------------------------------------------------------------------
	private void describeProgram(){
		System.out.println("This program accepts the unit weight of a Doofling in pounds");
		System.out.println("and the number of Dooflings sold and displays the total price of the");
		System.out.println("sale, as computed as\n\n" +
								"totalPrice         = unitWeight * numberOfUnits * " + PRICE_PER_LB + ";\n" +
								"totalPriceWithTax      = totalPrice + totalPrice * " + SALES_TAX + ";\n\n" +
								"where " + PRICE_PER_LB + " is the PRICE_PER_POUND and " + SALES_TAX + 
								"is the SALES_TAX.\n\n\n");
	}
	
	
	}