import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class CreditsFrame extends JFrame{
	
	public CreditsFrame(){
		
		setTitle("Credits");
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setContentPane(new JLabel(new ImageIcon("E:\\Computer Science\\- Final Project\\Frogger.png")));
		setSize(599,499);
		setSize(600,500);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}