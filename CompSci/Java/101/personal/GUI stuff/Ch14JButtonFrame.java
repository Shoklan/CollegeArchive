/*
|	Chapter 14 Sample Program: Display a frame with two buttons
|
|	File: Ch14JButtonFrame.java
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Ch14JButtonFrame extends JFrame{
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 100;
	private static final int FRAME_X_ORIGIN = 0;
	private static final int FRAME_Y_ORIGIN = 45;
	static double someTotal;
	
	private JButton ohJesusButton;
	private JButton herpaButton;
	private JButton thisIsSpartaButton;
	private JButton calculate;
	
	public static void main(String [] args){
		double loanAmount;
		double annualInterestRate;
		//double someTotal;
		int loanPeriod;
		String userInput;
		Ch14JButtonFrame frame = new Ch14JButtonFrame();
		frame.setVisible(true);
		
		userInput = JOptionPane.showInputDialog(frame, "Loan Amount (Dollars + Cents): ");
		loanAmount = Double.parseDouble(userInput);

		userInput = JOptionPane.showInputDialog(frame, "Annual Interest Rate(e.g. 9.5): ");
		annualInterestRate = Double.parseDouble(userInput);

		userInput = JOptionPane.showInputDialog(frame, "Loan Period - # of Years: ");
		loanPeriod = Integer.parseInt(userInput);
		
		someTotal = loanAmount * annualInterestRate * loanPeriod;
	}//end of main method
	
	public Ch14JButtonFrame(){
		Container contentPane = getContentPane();
		
		//set the frame properties
		setSize	   (FRAME_WIDTH, FRAME_HEIGHT);
		setResizable   (true);
		setTitle	  ("Program Nigga - Pult");
		setLocation    (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		contentPane.setBackground(Color.BLACK);
		
		//set the layout manager
		contentPane.setLayout(new FlowLayout());
		
		userInput = someTotal.toString();
		JButton calculate = new JButton(userInput);
		ButtonHandler handler = new ButtonHandler();
		calculate.addActionListener(handler);
		//ohJesusButton.addActionListener(handler);
		//herpaButton.addActionListener(handler);
		//thisIsSpartaButton.addActionListener(handler);
	/*class ButtonHandler implements ActionListener{
		public ButtonHandler(){
		}
	
		public void actionPerformed(ActionEvent evt){
			JButton clickedButton = (JButton) evt.getSource();
			JRootPane rootPane = clickedButton.getRootPane();
			Frame frame = (JFrame) rootPane.getParent();
			String buttonText = clickedButton.getText();
			frame.setTitle("You Clicked " + buttonText);
		}//end of actionHandler
	}//end of ActionListener
	*/
	
	//register 'Exit upon closing' as a default close operation
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}//end of class Ch14JButtonFrame
}//end of class Ch14JButtonFrame
	