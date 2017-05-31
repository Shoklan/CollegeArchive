import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonHandler implements ActionListener{
	public ButtonHandler(){
	}
	
	public void actionPerformed(ActionEvent evt){
		JButton clickedButton = (JButton) evt.getSource();
		JRootPane rootPane = clickedButton.getRootPane();
		Frame frame = (JFrame) rootPane.getParent();
		String buttonText = clickedButton.getText();
		JOptionPane.showMessageDialog(frame, buttonText);
	}//end of actionHandler
}//end of ActionListener