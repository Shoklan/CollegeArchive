//**********************************************************
//	Author: Collin Mitchell
//	Name: StaticTry.java
//	Purpose: To Teach
//	Date: September 21st, 2009
//**********************************************************

import java.lang.System.*;

class StaticTry
{
	public void StaticTry()
	{
	
		int i = 0;
		static int y = 0;
		
		for( ; i < 10; i++)
		{
			y = i;
			y++;
			System.out.println(y);
		}
		
		System.out.println(y);
	}
}