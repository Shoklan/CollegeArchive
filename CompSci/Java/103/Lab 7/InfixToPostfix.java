//************************************************
//           Name: Collin Mitchell
//           Course:  CSC 103
//           Instructor:  John Alampi
//           Lecture:  InfixToPostfix
//           Due Date:  October 22, 2009
//
//************************************************
//****************************************************************
// The purpose of this program is to implement the class called
// InfixToPostfix.
//****************************************************************


public class InfixToPostfix
{
   //-----------------------------------------
   //   CONSTANTS
   //-----------------------------------------


   //-----------------------------------------
   //   Instance Variables
   //-----------------------------------------
   private String ifx;    //String to hold the infix expression
   private String pfx;    //String to hold the Postfix expression

   //---------------------------------------------------------------------
   // Default Constructor
   // Postcondition: assigns infx to string ifx and then invokes method
   // convertToPostfix
   //---------------------------------------------------------------------
   public InfixToPostfix(String infx)
   {
		ifx = infx;
		convertToPostfix();
	}//end of Default Constructor

   //---------------------------------------------------------------------
   // getInfix method
   // Postcondition: assigns data to string ifx and then invokes method
   //                convertTOPostfix
   //---------------------------------------------------------------------
   public void getInfix(String data)
   {
	  ifx = data;
	  convertToPostfix();
   }//end of method getInfix

   //---------------------------------------------------------------------
   // Postcondition: Outputs te string ifx with the format
   //                "Infix Expression: " and then the string ifx
   //---------------------------------------------------------------------
   public void showInfix()
   {
	  System.out.println("Infix Expression: " + ifx);
   }//end of method showInfix

   //---------------------------------------------------------------------
   // Postcondition: Outputs the string pfx with the format
   //                "Postfix Expression: " and then the string pfx
   //---------------------------------------------------------------------
   public void showPostfix()
   {
	  System.out.println("Postfix Expression: " +pfx);
   }//end of method showPostfix

   //---------------------------------------------------------------------
   //Postcondition:   Builds the string pfx
   //---------------------------------------------------------------------
   public void convertToPostfix()
   {
      //-----------------------------------------
      //   Variables
      //-----------------------------------------
      int i = 0;
      StackClass stack = new StackClass(50);
      char stackOpr;
      CharElement temp;;
      stack.initializeStack();
      pfx = "";
      int len = ifx.length();

      for(i = 0; i < len; i++)
      if(ifx.charAt(i) >= 'A' && ifx.charAt(i) <= 'Z')
      {
         pfx = pfx + ifx.charAt(i);
      }
      else
      {
         switch(ifx.charAt(i))
         {
            case '(':  stack.push(new CharElement(ifx.charAt(i)));
               break;

            case ')':   temp = (CharElement)stack.peek();
               stackOpr = (char)temp.getChar();
               stack.pop();
         while(stackOpr != '(')
         {
            pfx = pfx + stackOpr;



            if(!stack.isEmptyStack())
            {
               temp = (CharElement)stack.peek();
               stackOpr = (char)temp.getChar();
               stack.pop();
            }
            else
               break;
         }
         break;
         case ';':
         case ' ':  break;

         default:
            if(stack.isEmptyStack())
            {
               stack.push(new CharElement(ifx.charAt(i)));
		   }
            else
            {
			   temp = (CharElement)stack.peek();
			   stackOpr = (char)temp.getChar();
               stack.pop();

               while(precedence(stackOpr, ifx.charAt(i)))
               {
				  pfx = pfx + stackOpr;
				  if(!stack.isEmptyStack())
				  {
				     temp = (CharElement)stack.peek();
					 stackOpr = (char)temp.getChar();
                     stack.pop();
				  }
				  else
				     break;
			   }

			   if(!precedence(stackOpr,ifx.charAt(i)))
			   {
			      stack.push(new CharElement(stackOpr));
			  }

			   stack.push(new CharElement(ifx.charAt(i)));

			}
         }
      }
      while(!stack.isEmptyStack())
      {
		 temp = (CharElement)stack.peek();

		 pfx += (char)temp.getChar();
		 stack.pop();
	 }
   }//end of method convetToPostfix

   //----------------------------------------------------------------------------
   // Postcondition: Determines if operators are of equal or greater precedence
   //                Returns true when opr1 is greater than or equal to opr2
   //                Otherwise returns false;
   //----------------------------------------------------------------------------
   public boolean precedence(char opr1, char opr2)
   {
	   int prec1;
	   int prec2;

	   prec1 = 0;
	   prec2 = 0;

		if(opr1 == '*' || opr1 == '/')
		{
			prec1 = 2;
		}
		else if(opr1 == '+' || opr1 == '-')
		{
	         prec1 = 1;
		}
		else if(opr1 == '(')
		{
			prec1 = 0;
		}

		if(opr2 == '*' || opr2 == '/')
		{
			prec2 = 2;
		}
		else
		{
			if(opr2 == '+' || opr2 == '-')
				prec2 = 1;
		}
	   return(prec1 >= prec2);

   }//end of method precedence


}




