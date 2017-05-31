//******************************************************
//	An applet that displays the text "I Love Java" 
//	and a rectangle around the text.
//******************************************************

import java.applet.*;
import java.awt.*;

public class MyFirstJavaApplet extends Applet
{
	public void paint(Graphics graphic)
	{
		graphic.drawString("I Love Java",70,70);
		graphic.drawRect(50,50,100,30);
    }

}